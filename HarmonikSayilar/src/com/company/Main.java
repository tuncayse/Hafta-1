import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.print("N Sayısını Girin: ");
        int n= inp.nextInt();
        double result =0.0;

        for (double i = 1; i <= n; i++){
            result += (1.0/i);
        }
        System.out.println(result);
    }
}