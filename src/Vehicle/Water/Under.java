package Vehicle.Water;
import Vehicle.moveDownUP;

public class Under extends Above implements moveDownUP{
    private final int underwaterMaxSpeed, displacementUnderwater, maxDepthOfImmersion, workDepthOfImmersion, autonomy;

    {
        setType("Подводная лодка");
        setSwim(true);
        setSwimUnderwater(true);
    }

    public Under(String name, String fuelType, int weight, int maxSpeed, int displacement, int underwaterMaxSpeed, int crew, int displacementUnderwater, int maxDepthOfImmersion, int workDepthOfImmersion, int autonomy) {
        super(name, fuelType, weight, maxSpeed, displacement, crew);
        this.underwaterMaxSpeed = underwaterMaxSpeed;
        this.displacementUnderwater = displacementUnderwater;
        this.maxDepthOfImmersion = maxDepthOfImmersion;
        this.workDepthOfImmersion = workDepthOfImmersion;
        this.autonomy = autonomy;
    }
    @Override
    public String toString() {
        return super.toString() +
                "Максимальная подводная скорость: " + underwaterMaxSpeed + " км/ч." +
                "\nВодоизмещение подводное: " + displacementUnderwater + " кг." +
                "\nМаксимальная глубина погружения: " + maxDepthOfImmersion + " м." +
                "\nРабочая глубина погружения: " + workDepthOfImmersion + " м." +
                "\nАвтономность: " + autonomy + " дней."  + "\n";
    }
    @Override
    public void moveDown() {
        System.out.println("Погружаюсь");
    }

    @Override
    public void moveUp() {
        System.out.println("Всплываю");
    }
}
