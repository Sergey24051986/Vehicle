package Vehicle.Ground;

import Vehicle.Vehicle;

public class Railway extends Vehicle {
    int wagons, seats;
    {
        setType("Поезд");
        setRide(true);
    }

    public Railway(String name, String fuelType, int weight, int maxSpeed, int wagons, int seats) {
        super(name, fuelType, weight, maxSpeed);
        this.wagons = wagons;
        this.seats = seats;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nВагоны: " + wagons +
                "\nКоличество мест: " + seats + "\n";
    }

}
