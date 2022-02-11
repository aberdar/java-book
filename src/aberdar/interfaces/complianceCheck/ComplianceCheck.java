package aberdar.interfaces.complianceCheck;

public class ComplianceCheck {

    public static void main(String[] args) {
        Flowers rose = new Flowers("Rose");
        boolean isId = rose instanceof Id;
        boolean isName = rose instanceof Name;

        Name pName = (Name) rose;
        String name = pName.getName();

        System.out.println("isId is " + isId); // false
        System.out.println("isName is " + isName); // true
        System.out.println("name is " + name); // Rose
    }
}

interface Id {
    int getId();
}

interface Name {
    String getName();
}

class Flowers implements Name {
    private String name;

    public Flowers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
