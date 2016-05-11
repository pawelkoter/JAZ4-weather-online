package service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import domain.IWeather;
import domain.WeatherData;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class WeatherApiService {

    private String apiKey;

    public WeatherApiService( String apiKey ) {
        this.apiKey = apiKey;
    }

    public IWeather getCurrentWeather( int cityId ) throws IOException {
        String apiKey = "6b8e468145e7c5e5f99b5e7d0c5dfc0a";
        String url = "http://api.openweathermap.org/data/2.5/weather";

        Client client = Client.create();

        WebResource resource = client.resource( url );

        String response = resource
                .queryParam( "units", "metric" )
                .queryParam( "id", Integer.toString( cityId ) )
                .queryParam( "appid", apiKey )
                .get( String.class );

        ObjectMapper mapper = new ObjectMapper(  );
        IWeather weather = mapper.readValue( response, WeatherData.class );

        return weather;
    }

}
