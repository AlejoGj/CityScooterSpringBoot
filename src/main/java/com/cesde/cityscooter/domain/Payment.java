package com.cesde.cityscooter.domain;

public class Payment {
    private float payAmount;
    private String ticket;
    private String bill;
    private boolean isPayed;

    public Payment() {
    }

    public Payment(float payAmount, String ticket, String bill, boolean isPayed) {
        this.payAmount = payAmount;
        this.ticket = ticket;
        this.bill = bill;
        this.isPayed = isPayed;
    }

    public float getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(float payAmount) {
        this.payAmount = payAmount;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }


    public void generateBill () {
    }

}
