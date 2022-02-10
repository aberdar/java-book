package aberdar.interfaces.requirementsForMethods;

public class RequirementsForMethods {

    public static void main(String[] args) {
        SportCar car = new SportCar();
        car.StartEngine();
        car.StopEngine();
    }
}

interface Car {
    boolean StartEngine();
    void StopEngine();
}

class SportCar implements Car {
    private boolean started;

    public boolean StartEngine() {
        if (started) {
            return false;
        }

        started = true;
        System.out.println("Start Engine");
        return true;
    }

    public void StopEngine() {
        started = false;
        System.out.println("Stop Engine");
    }
}
