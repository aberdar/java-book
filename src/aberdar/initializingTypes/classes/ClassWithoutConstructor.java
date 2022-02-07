package aberdar.initializingTypes.classes;

public class ClassWithoutConstructor {

    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.model = "Iphone XR";

        Phone samsung = new Phone();
        samsung.model = "Samsung G5";

        Employee human = new Employee();
        human.firstName = "Alexander";
        human.lastName = "Berdar";
        human.personalPhone = iphone;

        System.out.println(human.personalPhone.model);
        System.out.println(samsung.model);
    }
}

class Phone {
    public String model;
}

class Employee {
    public String firstName;
    public String lastName;
    public Phone personalPhone;
}
