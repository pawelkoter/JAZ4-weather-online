package domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherData implements IWeather{

    private MainWeather main;
    private Wind wind;
    private Clouds clouds;
    private String name;

    @Override
    public String getCity() {
        return name;
    }

    @Override
    public BigDecimal getTemperature() {
        return BigDecimal.valueOf( main.getTemp() ).setScale( 1, BigDecimal.ROUND_HALF_UP );
    }

    @Override
    public int getCloudiness() {
        return clouds.getAll();
    }

    @Override
    public int getPressure() {
        return main.getPressure();
    }

    @Override
    public BigDecimal getWindSpeed() {
        return BigDecimal.valueOf( wind.getSpeed() ).setScale( 1, BigDecimal.ROUND_HALF_UP ) ;
    }

    public void setMain( MainWeather main ) {
        this.main = main;
    }

    public void setWind( Wind wind ) {
        this.wind = wind;
    }

    public void setClouds( Clouds clouds ) {
        this.clouds = clouds;
    }

    public void setName( String cityName ) {
        this.name = cityName;
    }
}
