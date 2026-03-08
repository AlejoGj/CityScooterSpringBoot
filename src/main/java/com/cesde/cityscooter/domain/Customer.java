package com.cesde.cityscooter.domain;

public class Customer extends User {

    private String phoneNumber;
    private String address;
    private PayMethod payMethod;
    private boolean isDrivingLicenseVerified;

    public Customer() {
    }


    public Customer(int id, String nombre, String apellido, String email, String password, boolean status, String phoneNumber, String address, PayMethod payMethod, boolean isDrivingLicenseVerified) {
        super(id, nombre, apellido, email, password, status);
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.payMethod = payMethod;
        this.isDrivingLicenseVerified = isDrivingLicenseVerified;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PayMethod getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(PayMethod payMethod) {
        this.payMethod = payMethod;
    }

    public boolean isDrivingLicenseVerified() {
        return isDrivingLicenseVerified;
    }

    public void setDrivingLicenseVerified(boolean drivingLicenseVerified) {
        isDrivingLicenseVerified = drivingLicenseVerified;
    }



    public void bookVehicle (){

    }

}
