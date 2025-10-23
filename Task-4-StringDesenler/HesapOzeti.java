public class HesapOzeti {
    public static void main(String[] args) {
        String urun1 = "Elma";
        String urun2 = "Ekmek";
        String urun3 = "Süt";

        int miktar1 = 3, miktar2 = 2, miktar3 = 1;
        double fiyat1 = 5.25, fiyat2 = 7.50, fiyat3 = 12.00;

        System.out.println("-------------------------------");
        System.out.printf("%-10s %5s %10s%n", "Ürün", "Adet", "Fiyat (TL)");
        System.out.println("-------------------------------");
        System.out.printf("%-10s %5d %10.2f%n", urun1, miktar1, miktar1 * fiyat1);
        System.out.printf("%-10s %5d %10.2f%n", urun2, miktar2, miktar2 * fiyat2);
        System.out.printf("%-10s %5d %10.2f%n", urun3, miktar3, miktar3 * fiyat3);
        System.out.println("-------------------------------");

        double toplam = miktar1 * fiyat1 + miktar2 * fiyat2 + miktar3 * fiyat3;
        System.out.printf("%-10s %15.2f%n", "TOPLAM:", toplam);
        System.out.println("-------------------------------");
    }
}
