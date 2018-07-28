package com.sda.mvc.controller;

import com.sda.mvc.model.Fatigue;
import com.sda.mvc.model.GiantModel;
import com.sda.mvc.model.Health;
import com.sda.mvc.model.Nourishment;
import com.sda.mvc.view.GiantView;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Set;


@RequiredArgsConstructor
public class GiantController {

    @NonNull
    GiantModel giantModel;
    @NonNull
    GiantView giantView;

    Set<GiantModel> giantModelHashSet;

    public Health getHealth() {
        return giantModel.getHealth();
    }

    public void setHealth(Health health) {
        giantModel.setHealth(health);
    }

    public Fatigue getFatigue() {
        return giantModel.getFatigue();
    }

    public void setFatigue(Fatigue fatigue) {
       giantModel.setFatigue(fatigue);
    }

    public Nourishment getNourishment() {
        return giantModel.getNourishment();
    }

    public void setNourishment(Nourishment nourishment) {
       giantModel.setNourishment(nourishment);
    }

   public void updateView(){
        giantView.displayGiant(giantModel);
    }
    }

