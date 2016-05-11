package web;

import domain.IWeather;
import service.WeatherApiService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/weather")
public class WeatherServlet extends HttpServlet {

    private WeatherApiService weatherService;

    @Override
    public void init() throws ServletException {
        weatherService = new WeatherApiService( "6b8e468145e7c5e5f99b5e7d0c5dfc0a" );
    }

    @Override
    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {

        String cityId = request.getParameter( "cityId" );
        int id = Integer.parseInt( cityId );

        try {
            IWeather weather = weatherService.getCurrentWeather( id );
            request.setAttribute( "weather", weather );
            String forward = "/WEB-INF/weather.jsp";
            request.getRequestDispatcher( forward ).forward( request, response );
        } catch ( IOException ex ) {
            response.getWriter().print( "Nie udało się odczytać pogody" );
        }
    }
}