package com.exadel.sandbox.dto;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Component
public class CountryDto {

    private String name;

    private Set<SimpleCityDto> cities;
}
