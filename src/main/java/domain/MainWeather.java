package domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class MainWeather {
    private double temp;
    private int pressure;

    public double getTemp() {
        return temp;
    }

    public void setTemp( double temp ) {
        this.temp = temp;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure( int pressure ) {
        this.pressure = pressure;
    }
}