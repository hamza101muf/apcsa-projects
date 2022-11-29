public class BandBooster {
    private String name;
    private int boxesSold;

public BandBooster(String userName) {
    boxesSold = 0;
    name = userName;
}

public String getName() {
    return name;
}

public void updateSales(int boxes) {
    boxesSold += boxes;
}

public String toString() {
    return(name+": "+boxesSold+" boxes");
}



}