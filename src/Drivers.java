public class Drivers<D extends Transport & Competing> {

    private final String fullName;
    private int drivingExperience;

    public Drivers(String fullName, int drivingExperience) {
        this.fullName = fullName;
        this.setDrivingExperience(drivingExperience);
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
    public void setDrivingExperience(int drivingExperience) {
        if (drivingExperience < 0) {
            this.drivingExperience = 0;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }
}
