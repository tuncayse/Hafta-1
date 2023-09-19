import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir tam sayı girin: ");
        int tamSayi = input.nextInt();

        System.out.print("Bir ondalıklı sayı girin: ");
        double ondalikliSayi = input.nextDouble();

        double tamSayiOndalikli = (double) tamSayi;

        int ondalikliSayiTam = (int) ondalikliSayi;

        System.out.println("Tam sayıyı ondalıklı sayıya dönüştürdüğünde: " + tamSayiOndalikli);
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürdüğünde: " + ondalikliSayiTam);
    }
}