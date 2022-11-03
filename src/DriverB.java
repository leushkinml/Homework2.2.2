public class DriverB extends Driver  {

    public DriverB(String fullName, int drivingExperience, String category) {
        super(fullName, drivingExperience, category);
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
