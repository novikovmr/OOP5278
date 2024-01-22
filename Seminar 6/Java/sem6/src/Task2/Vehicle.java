package Task2;

public abstract class Vehicle {
    private int maxSpeed;
    private String model;

    // Скоростной коэффициент
    private double speedCoef;

    /**
     * 
     * @param maxSpeed - Макс. скорость т/с
     * @param model - Переменная type потеряла актуальность, предлагаю заменить на марку конкретного т/с
     */
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * 
     * @return - Возвращаем макс. допустимую скорость с учетом скоростного коэф-а
     */
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * speedCoef;
    }
}
