package model.facility;

import java.util.Objects;

public abstract class Facility {
    private String serviceCode;
   private String serviceName;
    private  double squareUse;
    private   double cost;
    private  int numberOfPeople;
    private  String rentalType;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, double squareUse, double cost, int numberOfPeople, String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.squareUse = squareUse;
        this.cost = cost;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getSquareUse() {
        return squareUse;
    }

    public void setSquareUse(double squareUse) {
        this.squareUse = squareUse;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return serviceName.equals(facility.serviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceName);
    }

    public String getInfoToCSV(){
        return serviceCode+","+serviceName+"," +squareUse+"," +cost+"," +numberOfPeople+"," +rentalType;
    }

    @Override
    public String toString() {
        return  "serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", squareUse=" + squareUse +
                ", cost=" + cost +
                ", numberOfPeople=" + numberOfPeople +
                ", rentalType='" + rentalType + '\'';
    }
}
