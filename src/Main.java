import java.sql.Time;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Driver<Car> ivanov = new Driver<>("Иванов Иван Иванович", 20, "B");
        Driver<Truck> petrov = new Driver<>("Петров Пётр Петрович", 25, "C");
        Driver<Bus> sidorov = new Driver<>("Сидоров Сидор Сидорович", 30, "D");

        Mechanic jon = new Mechanic<>("Jon", "Black", "ABC");
//        Mechanic jon = new Mechanic<Car>("Jon", "Black", "ABC");
        Mechanic bill = new Mechanic<>("Bill", "Wight", "ABC");
//        Mechanic bill = new Mechanic<Transport>("Bill", "Wight", "ABC");

        Sponsor frolov = new Sponsor("Froilov", 1_000_000);
        Sponsor gazprom = new Sponsor("GAZPROM", 5_000_000);


        Car firstCar = new Car("ВАЗ","Лада Гранта", 2.5, CarBodyType.SEDAN);
        firstCar.addDriver(ivanov);
        firstCar.addMechanic(jon);
        firstCar.addSponsor(frolov, gazprom);
        Car secondCar = new Car("АЗЛК","Москвич", 1.5, CarBodyType.CROSSOVER);
        secondCar.addDriver(ivanov);
        secondCar.addMechanic(jon);
        secondCar.addSponsor(gazprom);
        Car thirdCar = new Car("УАЗ","Патриот", 1.8, CarBodyType.HATCHBACK);
        thirdCar.addDriver(ivanov);
        thirdCar.addMechanic(jon);
        thirdCar.addSponsor(frolov);
        Car forthCar = new Car("КАМАЗ","Ока", 3.6, CarBodyType.COUPE);
        forthCar.addDriver(ivanov);
        forthCar.addMechanic(jon);
        forthCar.addSponsor();

        Bus firstBus = new Bus("ЛИАЗ","Прогресс", 3.9, BusCapacity.LARGE);
        firstBus.addDriver(petrov);
        firstBus.addMechanic(bill);
        firstBus.addSponsor(frolov, gazprom);
        Bus secondBus = new Bus("ЛАЗ","Городской", 4.5, BusCapacity.MEDIUM);
        secondBus.addDriver(petrov);
        secondBus.addMechanic(bill);
        secondBus.addSponsor(gazprom);
        Bus thirdBus = new Bus("ПАЗ"," ПАЗ ТДС", 2.8, BusCapacity.EXTRA_SMALL);
        thirdBus.addDriver(petrov);
        thirdBus.addMechanic(bill);
        thirdBus.addSponsor(frolov);
        Bus forthBus = new Bus("ГАЗ","Газон", 3.6, BusCapacity.MEDIUM);
        forthBus.addDriver(petrov);
        forthBus.addMechanic(bill);
        forthBus.addSponsor();

        Truck firstTruck = new Truck("КАМАЗ","КАМАЗ СПОРТ", 12.0, TruckСarrying.N_1);
        firstTruck.addDriver(sidorov);
        firstTruck.addMechanic(bill);
        firstTruck.addSponsor(gazprom, frolov);
        Truck secondTruck = new Truck("ЗИЛ","ЗИЛ 130", 10.5, TruckСarrying.N_1);
        secondTruck.addDriver(sidorov);
        secondTruck.addMechanic(bill);
        secondTruck.addSponsor(gazprom, frolov);
        Truck thirdTruck = new Truck("ГАЗ","Газель", 11.8, TruckСarrying.N_2);
        thirdTruck.addDriver(sidorov);
        thirdTruck.addMechanic(bill);
        thirdTruck.addSponsor(gazprom, frolov);
        Truck forthTruck = new Truck("ВАЗ","Фермер", 9.6, TruckСarrying.N_3);
        forthTruck.addDriver(sidorov);
        forthTruck.addMechanic(bill);
        forthTruck.addSponsor(gazprom, frolov);

        List<Transport> transports = List.of(
                firstCar, secondCar, thirdCar, forthCar,
                firstTruck, secondTruck, thirdTruck, forthTruck,
                firstBus, secondBus, thirdBus, forthBus
        );

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(firstCar);
        serviceStation.addTruck(secondTruck);
        serviceStation.addTruck(firstTruck);
        serviceStation.addCar(forthCar);
        serviceStation.service();
        serviceStation.service();
        serviceStation.service();
        serviceStation.service();

        System.out.println();
        for (Transport transport : transports) {
            printInfo(transport);
        }

//        service(
//                firstCar, secondCar, thirdCar, forthCar,
//                firstTruck, secondTruck, thirdTruck, forthTruck,
//                firstBus, secondBus, thirdBus, forthBus
//        );

        System.out.println(firstCar);
        System.out.println(secondCar);
        System.out.println(thirdCar);
        System.out.println(forthCar);
        System.out.println();
        System.out.println(firstBus);
        System.out.println(secondBus);
        System.out.println(thirdBus);
        System.out.println(forthBus);
        System.out.println();
        System.out.println(firstTruck);
        System.out.println(secondTruck);
        System.out.println(thirdTruck);
        System.out.println(forthTruck);

        System.out.println();
        firstCar.isPitStop(true);
        secondCar.getBestLapTime(85);
        forthCar.getMaxSpeed(85);

        System.out.println();
        secondBus.isPitStop(false);
        thirdBus.getBestLapTime(136);
        forthBus.getMaxSpeed(136);

        System.out.println();
        firstTruck.isPitStop(true);
        secondTruck.getBestLapTime(154);
        thirdTruck.getMaxSpeed(154);

        System.out.println();
        System.out.println();

        ivanov.race(firstCar);
        petrov.race(secondTruck);
        sidorov.race(thirdBus);

        System.out.println();
        firstCar.determineCarType();
        secondCar.determineCarType();
        thirdCar.determineCarType();
        forthCar.determineCarType();

        System.out.println();

        firstBus.determineCarType();
        secondBus.determineCarType();
        thirdBus.determineCarType();
        forthBus.determineCarType();

        System.out.println();

        firstTruck.determineCarType();
        secondTruck.determineCarType();
        thirdTruck.determineCarType();
        forthTruck.determineCarType();

        Set<Driver> drivers = new HashSet<>();
        drivers.add(ivanov);
        drivers.add(petrov);
        drivers.add(sidorov);
        drivers.add(sidorov);
        System.out.println("Список водителей: " + drivers);
        System.out.println();

        Set<Sponsor> sponsors = new HashSet<>();
        sponsors.add(frolov);
        sponsors.add(gazprom);
        sponsors.add(gazprom);
        System.out.println("Список спонсоров: " + sponsors);
        System.out.println();

        Set<Mechanic> mechanics = new HashSet<>();
        mechanics.add(jon);
        mechanics.add(bill);
        mechanics.add(bill);
        System.out.println("Список механиков: " + mechanics);
        System.out.println();

        Set<Car> cars = new HashSet<>();
        cars.add(firstCar);
        cars.add(secondCar);
        cars.add(thirdCar);
        cars.add(forthCar);
        System.out.println("Список машин: " + cars);
        System.out.println();

    }

    private static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители: " + transport.getDrivers());
        System.out.println("Спонсоры: " + transport.getSponsors());
        System.out.println("Механики: " + transport.getMechanics());

//        System.out.println("Водители: ");
//        for (Driver<?> driver : transport.getDrivers()) {
//            System.out.println(driver.getFullName());
//        }
//        System.out.println("Спонсоры: ");
//        for (Sponsor sponsor : transport.getSponsors()) {
//            System.out.println(sponsor.getName());
//        }
//        System.out.println("Механики: ");
//        for (Mechanic<?> mechanic : transport.getMechanics()) {
//            System.out.println(mechanic.getName() + " " + mechanic.getSurname() + " " + mechanic.getCompany());
//        }
        System.out.println();


     }
    private static void service(Transport... transports) {
        for (Transport transport : transports) {
                serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport) {
        try {
            if(!transport.service()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошёл диагностику.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}


        // ДЗ 1: 3-е задание

        /*
        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Granta";
        lada.engineVolume = 1.7;
        lada.color = "жёлтый";
        lada.productionYear = 2015;
        lada.productionCountry = "Россия";

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.engineVolume = 3.0;
        audi.color = "чёрный";
        audi.productionYear = 2020;
        audi.productionCountry = "Германия";

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.engineVolume = 3.0;
        bmw.color = "чёрный";
        bmw.productionYear = 2021;
        bmw.productionCountry = "Германия";

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage";
        kia.engineVolume = 2.4;
        kia.color = "красный";
        kia.productionYear = 2018;
        kia.productionCountry = "Южная Корея";

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.engineVolume = 1.6;
        hyundai.color = "оранжевый";
        hyundai.productionYear = 2016;
        hyundai.productionCountry = "Южная Корея";

        presentingCar(lada);
        presentingCar(audi);
        presentingCar(bmw);
        presentingCar(kia);
        presentingCar(hyundai);*/


        // ДЗ 2: 2-е задание

//        Car lada = new Car("Lada", "Granta", 1.7, "жёлтый", 2015, "Россия", "АКПП", "Хэчбэк", "f555jj666", 4, false, new Car.Key(true, true), null);
//        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный", 2020, "Германия", "АКПП", "Хэчбэк", "z123ov456", 7, true, new Car.Key(false, true), new Car.Insurance(LocalDate.now(), 456.52, "58745"));
//        Car bmw = new Car("BMW", "Z8", 3.0, "чёрный", 2021, "Германия", "АКПП", "Внедорожник", "Кабриолет", 4, false, new Car.Key(true, false), new Car.Insurance(LocalDate.of(2022, 07, 11), 555.55, "153654123564"));
//        Car kia = new Car("Kia", "Sportage", 2.4, "красный", 2018, "Южная Корея", "АКПП", "Минивэн", "п545пр456", 5, false, new Car.Key(false, true), null);
//        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "АКПП", "Кроссовер", "g879gh569", 9, false, new Car.Key(false, false), null);
//
//        lada.setKey(new Car.Key(false,false));
//        lada.setInsurance(new Car.Insurance(LocalDate.of(2022, 12, 31), 777.77, "153654152"));
//
//
//        System.out.println(lada);
//        System.out.println(audi);
//        System.out.println(bmw);
//        System.out.println(kia);
//        System.out.println(hyundai);
//
//        System.out.println();
//
//        // ДЗ 3: 2-е задание
//        Car chayka = new Car("GAZ");
//        System.out.println(chayka);
//
//        //ООП Полиморфизм: ДЗ 1: 1-е задание
//
//
//        Train lastochka = new Train("Ласточка", "B-901",
//                2011, "Россия",
//                3500, 0,
//                "Москва, Белорусский вокзал",
//                "Минск", 11, 301);
//
//        Train leningrad = new Train("Ленинград", "D-125",
//                2019, "Россия",
//                1700, 0,
//                "Москва, Ленинградский вокзал",
//                "Ленинград-Пассажирский", 8,
//                270);
//
//
//        System.out.println();
//        System.out.println(lastochka);
//        System.out.println(leningrad);
//
//        System.out.println();
//        Bus ikarus = new Bus("Икарус", "356", 2018, "Венгрия", "Красный", 150);
//        Bus liaz = new Bus("ЛиАЗ", "14-5", 2011, "Россия", "Жёлтый", 120);
//        Bus laz = new Bus("ЛАЗ", "ZERO", 1969, "Россия", "Белый", 90);
//
//        System.out.println();
//        System.out.println(ikarus);
//        System.out.println(liaz);
//        System.out.println(laz);
//
//        System.out.println();
//        lada.refill();
//        lastochka.refill();
//        ikarus.refill();
//


    // ДЗ 1: 3-е задание
    /*public static void presentingCar(Car car) {
        System.out.println("Марка: " + car.brand + ". Модель: " + car.model +
                ". Объём двигателя в литрах: " + car.engineVolume + ". Цвет: " + car.color +
                ". Год производства: " + car.productionYear + ". Страна сборки: " + car.productionCountry);
    }*/
