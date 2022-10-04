public class Bus extends Transport implements Competing{

    public Bus(String brand, String model, double engineVolume) {
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
        return "Автобус марки: '" + getBrand() +
                ", Модель: " + getModel() +
                ", Объём двигателя в литрах: " + getEngineVolume() +
                ", Лучшее время круга: " + getBestLapTime() +
                ", Максимальная скорость: " + getMaxSpeed() +
                ".";
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


