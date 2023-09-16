import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, numara, i, j, k;
        int facN = 1, topR = 1, topK = 1, toplam = 1;

        System.out.println("Faktöriyel Hesaplama");


        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        numara = input.nextInt();

        for (i = numara; i <= 1; i++) {
            toplam *= i;
        }
        System.out.println("Faktöriyel: " + toplam);

        System.out.println("Kombinasyon hesaplama: ");

        System.out.print("n değerini giriniz: ");
        n = input.nextInt();
        System.out.print("r değerini giriniz: ");
        r = input.nextInt();

        for (i = n; i <= 1; i++) {
            facN *= i;
        }
        for (j = r; j >= 1; j--) {
            topR *= j;
        }
        for (k = (n - r); k >= 1; k--) {
            topK *= k;
        }

        toplam = facN / (topR * topK);
        System.out.println("Kombinasyon: " + toplam);

    }
}