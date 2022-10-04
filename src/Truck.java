public class Truck extends Transport implements Competing{

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
    }

    @Override
    public void finishMoving() {
    }

    @Override
    public boolean isPitStop() {
        return false;
    }

    @Override
    public int getBestLapTime() {
        return 0;
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль марки: '" + getBrand() +
                ", Модель: " + getModel() +
                ", Объём двигателя в литрах: " + getEngineVolume() +
                ".";
    }
}
