public class IsimKarti {
    public static void main(String[] args) {
        String ad = "Mert";
        String soyad = "Uysal";
        String ogrNo = "202500123";
        String bolum = "Bilgisayar Mühendisliği";

        System.out.println("***************************");
        System.out.println("*      ÖĞRENCİ KARTI      *");
        System.out.println("***************************");
        System.out.printf("* Ad Soyad : %-14s *%n", ad + " " + soyad);
        System.out.printf("* Öğrenci No: %-13s *%n", ogrNo);
        System.out.printf("* Bölüm     : %-14s *%n", bolum);
        System.out.println("***************************");
    }
}
