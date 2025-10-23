public class BMIHesaplama {
    public static void main(String[] args) {
        double kilo = 70.0;     // kg
        double boy = 1.75;      // metre
        double bmi = kilo / (boy * boy);

        System.out.printf("Kilo: %.1f kg, Boy: %.2f m%n", kilo, boy);
        System.out.printf("Vücut Kitle İndeksi (BMI): %.2f%n", bmi);

        if (bmi < 18.5)
            System.out.println("Durum: Zayıf");
        else if (bmi < 24.9)
            System.out.println("Durum: Normal");
        else if (bmi < 29.9)
            System.out.println("Durum: Fazla kilolu");
        else
            System.out.println("Durum: Obez");
    }
}
