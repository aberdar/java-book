package aberdar.initializingTypes.transfers;

public class Transfers {

    public static void main(String[] args) {
        Metal gold = Metal.Gold;
        Planet earth = Planet.Earth;

        System.out.println(gold);
        System.out.println(earth);
    }
}

enum Metal {
    Platinum, Gold, Silver
}

enum Planet {
    Mercury, Venus, Earth
}
