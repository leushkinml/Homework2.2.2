package transport;

public abstract class Drivers {

    private final String fullName;

    private int drivingExperience;

    public Drivers(String fullName, int drivingExperience) {
        this.fullName = fullName;
        this.drivingExperience = drivingExperience;
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    public abstract void refuelVehicle();


    public String getFullName() {
        return fullName;
    }


    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
}
