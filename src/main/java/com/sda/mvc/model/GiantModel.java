package com.sda.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class GiantModel {

    Health health;
    Fatigue fatigue;
    Nourishment nourishment;
}
