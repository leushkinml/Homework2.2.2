import transport.Drivers;

public class DriverB extends Drivers   {
//public class Trainer<A extends Pet & Trained>

    public static final String DL_CATEGORY = "B";

    public DriverB(String fullName, int drivingExperience) {
        super(fullName, drivingExperience);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void finishMoving() {

    }

    @Override
    public void refuelVehicle() {

    }

    @Override
    public String toString() {
        return "Водитель " + getFullName() +
                " управляет автомобилем " + getClass() +
                " и будет участвовать в заезде.";
    }
}
