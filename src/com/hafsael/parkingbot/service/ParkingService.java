package com.hafsael.parkingbot.service;

import com.hafsael.parkingbot.model.Ticket;
import com.hafsael.parkingbot.model.Vehicule;
import com.hafsael.parkingbot.model.VehiculeModelEnum;

import java.util.Date;

public class ParkingService {
    public Ticket processIncomingVehicule(Vehicule vehicule) {
        Ticket ticket = new Ticket();
        Date now = new Date();
        ticket.setEnteringTime(now);
        ticket.setVehicule(vehicule);
        return ticket;
    }

    public Ticket processExitingVehicule(Ticket ticket) {
        long now = new Date().getTime();
        now += 60 * 60 * 1000;
        Date exitTime = new Date(now);
        ticket.setExitTime(exitTime);
        Vehicule vehicule = ticket.getVehicule();
        VehiculeModelEnum category = vehicule.getCategory();
        long durationInMinutes = (ticket.getExitTime().getTime() - ticket.getEnteringTime().getTime()) / (60 * 1000);
        double pricePerMinuteForCitadine = 0.08;
        double pricePerMinuteFor2Roues = 0.02;
        double defaultPricePerMinute = 0.05;
        double finalPrice = 0;

        switch (category) {
            case CITADINE:
                finalPrice = pricePerMinuteForCitadine * durationInMinutes;
                break;
            case DEUXROUES:
                finalPrice = pricePerMinuteFor2Roues * durationInMinutes;
                break;
            default:
                finalPrice = defaultPricePerMinute * durationInMinutes;
        }

        ticket.setAmount(finalPrice);
        return ticket;
    }
}
