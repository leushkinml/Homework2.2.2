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

        Car lada = new Car("Lada", "Granta", 1.7, "жёлтый", 2015, "Россия", "АКПП", "Хэчбэк", "f555jj666", 4, false, null, null);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный", 2020, "Германия", "АКПП", "Хэчбэк", "z123ov456", 7, true, null, null);
        Car bmw = new Car("BMW", "Z8", 3.0, "чёрный", 2021, "Германия", "", "", "", 4, false, null, null);
        Car kia = new Car("Kia", "Sportage", 2.4, "красный", 2018, "Южная Корея", "", "", "", 4, false, null, null);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "", "", "", 4, false, null, null);


        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        System.out.println();

        // ДЗ 3: 2-е задание
        Car chayka = new Car("GAZ");
        System.out.println(chayka);
    }

    // ДЗ 1: 3-е задание
    /*public static void presentingCar(Car car) {
        System.out.println("Марка: " + car.brand + ". Модель: " + car.model +
                ". Объём двигателя в литрах: " + car.engineVolume + ". Цвет: " + car.color +
                ". Год производства: " + car.productionYear + ". Страна сборки: " + car.productionCountry);
    }*/
}