package com.hafsael.parkingbot;

import com.hafsael.parkingbot.model.Bicycle;
import com.hafsael.parkingbot.model.Car;
import com.hafsael.parkingbot.model.Ticket;
import com.hafsael.parkingbot.model.Vehicule;
import com.hafsael.parkingbot.service.ParkingService;

public class ParkingBot {
    public static void main(String[] args) {
        processVehicules();
    }

    private static void processVehicules() {
        Vehicule vehicule = new Vehicule();
        vehicule.setRegistrationNumber("LS-324-PM");
        ParkingService parkingService = new ParkingService();
        Ticket vehiculeTicket = parkingService.processIncomingVehicule(vehicule);
        System.out.println(vehiculeTicket);

        Vehicule car = new Car();
        car.setRegistrationNumber("p1");
        Ticket carTicket = parkingService.processIncomingVehicule(car);
        System.out.println(carTicket);

        Vehicule bicycle = new Bicycle();
        bicycle.setRegistrationNumber("p2");
        Ticket bicycleTicket = parkingService.processIncomingVehicule(bicycle);
        System.out.println(bicycleTicket);

        System.out.println(parkingService.processExitingVehicule(vehiculeTicket));
        System.out.println(parkingService.processExitingVehicule(bicycleTicket));
        System.out.println(parkingService.processExitingVehicule(carTicket));



    }
}