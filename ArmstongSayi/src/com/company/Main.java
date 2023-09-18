import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scan.nextInt();

        int toplam = 0;
        while (sayi != 0) {
            int basamak = sayi % 10;
            toplam += basamak;
            sayi /= 10;
        }

        System.out.println("Basamaklarının toplamı: " + toplam);
    }
}