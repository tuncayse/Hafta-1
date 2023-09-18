import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Kullanıcıdan sayılar istenir
        System.out.println("1. Sayiyi Girin: ");
        int a = scan.nextInt();

        System.out.println("2. Sayiyi Girin: ");
        int b = scan.nextInt();

        System.out.println("3. Sayiyi Girin: ");
        int c = scan.nextInt();

        int sonuc = a + (b * c) -b;
        System.out.println("sonuc : " + sonuc);
    }
}