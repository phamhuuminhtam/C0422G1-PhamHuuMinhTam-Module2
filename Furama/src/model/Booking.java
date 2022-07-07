package model;

import model.facility.Facility;
import model.person.Customer;

import java.time.LocalDate;
import java.util.Objects;

public class Booking implements Comparable<Booking> {
    private String bookingCode;
    private LocalDate startDay;
    private LocalDate endDay;
    private Customer iD;
    private Facility serviceName;

    public Booking() {
    }

    public Booking(String bookingCode, LocalDate startDay, LocalDate endDay, Customer iD, Facility serviceName) {
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

    public Facility getServiceName() {
        return serviceName;
    }

    public void setServiceName(Facility serviceName) {
        this.serviceName = serviceName;
    }

    public String getInfo() {
        return bookingCode + "," + startDay + "," + endDay + "," + iD.getID() + "," + serviceName.getServiceName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return bookingCode.equals(booking.bookingCode) && startDay.equals(booking.startDay) && endDay.equals(booking.endDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingCode, startDay, endDay);
    }

    @Override
    public String toString() {
        return "Booking:" +
                "\n Mã booking " + bookingCode  +
                "\n Ngày bắt đầu " + startDay +
                "\n Ngày kết thúc "  + endDay + "\n"+
                " -Khách hàng booking: " + iD.getName() +"\n"+
                " -ServiceName: " + serviceName.getServiceName() ;
    }

    @Override
    public int compareTo(Booking o) {
        if (this.startDay.compareTo(o.startDay) > 0) {
            return 1;
        } else if (this.startDay.compareTo(o.startDay) < 0)
            return -1;
        else if (this.endDay.compareTo(o.endDay) > 0) return 1;
        else return -1;
    }
}
