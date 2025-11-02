package homeworkSeven;

public enum Planet {
    MERKUR(1, 58, 2439, 88),
    VENUS(2, 108, 6051, 225),
    DUNYA(3, 150, 6371, 365),
    MARS(4, 228, 3390, 687),
    JUPITER(5, 778, 69911, 4333),
    SATURN(6, 1429, 58232, 10759),
    URANUS(7, 2871, 25362, 30687),
    NEPTUN(8, 4495, 24622, 60190);

    // Fields (properties)
    private final int orderFromSun;
    private final int distanceFromSun; // in million km
    private final int radius;          // in km
    private final int orbitalPeriod;   // in days

    // Constructor
    private Planet(int orderFromSun, int distanceFromSun, int radius, int orbitalPeriod) {
        this.orderFromSun = orderFromSun;
        this.distanceFromSun = distanceFromSun;
        this.radius = radius;
        this.orbitalPeriod = orbitalPeriod;
    }

    // Getter methods
    public int getOrderFromSun() {
        return orderFromSun;
    }

    public int getDistanceFromSun() {
        return distanceFromSun;
    }

    public int getRadius() {
        return radius;
    }

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }

}