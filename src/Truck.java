public class Truck extends Transport implements Competing{

    private TruckСarrying truckСarrying;
    public Truck(String brand, String model, double engineVolume, TruckСarrying truckСarrying) {
        super(brand, model, engineVolume);
        this.truckСarrying = truckСarrying;
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начал движение");
    }
    @Override
    public void finishMoving() {
        System.out.println("Грузовик закончил движение");
    }

    @Override
    public void determineCarType() {
        if (truckСarrying == null ) {
            System.out.println("Данных по транспортному средству недостаточно.");
        } else {
            System.out.println("Тип грузоподъёмности автомобиля " + getModel() + ": "+ truckСarrying.name() + ". Грузоподъёмность автомобиля: от " + truckСarrying.getFrom() + "  до " + truckСarrying.getTo() + " тонн.");
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.5;
    }

    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " починен!") ;
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
