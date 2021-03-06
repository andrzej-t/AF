package com.example.af.domain;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Activity {
    private Long id;
    private String name;
    private String description;
    private Integer minTime;
    private Integer maxTime;
    private Boolean onePerson;
    private Boolean twoPeople;
    private Boolean morePeople;
    private Boolean outdoor;
    private Boolean indoor;
    private Boolean summer;
    private Boolean winter;
    private Boolean inCar;
    private Boolean educational;
    private Boolean art;
    private Boolean motion;
    private Boolean favourite;
}
