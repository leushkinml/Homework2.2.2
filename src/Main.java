import java.sql.Time;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

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

        Car lada = new Car("Lada", "Granta", 1.7, "жёлтый", 2015, "Россия", "АКПП", "Хэчбэк", "f555jj666", 4, false, new Car.Key(true, true), null);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный", 2020, "Германия", "АКПП", "Хэчбэк", "z123ov456", 7, true, new Car.Key(false, true), new Car.Insurance(LocalDate.now(), 456.52, "58745"));
        Car bmw = new Car("BMW", "Z8", 3.0, "чёрный", 2021, "Германия", "АКПП", "Внедорожник", "Кабриолет", 4, false, new Car.Key(true, false), new Car.Insurance(LocalDate.of(2022, 07, 11), 555.55, "153654123564"));
        Car kia = new Car("Kia", "Sportage", 2.4, "красный", 2018, "Южная Корея", "АКПП", "Минивэн", "п545пр456", 5, false, new Car.Key(false, true), null);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "АКПП", "Кроссовер", "g879gh569", 9, false, new Car.Key(false, false), null);

        lada.setKey(new Car.Key(false,false));
        lada.setInsurance(new Car.Insurance(LocalDate.of(2022, 12, 31), 777.77, "153654152"));


        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        System.out.println();

        // ДЗ 3: 2-е задание
        Car chayka = new Car("GAZ");
        System.out.println(chayka);

        //ООП Полиморфизм: ДЗ 1: 1-е задание


        Train lastochka = new Train("Ласточка", "B-901",
                2011, "Россия",
                3500, 0,
                "Москва, Белорусский вокзал",
                "Минск", 11, 301);

        Train leningrad = new Train("Ленинград", "D-125",
                2019, "Россия",
                1700, 0,
                "Москва, Ленинградский вокзал",
                "Ленинград-Пассажирский", 8,
                270);


        System.out.println();
        System.out.println(lastochka);
        System.out.println(leningrad);

        System.out.println();
        Bus ikarus = new Bus("Икарус", "356", 2018, "Венгрия", "Красный", 150);
        Bus liaz = new Bus("ЛиАЗ", "14-5", 2011, "Россия", "Жёлтый", 120);
        Bus laz = new Bus("ЛАЗ", "ZERO", 1969, "Россия", "Белый", 90);

        System.out.println();
        System.out.println(ikarus);
        System.out.println(liaz);
        System.out.println(laz);

        System.out.println();
        lada.refill();
        lastochka.refill();
        ikarus.refill();

    }

    // ДЗ 1: 3-е задание
    /*public static void presentingCar(Car car) {
        System.out.println("Марка: " + car.brand + ". Модель: " + car.model +
                ". Объём двигателя в литрах: " + car.engineVolume + ". Цвет: " + car.color +
                ". Год производства: " + car.productionYear + ". Страна сборки: " + car.productionCountry);
    }*/
}