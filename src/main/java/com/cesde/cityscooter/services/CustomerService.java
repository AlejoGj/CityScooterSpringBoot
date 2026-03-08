package com.cesde.cityscooter.services;

import com.cesde.cityscooter.domain.Customer;

import java.util.List;

public class CustomerService {
    // estos métodos pasarian al service de customer???

    public Customer createCustomer (Customer customer){
        if (customer.getEmail() == null){
            // se enviaria al repo
        }
        return customer;
    }

    /*public List<Customer> getAllcustomers (){
        // accion al repo en vez de return customers
        return customers;

        comentada para evitar errores
    }
    */


    // en ves de retornar id, se debe retornar Customer
    public int updateCustomer (int id) {
        // se espera a poder operar con repositorios para enviar la informacion
        return id;
    }

    public void deleteCustomer (int id){
        // accion para borrar customer por id en el repositorio
    }

    public void bookVehicle (){

    }
}
