package com.cesde.cityscooter.domain;

import java.util.ArrayList;

public class PickUpPoint {
    private int idPickupPoint;
    private String pointName;
    private String location;
    private boolean isActive;
    ArrayList<Scooter> scooters;

    public PickUpPoint() {
    }

    public PickUpPoint(int idPickupPoint, String pointName, String location, boolean isActive, ArrayList<Scooter> scooters) {
        this.idPickupPoint = idPickupPoint;
        this.pointName = pointName;
        this.location = location;
        this.isActive = isActive;
        this.scooters = scooters;
    }

    public int getIdPickupPoint() {
        return idPickupPoint;
    }

    public void setIdPickupPoint(int idPickupPoint) {
        this.idPickupPoint = idPickupPoint;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public ArrayList<Scooter> getScooters() {
        return scooters;
    }

    public void setScooters(ArrayList<Scooter> scooters) {
        this.scooters = scooters;
    }

    public void releaseScooter (Scooter scooter) {
        scooter.setAvailableForRent(false);
    }

}
