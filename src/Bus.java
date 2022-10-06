public class Bus extends Transport implements Competing{

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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


