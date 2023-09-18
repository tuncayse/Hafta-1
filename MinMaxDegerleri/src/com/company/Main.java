import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        int n = scan.nextInt();
        int max = 0, min = 0;
        for (int i = 1; i <= n ; i++){
            System.out.println("Sayiyi Giriniz:");
            int number = scan.nextInt();

            if (i == 1){
                min = number;
                max = number;
            }
            if (number < min){
                min = number;
            }
            if (number > max){
                max = number;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}