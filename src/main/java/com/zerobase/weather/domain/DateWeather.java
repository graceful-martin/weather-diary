package com.zerobase.weather.domain;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "date_weather")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DateWeather {
    @Id
    private LocalDate date;
    private String weather;
    private String icon;
    private double temperature;

}
