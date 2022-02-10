package aberdar.interfaces.collectionOfInterfaces;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionInterfaces {

    public static void main(String[] args) {
        Collection<Name> rows = Arrays.asList(
                new Flower("Rose"),
                new City("NYC"),
                new Star("Sirius")
        );

        List<String> name = rows.stream().map(e -> e.getName()).collect(Collectors.toList());
        String list = String.join(", ", name);

        System.out.println(list);
    }
}

interface Name {
    String getName();
}

class Flower implements Name {
    private String name;

    public Flower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class City implements Name {
    private String name;

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Star implements Name {
    private String name;

    public Star(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
