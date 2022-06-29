package model;

import model.person.Customer;

import java.time.LocalDate;

public class Booking {
    private String bookingCode;
    private LocalDate startDay;
    private LocalDate endDay;
    private Customer iD;
    private String serviceName;

    public Booking() {
    }

    public Booking(String bookingCode, LocalDate startDay, LocalDate endDay, Customer iD, String serviceName) {
        this.bookingCode = bookingCode;
        this.startDay = startDay;
        this.endDay = endDay;
        this.iD = iD;
        this.serviceName = serviceName;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getEndDay() {
        return endDay;
    }

    public void setEndDay(LocalDate endDay) {
        this.endDay = endDay;
    }

    public Customer getiD() {
        return iD;
    }

    public void setiD(Customer iD) {
        this.iD = iD;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingCode='" + bookingCode + '\'' +
                ", startDay=" + startDay +
                ", endDay=" + endDay +
                ", iD=" + iD +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
