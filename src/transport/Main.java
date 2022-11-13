package transport;

import driver.DriverB;
import driver.DriverC;
import driver.DriverD;

public class Main {
    public static void main(String[] args) {

        // Легковые автомобили
        System.out.println("-------------------");
        System.out.println("Легковые автомобили");
        System.out.println("-------------------");

        Car ladaGrande = new Car("Lada", "Grande", 1.7f);
        Car audiA8 = new Car("Audi", "A8", 3.0f);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0f);
        Car kiaSportage4 = new Car("Kia", "Sportage 4", 2.4f);

        DriverB driverBladaGrande = new DriverB("Иванов", 1, ladaGrande);
        DriverB driverBaudiA8 = new DriverB("Петров", 2, audiA8);
        DriverB driverBbmwZ8 = new DriverB("Семенов", 2, bmwZ8);
        DriverB driverBkiaSportage4 = new DriverB("Сидоров", 3, kiaSportage4);

        System.out.println(driverBladaGrande);
        System.out.println(driverBaudiA8);
        System.out.println(driverBbmwZ8);
        System.out.println(driverBkiaSportage4);

        ladaGrande.pitStop();
        ladaGrande.getBestLapTime();
        ladaGrande.getMaxSpeed();

        audiA8.pitStop();
        audiA8.getBestLapTime();
        audiA8.getMaxSpeed();

        bmwZ8.pitStop();
        bmwZ8.getBestLapTime();
        bmwZ8.getMaxSpeed();

        kiaSportage4.pitStop();
        kiaSportage4.getBestLapTime();
        kiaSportage4.getMaxSpeed();

        // Грузовые автомобили
        System.out.println("-------------------");
        System.out.println("Грузовые автомобили");
        System.out.println("-------------------");

        Truck maz = new Truck("Maz", "111", 12.7f);
        Truck kamaz = new Truck("Kamaz", "222", 13.0f);
        Truck volvo = new Truck("Volvo", "333", 15.5f);
        Truck man = new Truck("Man", "444", 16.4f);

        DriverC driverCmaz = new DriverC("Квасов", 11, maz);
        DriverC driverCkamaz = new DriverC("Пупкин", 8, kamaz);
        DriverC driverCvolvo = new DriverC("Захаров", 15, volvo);
        DriverC driverCman = new DriverC("Карпин", 12, man);

        System.out.println(driverCmaz);
        System.out.println(driverCkamaz);
        System.out.println(driverCvolvo);
        System.out.println(driverCman);

        maz.pitStop();
        maz.getBestLapTime();
        maz.getMaxSpeed();

        kamaz.pitStop();
        kamaz.getBestLapTime();
        kamaz.getMaxSpeed();

        volvo.pitStop();
        volvo.getBestLapTime();
        volvo.getMaxSpeed();

        man.pitStop();
        man.getBestLapTime();
        man.getMaxSpeed();

        // Автобусы
        System.out.println("-------------------");
        System.out.println("Автобусы");
        System.out.println("-------------------");

        Bus paz = new Bus("Paz", "5df", 4.75f);
        Bus gazel = new Bus("Gazel", "67ju", 7.5f);
        Bus ford = new Bus("Ford", "90hg", 3.5f);
        Bus jac = new Bus("Jac", "76dr", 6.4f);

        DriverD driverDpaz = new DriverD("Смирнов", 3, paz);
        DriverD driverDgazel = new DriverD("Губарев", 14, gazel);
        DriverD driverDford = new DriverD("Левкин", 8, ford);
        DriverD driverDjac = new DriverD("Голубев", 6, jac);

        System.out.println(driverDpaz);
        System.out.println(driverDgazel);
        System.out.println(driverDford);
        System.out.println(driverDjac);

        paz.pitStop();
        paz.getBestLapTime();
        paz.getMaxSpeed();

        gazel.pitStop();
        gazel.getBestLapTime();
        gazel.getMaxSpeed();

        ford.pitStop();
        ford.getBestLapTime();
        ford.getMaxSpeed();

        jac.pitStop();
        jac.getBestLapTime();
        jac.getMaxSpeed();

    }

}