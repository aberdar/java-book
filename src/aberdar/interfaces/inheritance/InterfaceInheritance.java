package aberdar.interfaces.inheritance;

public class InterfaceInheritance {

    public static void main(String[] args) {
        Kamaz kamaz = new Kamaz();
        Vehicle vehicle = (Vehicle) kamaz;
        int maxSpeed = vehicle.getMaxSpeed();

        System.out.println("Max Speed is " + maxSpeed);
    }
}

interface Vehicle {
    int getMaxSpeed();
}

interface Truck extends Vehicle{
    int getCapacity();
}

class Kamaz implements Truck {
    public int getMaxSpeed() {
        return 85;
    }

    public int getCapacity() {
        return 8000;
    }
}