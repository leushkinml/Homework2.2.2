import java.time.LocalDate;

public class Car extends Transport {


    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean tiresType;

    private Key key;
    private Insurance insurance;


    // ДЗ 3: 2-е задание
    public Car(String brand) {
        this(brand, "default", 1.5, "белый", 2000,
                "default", "МКПП", "Седан",
                "x000xx000", 5, false,
                new Key(false, false),
                new Insurance(null, 0.0, "000000000"));
    }

    public Car(String brand, String model, double engineVolume,
               String color, int productionYear,
               String productionCountry, String transmission,
               String bodyType, String registrationNumber,
               int numberOfSeats, boolean tiresType, Key key, Insurance insurance) {

        super(brand, model, productionYear, productionCountry, color);

        this.engineVolume = engineVolume;

        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "Седан";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }

        if (numberOfSeats <= 0) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        this.tiresType = tiresType;

        if (key == null) {
            this.key = new Key(false, false);
        } else {
            this.key = key;
        }

        if (insurance == null) {
            this.insurance = new Insurance(null, 0.00, "000000000");
        } else {
            this.insurance = insurance;
        }
    }

    public void refill() {
        super.refill();
        System.out.println("Выберете соответствующее топливо: бензин, дизель, или электричество.");
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isTiresType () {
            return tiresType;
    }

    public void setTiresType ( boolean tiresType){
            this.tiresType = tiresType;
    }

    public void shangeTypeOfTires() {
        tiresType = !tiresType;
    }

    public boolean chekingRegistrationNumber() {
        if(registrationNumber.length()!=9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) ||
                !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) ||
                !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) ||
                !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }

    public static class Key {

        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Ключ: " +
                    "Удалённый запуск двикателя: " + remoteEngineStart +
                    ", Бесключевой доступ: " + keylessAccess;
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public static class Insurance {
        private final LocalDate durationOfInsurance;
        private final double insuranceCost;
        private String insuranceNumber;

        @Override
        public String toString() {
            return "Страховка: " +
                    "Срок действия страховки: " + durationOfInsurance +
                    ", Стоимость страховки: " + insuranceCost +
                    ", Номер страховки: " + insuranceNumber + '.';
        }

        public Insurance(LocalDate durationOfInsurance, double insuranceCost, String insuranceNumber) {
            if (durationOfInsurance == null) {
                this.durationOfInsurance = LocalDate.of(0000, 01, 01);
            } else {
                this.durationOfInsurance = durationOfInsurance;
            }
            this.insuranceCost = insuranceCost;

            if (insuranceNumber == null) {
                this.insuranceNumber = "Номер страховки отсутствует";
            } else if (insuranceNumber.length() != 9) {
                this.insuranceNumber = "Номер страховки некорректный";
            } else {
                this.insuranceNumber = insuranceNumber;
            }
        }

        public LocalDate getDurationOfInsurance() {
            return durationOfInsurance;
        }

        public double getInsuranceCost() {
            return insuranceCost;
        }

        public String getInsuranceNumber() {
            return insuranceNumber;
        }
        public void checkDurationOfInsurance() {
            if (durationOfInsurance.isBefore(LocalDate.now()) ||
                    durationOfInsurance.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку.");
            }
        }

        public void checkInsuranceNumber() {
            if (insuranceNumber.length() != 9) {
                System.out.println("Номер страховки некорректный.");
            }
        }
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Автомобиль марки: '" + getBrand() + '\'' +
                ", Модель: '" + getModel() + '\'' +
                ", Объём двигателя в литрах: " + engineVolume +
                ", Цвет: '" + getColor() + '\'' +
                ", Год производства: " + getProductionYear() +
                ", Страна сборки: '" + getProductionCountry() + '\'' +
                ", Коробка передач: '" + transmission + '\'' +
                ", Тип кузова: '" + bodyType + '\'' +
                ", Регистрационный номер: '" + registrationNumber + '\'' +
                ", Количество мест: " + numberOfSeats +
                ", Тип резины: " + (isTiresType () ? "летняя" : "зимняя") +
                ", Тип доступа: " + (getKey().isKeylessAccess() ? "Доступ с ключом" : "Безключевой доступ") +
                ", Тип запуска двигателя: " + (getKey().isRemoteEngineStart() ? "Удалённый запуск" : "Обычный запуск")+
                ", " + insurance ;
    }


}
