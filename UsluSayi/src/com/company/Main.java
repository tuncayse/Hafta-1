import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k;
        Scanner scan = new Scanner(System.in);
        int sonuc = 1;

        System.out.print("Üssü alınacak sayı: ");
        k = scan.nextInt();

        System.out.print("Üs olacak sayı: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            sonuc *= k;
        }

        System.out.println( sonuc);
    }
}