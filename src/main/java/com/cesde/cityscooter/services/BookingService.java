package com.cesde.cityscooter.services;

import com.cesde.cityscooter.domain.Booking;

import java.util.ArrayList;

public class BookingService {
    // Simulación de lista para el getAll por ahora
    private ArrayList<Booking> bookings = new ArrayList<>();

    public Booking createBooking(Booking booking) {
        // Validación: ¿El scooter está disponible? ¿El cliente existe?
        if (booking.getScooter() != null && booking.getCustomer() != null) {
            // Accion: se enviaría al repo.save(booking)
        }
        return booking;
    }

    public ArrayList<Booking> getAllBookings() {
        // Accion: llamar al repo.findAll() en vez de retornar la lista local
        return bookings;
    }

    public Booking updateBooking(int id, Booking updatedBooking) {
        // Accion: buscar en repo por id, actualizar campos y guardar
        // Se espera a operar con repositorios para persistir
        return updatedBooking;
    }

    public void deleteBooking(int id) {
        // Accion: repo.deleteById(id) para cancelar o borrar la reserva
    }
}
