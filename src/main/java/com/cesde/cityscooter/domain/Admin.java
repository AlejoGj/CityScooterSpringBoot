package com.cesde.cityscooter.domain;

public class Admin extends User{

    public Admin() {
    }

    public Admin(int id, String nombre, String apellido, String email, String password, boolean status) {
        super(id, nombre, apellido, email, password, status);
    }

    public void blockUser(Customer customer){
        customer.setStatus(false);
    }

    public void verifyLicense (Customer customer) {
        if (customer != null){
            customer.setDrivingLicenseVerified(true);
        }
    }


}
