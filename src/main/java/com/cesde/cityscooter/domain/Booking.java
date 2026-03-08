package com.cesde.cityscooter.domain;

import java.util.Date;

public class Booking {
    private int id;
    private Date date;
    private Customer customer;
    private Scooter scooter;
    private Payment payment;

    public Booking() {
    }

    public Booking(int id, Date date, Customer customer, Scooter scooter, Payment payment) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.scooter = scooter;
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Scooter getScooter() {
        return scooter;
    }

    public void setScooter(Scooter scooter) {
        this.scooter = scooter;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }



}
