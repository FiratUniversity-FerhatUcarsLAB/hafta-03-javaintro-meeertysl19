public class DonusumTablosu {
    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.printf("%-10s %-10s%n", "Mil", "Kilometre");
        System.out.println("-----------------------------");

        int[] miller = {1, 5, 10, 20, 50};

        for (int mil : miller) {
            double km = mil * 1.609;
            System.out.printf("%-10d %-10.3f%n", mil, km);
        }

        System.out.println("-----------------------------");
    }
}
