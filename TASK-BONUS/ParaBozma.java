public class ParaBozma {
    public static void main(String[] args) {
        int miktar = 278;
        int kalan = miktar;

        int yuz = kalan / 100; kalan %= 100;
        int elli = kalan / 50; kalan %= 50;
        int yirmi = kalan / 20; kalan %= 20;
        int on = kalan / 10; kalan %= 10;
        int bes = kalan / 5; kalan %= 5;
        int iki = kalan / 2; kalan %= 2;
        int bir = kalan;

        System.out.printf("%d TL = %dx100, %dx50, %dx20, %dx10, %dx5, %dx2, %dx1%n",
                miktar, yuz, elli, yirmi, on, bes, iki, bir);
    }
}
