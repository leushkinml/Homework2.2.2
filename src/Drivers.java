public class Drivers<D extends Transport & Competing> {

    private final String fullName;
    private int drivingExperience;
    private String category;

    public Drivers(String fullName, int drivingExperience, String category) {
        this.fullName = fullName;
        this.setDrivingExperience(drivingExperience);
        setCategory(category);
    }

    public void race(D transport) {
        System.out.println("Водитель " + getFullName() +" управляет автомобилем " + transport.getModel() +
                " и будет участвовать в заезде.");
    }
    public void startMoving() {
    }
    public void finishMoving() {
    }
    public void refuelVehicle() {
    }

    public String getFullName() {
        return fullName;
    }
    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setCategory(String category) {
        if (category == null) {
            throw new IllegalArgumentException("Укажите категорию водительских прав.");
        }
        this.category = category;
    }

    public void setDrivingExperience(int drivingExperience) {
        if (drivingExperience < 0) {
            this.drivingExperience = 0;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }
}
