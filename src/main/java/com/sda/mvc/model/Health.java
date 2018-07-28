package com.sda.mvc.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Health {
    HEALTHY("healthy"),WOUNDED("wonded"),DEAD("dead");

     String title;
}
