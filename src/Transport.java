public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.setEngineVolume(engineVolume);
    }

    public abstract void startMoving();
    public abstract void finishMoving();

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

