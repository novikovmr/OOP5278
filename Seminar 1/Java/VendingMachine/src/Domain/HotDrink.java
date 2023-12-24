package Domain;

public class HotDrink extends Product {

    private int temperature;
    private float volumeHotDrink;
    private boolean sugar;

    public HotDrink(int price, int place, String name, long id, int temperature, float volumeHotDrink, boolean sugar) {
        super(price, place, name, id);
        this.volumeHotDrink = volumeHotDrink;
        this.temperature = temperature;
        this.sugar = sugar;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public float getVolumeHotDrink() {
        return volumeHotDrink;
    }

    public void setVolumeHotDrink(float volumeHotDrink) {
        this.volumeHotDrink = volumeHotDrink;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {

        return super.toString() + "volume = " + volumeHotDrink + "\n" +
                "temperature = " + temperature + "C\n" + "sugar: " + sugar + "\n";
    }

}
