package model.facility;

public abstract class Facility {
   private String serviceName;
    private  double squareUse;
    private   double cost;
    private  int numberOfPeople;
    private  String rentalType;

    public Facility() {
    }

    public Facility(String serviceName, double squareUse, double cost, int numberOfPeople, String rentalType) {
        this.serviceName = serviceName;
        this.squareUse = squareUse;
        this.cost = cost;
        this.numberOfPeople = numberOfPeople;
        this.rentalType = rentalType;
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
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", squareUse=" + squareUse +
                ", cost=" + cost +
                ", numberOfPeople=" + numberOfPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
