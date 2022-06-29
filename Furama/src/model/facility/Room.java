package model.facility;

public class Room extends Facility{
    private String freeServiceAdd;

    public Room() {
    }

    public Room(String serviceName, double squareUse, double cost, int numberOfPeople, String rentalType, String freeServiceAdd) {
        super(serviceName, squareUse, cost, numberOfPeople, rentalType);
        this.freeServiceAdd = freeServiceAdd;
    }

    public String getFreeServiceAdd() {
        return freeServiceAdd;
    }

    public void setFreeServiceAdd(String freeServiceAdd) {
        this.freeServiceAdd = freeServiceAdd;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                " freeServiceAdd='" + freeServiceAdd + '\'' +
                '}';
    }
}
