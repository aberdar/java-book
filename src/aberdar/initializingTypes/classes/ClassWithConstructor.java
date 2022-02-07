package aberdar.initializingTypes.classes;

public class ClassWithConstructor {

    public static void main(String[] args) {
        YourPhone iphone = new YourPhone("Iphone XR");

        Personage human = new Personage("Alexander", "Berdar", new YourPhone("Samsung"));

        System.out.println(human.personalPhone.model);
        System.out.println(iphone.model);
    }
}

class YourPhone {
    public String model;

    public YourPhone(String model) {
        this.model = model;
    }
}

class Personage {
    public String firstName;
    public String lastName;
    public YourPhone personalPhone;

    public Personage(String firstName, String lastName, YourPhone personalPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalPhone = personalPhone;
    }
}

