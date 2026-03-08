package com.cesde.cityscooter.services;

import com.cesde.cityscooter.domain.Payment;

import java.util.ArrayList;

public class PaymentService {
    private ArrayList<Payment> payments = new ArrayList<>();

    public Payment processPayment(Payment payment) {
        if (payment.getPayAmount() > 0) {
            // Accion: enviar al repo para registrar la transacción exitosa
        }
        return payment;
    }

    public ArrayList<Payment> getAllPayments() {
        // Accion: repo.findAll() para obtener historial de facturación
        return payments;
    }

    // Nota: Normalmente los pagos no se "editan" o "borran",
    // pero para la estructura CRUD académica:

    public Payment updatePayment(int id, Payment payment) {
        // Accion: corrección de estado de pago en el repo
        return payment;
    }

    public void deletePayment(int id) {
        // Accion: anular registro en el repo
    }





}
