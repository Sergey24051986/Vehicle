package Vehicle.Water;

import Vehicle.Vehicle;

public class Above extends Vehicle {

    private final int displacement, crew;
    private boolean isSwimUnderwater;

    {
        setType("Лодка");
        setSwim(true);
    }

    public Above(String name, String fuelType, int weight, int maxSpeed, int displacement, int crew) {
        super(name, fuelType, weight, maxSpeed);
        this.displacement = displacement;
        this.crew = crew;
    }
    public Above(String name, String fuelType, int weight, int maxSpeed, boolean isFly, boolean isSwim, boolean isRide, int displacement, boolean iSwimUnderwater, int crew) {
        super(name, fuelType, weight, maxSpeed, isFly, isSwim, isRide);
        this.displacement = displacement;
        this.isSwimUnderwater = iSwimUnderwater;
        this.crew = crew;
    }
    //set
    public void setSwimUnderwater(boolean swimUnderwater) {isSwimUnderwater = swimUnderwater;}
    @Override
    public String toString() {
        return super.toString() +
                "\nВодоизмещение: " + displacement + " кг." +
                "\nПлавает под водой: " + (isSwimUnderwater ? "Да" : "Нет") +
                "\nЭкипаж: " + crew + " человек." + "\n";
    }
}