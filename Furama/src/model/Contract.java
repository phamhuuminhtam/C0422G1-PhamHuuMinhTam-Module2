package model;

import model.person.Customer;

public class Contract {
    private  String contractCode;
    private  Booking bookingCode;
    private double downPayment;
    private double total;
    private Customer iD;

    public Contract() {
    }

    public Contract(String contractCode, Booking bookingCode, double downPayment, double total, Customer iD) {
        this.contractCode = contractCode;
        this.bookingCode = bookingCode;
        this.downPayment = downPayment;
        this.total = total;
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractCode='" + contractCode + '\'' +
                ", bookingCode=" + bookingCode +
                ", downPayment=" + downPayment +
                ", total=" + total +
                ", iD=" + iD +
                '}';
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public Booking getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(Booking bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Customer getiD() {
        return iD;
    }

    public void setiD(Customer iD) {
        this.iD = iD;
    }
}
