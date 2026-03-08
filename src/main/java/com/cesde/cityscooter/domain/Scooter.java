package com.cesde.cityscooter.domain;

import java.time.LocalDate;

public class Scooter extends Vehiculo {

    private float engineCapacity;
    private double pricePerHour;
    private LocalDate lastMaintenanceDate;
    private PickUpPoint pickUpPoint;


    public Scooter() {
    }

    public Scooter(int idVehicle, String brand, String model, String color, int paxCapacity, String reference, String plate, boolean availableForRent, float engineCapacity, double pricePerHour, LocalDate lastMaintenanceDate, PickUpPoint pickUpPoint) {
        super(idVehicle, brand, model, color, paxCapacity, reference, plate, availableForRent);
        this.engineCapacity = engineCapacity;
        this.pricePerHour = pricePerHour;
        this.lastMaintenanceDate = lastMaintenanceDate;
        this.pickUpPoint = pickUpPoint;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public LocalDate getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public void setLastMaintenanceDate(LocalDate lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    public PickUpPoint getPickUpPoint() {
        return pickUpPoint;
    }

    public void setPickUpPoint(PickUpPoint pickUpPoint) {
        this.pickUpPoint = pickUpPoint;
    }



}
