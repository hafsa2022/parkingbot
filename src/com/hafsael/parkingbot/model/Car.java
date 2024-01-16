package com.hafsael.parkingbot.model;


public class Car extends Vehicule {
    @Override
    public VehiculeModelEnum getCategory() {
        return VehiculeModelEnum.CITADINE;
    }
}
