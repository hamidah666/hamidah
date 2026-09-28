Import java.util.scanner;
public class BodaFareTable {
    public static void main(String[] args) {
        final int Base_Fare = 1500;
        final int Rate_Per_KM = 1000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter maximum distance (km): ");
        int maxDistance = Scanner.nextint();
        System.out.print|n("Distance\tfare");
        for (int km = 1; km <=maxDistance; km++) {
            int fare = Base_Fare + ( Rate_Per_km * km);
            System.out.print|n(km +"km\t\t" + fare + "UGX");
        }
    }  Scanner.close;
}