package Vehicle;

public abstract class Vehicle {
    private String name, type, fuelType;
    private int weight, maxSpeed;
    private boolean isFly, isSwim, isRide;

    protected Vehicle(String name, String fuelType, int weight, int maxSpeed) {
        this.name = name;
        this.fuelType = fuelType;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }
    protected Vehicle(String name, String fuelType, int weight, int maxSpeed, boolean isFly, boolean isSwim, boolean isRide) {
        this.name = name;
        this.fuelType = fuelType;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.isFly = isFly;
        this.isSwim = isSwim;
        this.isRide = isRide;
    }

    public void moveForward() {
        System.out.println("Двигаюсь вперёд");
    }
    public void moveBackward() {
        System.out.println("Двигаюсь назад");
    }
    public void moveToTheRight() {
        System.out.println("Поворачиваю направо");
    }
    public void moveToTheLeft() {System.out.println("Поворачиваю налево");}
    //get
    public String getType() {
        return type;
    }
    //set
    public void setName(String name) {this.name = name;}
    public void setType(String type){this.type = type;}
    public void setFuelType(String fuelType) {this.fuelType = fuelType;}
    public void setWeight(int weight) {this.weight = weight;}
    public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}
    public void setFly(boolean fly){this.isFly = fly;}
    public void setSwim(boolean swim) {this.isSwim = swim;}
    public void setRide(boolean ride) {this.isRide = ride;}

    @Override
    public String toString() {
        return "Название: " + name +
                "\nТип: " + type +
                "\nТип топлива: " + fuelType +
                "\nВес: " + weight + " кг." +
                "\nМаксимальная скорость: " + maxSpeed + " км/ч." +
                "\nУмеет летать: " + (isFly ? "Да" : "Нет") +
                "\nУмеет плавать: " + (isSwim ? "Да" : "Нет") +
                "\nУмеет ездить: " + (isRide ? "Да" : "Нет");
    }
}
