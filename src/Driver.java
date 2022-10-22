import com.sun.javadoc.SeeTag;

import java.util.HashSet;
import java.util.Set;

public class Driver<D extends Transport & Competing> {

    private final String fullName;
    private int drivingExperience;
    private String category;

    private Set<Driver> drivers;

    public Driver(String fullName, int drivingExperience, String category) {
        this.fullName = fullName;
        this.setDrivingExperience(drivingExperience);
        setCategory(category);

        drivers = new HashSet<>();
    }

    public void race(D transport) {
        System.out.println("Водитель " + getFullName() +" управляет автомобилем " + transport.getModel() +
                " и будет участвовать в заезде.");
    }

    public Set<Driver> getDrivers() {
        return drivers;
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

    @Override
    public String toString() {
        return fullName + ", стаж вождения: " + drivingExperience + " лет, категория " + category;
    }
}
