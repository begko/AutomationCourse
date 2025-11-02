package homeworkSeven;

public class SolarSystem {
    public static void main(String[] args) {
        System.out.println("Güneş Sistemi Gezegenleri:");

        for (Planet planet : Planet.values()) {
            System.out.println("Gezegen: " + planet);
            System.out.println("Sırası: " + planet.getOrderFromSun());
            System.out.println("Güneş'e Uzaklık (milyon km): " + planet.getDistanceFromSun());
            System.out.println("Yarıçap (km): " + planet.getRadius());
            System.out.println("Dönme Süresi (gün): " + planet.getOrbitalPeriod());
            System.out.println("-------------------------");
        }
    }
}