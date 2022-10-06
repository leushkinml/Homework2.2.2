public class DriverB extends Drivers  {

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

//    @Override
//    public String toString() {
//        return "Водитель : '" + getFullName() +
//                "Водительские права катекории: '" + DL_CATEGORY +
//                ", Управляет автомобилями категории: " + getClass() +
//                ", Стаж управления автомобилем: '" + getDrivingExperience() + '\'' +
//                ".";
//    }
}
