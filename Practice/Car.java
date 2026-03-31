package Practice;

public class Car {
    Engine e;
    Car()
    {
        e= new Engine();
    }
    void startCar()
    {
        e.start();
        System.out.println("car has been started");
    }

    static void main() {
        Car c = new Car();
        c.startCar();
    }
}
