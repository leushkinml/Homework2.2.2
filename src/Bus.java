public class Bus extends Transport {

    public Bus(String brand) {
        this(brand, "", 1900, "", "", 0);
    }
    public Bus(String brand, String model, int productionYear, String productionCountry,
               String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    public void refill() {
        super.refill();
        System.out.println("Выберете соответствующее топливо: бензин или дизель.");
    }
    @Override
    public String toString() {
        return "Автобус: '" + getBrand() + '\'' +
                ", Модель: '" + getModel() + '\'' +
                ", Год производства: " + getProductionYear() +
                ", Страна сборки: " + getProductionCountry() +
                ", Цвет: " + getColor() +
                ", Максимальная скорость передвижения: " + getMaxSpeed() +
                '.';
    }

}
