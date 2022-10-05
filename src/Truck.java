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
    public String toString() {
        return "Грузовой автомобиль марки: '" + getBrand() +
                ", Модель: " + getModel() +
                ", Объём двигателя в литрах: " + getEngineVolume() +
                ".";
    }

    @Override
    public void isPitStop(boolean pitStop) {
        if (pitStop == true) {
            System.out.println("Грузовик " + getModel() + " на ПитСтопе.");
        } else {
            System.out.println("Грузовик " + getModel() + " на трассе.");
        }
    }

    @Override
    public void getBestLapTime(int time) {
        System.out.println("У грузовика " + getModel() + " лучшее время круга " + time + " секунд.");
    }

    @Override
    public void getMaxSpeed(int time) {
        int speed = 900/time;
        System.out.println("У грузовика " + getModel() + " максимальная скорость " + speed + " метров в секунду.");
    }
}
