package model.facility;

public class House extends Facility{
    private  int numberOfFloors;
    private String roomStandard;

    public House() {
    }

    public House(String serviceName, double squareUse, double cost, int numberOfPeople, String rentalType, int numberOfFloors, String roomStandard) {
        super(serviceName, squareUse, cost, numberOfPeople, rentalType);
        this.numberOfFloors = numberOfFloors;
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                " numberOfFloors=" + numberOfFloors +
                ", roomStandard='" + roomStandard + '\'' +
                '}';
    }
}
