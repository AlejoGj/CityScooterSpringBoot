package com.cesde.cityscooter.domain;

public class PayMethod {
    private String type;
    private String cardNumber;

    public PayMethod() {
    }

    public PayMethod(String type, String cardNumber) {
        this.type = type;
        this.cardNumber = cardNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String maskCardNumber (){
        return ("***** ***** **** 1234");
    }

    public boolean validateFormat () {
        return this.cardNumber != null && this.cardNumber.length() >= 10;
    }

    @Override
    public String toString() {
        return "PayMethod{" +
                "type='" + type + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}


