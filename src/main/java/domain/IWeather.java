package domain;

import java.math.BigDecimal;

public interface IWeather {
    String getCity();
    BigDecimal getTemperature();
    int getCloudiness();
    int getPressure();
    BigDecimal getWindSpeed();
}