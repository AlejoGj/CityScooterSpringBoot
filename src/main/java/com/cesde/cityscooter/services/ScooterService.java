package com.cesde.cityscooter.services;

import com.cesde.cityscooter.domain.Scooter;

import java.util.ArrayList;

public class ScooterService {
    private ArrayList<Scooter> scooters = new ArrayList<>();

    /*public Scooter createScooter(Scooter scooter) {
        if (scooter.getIdVehicle() == null) {
            return scooter;
        }
        // Accion: enviar al repo para registrar nuevo vehículo
        return scooter;
    }*/

    public ArrayList<Scooter> getAllScooters() {
        // Accion: consultar al repo todos los scooters (activos e inactivos)
        return scooters;
    }

    public Scooter updateScooter(int id, Scooter newDetails) {
        // Accion: actualizar ubicación o nivel de batería en el repo
        return newDetails;
    }

    public void deleteScooter(int id) {
        // Accion: borrar scooter del sistema via repo
    }
}
