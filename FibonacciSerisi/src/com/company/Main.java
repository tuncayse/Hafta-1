import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan Değer alınır.
        System.out.print("Fibonacci serisinin eleman sayisini giriniz: ");

        //Değişkenler tanımlanır.
        int n = inp.nextInt();
        int fibo1 = 0, fibo2 = 1;

        System.out.print("Fibonacci Serisi: " + fibo1 + " " + fibo2);

        //For Döngüsü Kurullur
        for (int i = 2; i < n; i++) {
            int yeniEleman = fibo1 + fibo2;
            System.out.print(" " + yeniEleman);
            fibo1 = fibo2;
            fibo2 = yeniEleman;
        }
    }
}