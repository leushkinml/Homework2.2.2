public class Bus extends Transport implements Competing{

    private BusCapacity busCapacity;

    public Bus(String brand, String model, double engineVolume, BusCapacity busCapacity) {
        super(brand, model, engineVolume);
        this.busCapacity = busCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начал движение");
    }
    @Override
    public void finishMoving() {
        System.out.println("Автобус закончил движение");
    }

    @Override
    public void determineCarType() {
        if (busCapacity == null ) {
            System.out.println("Данных по транспортному средству недостаточно.");
        } else {
            System.out.println("Тип пассажирской вместимости автобуса " + getModel() + ": "+ busCapacity.name() + ". Вместимость автобуса: от " + busCapacity.getFrom() + "  до " + busCapacity.getTo() + " человек.");
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобусам диагностика не требуется.");
        return false;
    }

    @Override
    public String toString() {
        return "Автобус марки: '" + getBrand() +
                ", Модель: " + getModel() +
                ", Объём двигателя в литрах: " + getEngineVolume() +
                ".";
    }
    @Override
    public void isPitStop(boolean pitStop) {
        if (pitStop == true) {
            System.out.println("Автобус " + getModel() + " на ПитСтопе.");
        } else {
            System.out.println("Автобус " + getModel() + " на трассе.");
        }
    }
    @Override
    public void getBestLapTime(int time) {
        System.out.println("У автобуса " + getModel() + " лучшее время круга " + time + " секунд.");
    }
    @Override
    public void getMaxSpeed(int time) {
        int speed = 900/time;
        System.out.println("У автобуса " + getModel() + " максимальная скорость " + speed + " метров в секунду.");
    }
}






//    public Bus(String brand) {
//        this(brand, "", 1900, "", "", 0);
//    }
//    public Bus(String brand, String model, int productionYear, String productionCountry,
//               String color, int maxSpeed) {
//        super(brand, model, productionYear, productionCountry, color, maxSpeed);
//    }
//
//    @Override
//    public void refill() {
//        System.out.println("Выберете соответствующее топливо: бензин или дизель.");
//    }
//    @Override
//    public String toString() {
//        return "Автобус: '" + getBrand() + '\'' +
//                ", Модель: '" + getModel() + '\'' +
//                ", Год производства: " + getProductionYear() +
//                ", Страна сборки: " + getProductionCountry() +
//                ", Цвет: " + getColor() +
//                ", Максимальная скорость передвижения: " + getMaxSpeed() +
//                '.';
//    }


