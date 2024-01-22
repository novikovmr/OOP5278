package Task2;

public class Car extends Vehicle{
    
    private double speedCoef = 0.8;

    /**
     * @param maxSpeed - Макс. скорость наследуется из класса Vehicle
     * @param model - Модель транспортного средства наследуется из класса Vehicle
     */
    public Car(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public double calculateAllowedSpeed() {
        return getMaxSpeed() * speedCoef;
    }
    
}
