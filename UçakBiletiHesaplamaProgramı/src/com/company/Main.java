import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        double mesafe = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int yolculukTipi = input.nextInt();

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        double mesafeUcreti = mesafe * 0.10;

        double yasIndirimi = 0;
        if (yas < 12) {
            yasIndirimi = mesafeUcreti * 0.50;
        } else if (yas >= 12 && yas <= 24) {
            yasIndirimi = mesafeUcreti * 0.10;
        } else if (yas >= 65) {
            yasIndirimi = mesafeUcreti * 0.30;
        }

        double indirimliTutar = mesafeUcreti - yasIndirimi;
        if (yolculukTipi == 2) {
            indirimliTutar *= 0.80;
        }

        double toplamTutar = yolculukTipi == 2 ? indirimliTutar * 2 : indirimliTutar;

        System.out.println("Toplam Tutar = " + toplamTutar + " TL");


    }
}