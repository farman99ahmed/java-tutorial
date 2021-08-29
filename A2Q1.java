// Abstract class
abstract class Car {
    abstract void start();
}

class Audi extends Car {
    void start() {
        System.out.println("Car started");
    }
    public static void main(String args[]) {
        Car c1 = new Audi();
        c1.start();
    }
}

// Interface 
interface Bike {
    void start();
}
class KTM implements Bike {
    public void start() {
        System.out.println("KTM started");
    }
}
class BMW implements Bike {
    public void start() {
        System.out.println("BMW started");
    }
}

class A2Q1 {
    public static void main(String args[]) {
        Bike ktm = new KTM();
        ktm.start();
    }
}