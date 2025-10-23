public class Daire {
    public static void main(String[] args) {
        double r = 5.5;
        double alan = Math.PI * r * r;
        double cevre = 2 * Math.PI * r;

        System.out.printf("Daire Yarıçapı: %.2f%n", r);
        System.out.printf("Alan = %.4f%n", alan);
        System.out.printf("Çevre = %.4f%n", cevre);
    }
}
