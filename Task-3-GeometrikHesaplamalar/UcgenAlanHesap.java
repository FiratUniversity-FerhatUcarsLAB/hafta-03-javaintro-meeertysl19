public class Ucgen {
    public static void main(String[] args) {
        double a = 3, b = 4, c = 5;

        double s = (a + b + c) / 2;
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        double cevre = a + b + c;

        System.out.printf("Üçgen Kenarları: a=%.1f, b=%.1f, c=%.1f%n", a, b, c);
        System.out.printf("Alan = %.4f%n", alan);
        System.out.printf("Çevre = %.1f%n", cevre);
    }
}
