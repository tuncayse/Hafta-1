import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Faktoriyel Sayisi : ");
        int n = input.nextInt();
        int total = 1;

        for (int i = 1; i <= n; i++){
            total = total * i;
        }
        System.out.println(n + ". Faktoriyel :" + total);
    }
}