import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;

    private final List<Driver<?>> drivers = new ArrayList<>();
    //    private List<Driver<> drivers;
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();


    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        setEngineVolume(engineVolume);
    }

    public abstract void startMoving();
    public abstract void finishMoving();

    public abstract void determineCarType();

    public abstract boolean service();

    public String getModel() {
        return model;
    }
    public String getBrand() {
        return brand;
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume < 0) {
            this.engineVolume = 0;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }
      public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
      public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public abstract void repair();
}





//    private int productionYear;
//    private String productionCountry;
//    private String color;
//    private int maxSpeed;
//

//
//    public Transport(String brand, String model, int productionYear, String productionCountry, int maxSpeed) {
//        this.brand = brand;
//        this.model = model;
//        this.productionYear = productionYear;
//        this.productionCountry = productionCountry;
//        this.maxSpeed = maxSpeed;
//    }
//
//    public Transport(String brand, String model, int productionYear, String productionCountry, String color) {
//        this.brand = brand;
//        this.model = model;
//        this.productionYear = productionYear;
//        this.productionCountry = productionCountry;
//        this.color = color;
//    }
//
//        return productionYear;
//      public int getProductionYear() {
//
//    public abstract void  refill();
//
//

//    public String getProductionCountry() {
//        return productionCountry;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        if (color == null || color.isBlank()) {
//            this.color = "Белый";
//        } else {
//            this.color = color;
//        }
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        if (maxSpeed < 0) {
//            this.maxSpeed = 0;
//        } else {
//            this.maxSpeed = maxSpeed;
//        }
//    }

