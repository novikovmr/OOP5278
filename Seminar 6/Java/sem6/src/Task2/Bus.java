package Task2;

public class Bus extends Vehicle{

    private double speedCoef = 0.6;

    /**
     * 
     * @param maxSpeed - Макс. скорость наследуется из класса Vehicle
     * @param model - Модель транспортного средства наследуется из класса Vehicle
     */
    public Bus(int maxSpeed, String model) {
        super(maxSpeed, model);
        
    }


    public double calculateAllowedSpeed() {
        return getMaxSpeed() * speedCoef;
    }

}
