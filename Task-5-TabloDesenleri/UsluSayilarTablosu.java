public class UsluSayiTablosu {
    public static void main(String[] args) {
        System.out.println("-----------------------");
        System.out.printf("%-5s %-5s %-5s%n", "a", "a^2", "a^3");
        System.out.println("-----------------------");

        for (int a = 1; a <= 5; a++) {
            System.out.printf("%-5d %-5d %-5d%n", a, a * a, a * a * a);
        }

        System.out.println("-----------------------");
    }
}
