package com.hafsael.parkingbot.model;

public class Bicycle extends Vehicule {
    @Override
    public VehiculeModelEnum getCategory() {
        return VehiculeModelEnum.DEUXROUES;
    }
}
