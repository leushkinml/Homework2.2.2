import java.util.Objects;

public class Car {

    // ДЗ 1: 3-е задание
    /*
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;
    */

    // ДЗ 2: 2-е задание
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    // ДЗ 3: 2-е задание
    public Car(String brand) {
        this(brand, "default", 1.5, "белый", 2000, "default");
    }

    public Car(String brand, String model, double engineVolume,
               String color, int productionYear,
               String productionCountry) {

        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (model != null) {
            this.model = model;
        } else {
            this.model = "default";
        }

        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;

        if (productionCountry != null) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "default";
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getEngineVolume() == car.getEngineVolume() && getProductionYear() == car.getProductionYear() &&
                getBrand().equals(car.getBrand()) && getModel().equals(car.getModel()) &&
                getColor().equals(car.getColor()) && getProductionCountry().equals(car.getProductionCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getEngineVolume(), getColor(),
                getProductionYear(), getProductionCountry());
    }

    @Override
    public String toString() {
        return "Автомобиль марки: '" + brand + '\'' +
                ", Модель: '" + model + '\'' +
                ", Объём двигателя в литрах: " + engineVolume +
                ", Цвет: '" + color + '\'' +
                ", Год производства: " + productionYear +
                ", Страна сборки: '" + productionCountry + '\'' +
                '.';
    }
}
