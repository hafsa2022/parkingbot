package com.hafsael.parkingbot.model;

import java.util.Date;

public class Ticket {
    private double amount;
    private Vehicule vehicule;
    private Date enteringTime;
    private Date exitTime;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Date getEnteringTime() {
        return enteringTime;
    }

    public void setEnteringTime(Date enteringTime) {
        this.enteringTime = enteringTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    @Override
    public String toString() {
        return "Ticket d'un montant de "+
                amount +
                " pour véhicule de type " + vehicule.getCategory() +
                " entrée à " + enteringTime +
                " et sorti à " + exitTime ;
    }
}
