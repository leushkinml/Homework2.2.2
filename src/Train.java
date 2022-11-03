import java.sql.Time;

//public class Train extends Transport {
//
//    private double tripPrice;
//    private int travelTime;
//    private String departureStation;
//    private String endingStation;
//    private int numberOfWagons;
//
//    public Train(String brand)
//    {
//        this(brand, "default", 1900,
//                "default", 0.0, 0,
//                "Станция отправления не задана",
//                "Станция назначения не задана",
//                0, 0);
//    }
//
//
//    public Train(String brand, String model,
//                 int productionYear,
//                 String productionCountry, double tripPrice,
//                 int travelTime,
//                 String departureStation,
//                 String endingStation,
//                 int numberOfWagons, int maxSpeed)
//
//    {
//        super(brand, model, productionYear, productionCountry, maxSpeed);
//
//        this.setTripPrice(tripPrice);
//
//        this.setTravelTime(travelTime);
//
//        this.setDepartureStation(departureStation);
//
//        this.setEndingStation(endingStation);
//
//        this.setNumberOfWagons(numberOfWagons);
//    }
//
//    public void refill() {
//        System.out.println("Используйте дизельное топливо.");
//    }
//
//    public double getTripPrice() {
//        return tripPrice;
//    }
//
//    public void setTripPrice(double tripPrice) {
//        if (tripPrice < 0) {
//            this.tripPrice = 0;
//        } else {
//            this.tripPrice = tripPrice;
//        }
//    }
//
//    public int getTravelTime() {
//        return travelTime;
//    }
//
//    public void setTravelTime(int travelTime) {
//        if (travelTime < 0) {
//            this.travelTime = 0;
//        } else {
//            this.travelTime = travelTime;
//        }
//    }
//
//    public String getDepartureStation() {
//        return departureStation;
//    }
//
//    public void setDepartureStation(String departureStation) {
//        if (departureStation == null || departureStation.isBlank()) {
//            this.departureStation = "Станция отправления не задана";
//        } else {
//            this.departureStation = departureStation;
//        }
//    }
//
//    public String getEndingStation() {
//        return endingStation;
//    }
//
//    public void setEndingStation(String endingStation) {
//        if (endingStation == null || endingStation.isBlank()) {
//            this.endingStation = "Станция назначения не задана";
//        } else {
//            this.endingStation = endingStation;
//        }
//    }
//
//    public int getNumberOfWagons() {
//        return numberOfWagons;
//    }
//
//    public void setNumberOfWagons(int numberOfWagons) {
//        if (numberOfWagons < 0) {
//            this.numberOfWagons = 0;
//        } else {
//            this.numberOfWagons = numberOfWagons;
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Поезд: '" + getBrand() + '\'' +
//                ", Модель: '" + getModel() + '\'' +
//                ", Год производства: " + getProductionYear() +
//                ", Страна сборки: " + getProductionCountry() +
//                ", Цена поездки: " + tripPrice +
//                ", Время поездки: " + travelTime +
//                ", Станция отправления: " + departureStation +
//                ", Станция назначения: " + endingStation +
//                ", Количество вагонов: " + numberOfWagons +
//                ", Скорость передвижения: " + getMaxSpeed() +
//                '.';
//    }
//}
