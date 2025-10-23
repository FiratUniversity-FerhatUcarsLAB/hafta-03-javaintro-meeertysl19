public class ToplamaSerisi {
    public static void main(String[] args) {
        int toplam = 0; // toplamı tutacak değişken

        // 1'den 9'a kadar sayıları topla
        for (int i = 1; i <= 9; i++) {
            toplam += i; // toplam = toplam + i
        }

        System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = " + toplam);
    }
}
