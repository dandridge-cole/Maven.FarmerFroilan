package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Collections.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Farmer;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;

public class Froilan extends Person implements Farmer {


    public void eat(Edible food, Integer qty) {

    }

    public void makeNoise() {

    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }

    @Override
    public void ride(Rideable rideable) {

    }

    @Override
    public void plant(Crop crop, CropRow row) {

    }

    @Override
    public void harvest(Tractor tractor, CropRow<Crop> row) {

    }

    @Override
    public void harvest(ChickenCoop cp) {

    }

    @Override
    public void setHasEatenFalse() {
        //hasEatenToday=false;
    }
}
