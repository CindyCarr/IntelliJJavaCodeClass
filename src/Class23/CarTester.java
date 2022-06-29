package Class23;

public class CarTester {
    public static void main(String[] args) {
       /*Car car = new Tesla();
        //car = new Toyota();
        //car.start();

        BMW bmw = new BMW();
        bmw.start();
        bmw.stop();
        bmw.park();

        Tesla tesla = new Tesla();
        tesla.start();
        tesla.stop();
        tesla.park();

        Toyota toyota = new Toyota();
        tesla.start();
        tesla.stop();
        tesla.park();

        Car car= new Tesla();
        car.start();
        car.stop();
        car.park(); */

        Car[] cars = {new BMW(), new Tesla(), new Toyota()};

        for (Car c : cars) {
            c.start();
            c.stop();
            c.park();
        }

    }
}