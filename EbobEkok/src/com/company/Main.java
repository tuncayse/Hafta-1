import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2;
        Scanner input = new Scanner(System.in);

        //kullanıcıdan sayıları girmesi istenir.
        System.out.println("1. Sayıyı Giriniz: ");
        num1 = input.nextInt();
        System.out.println("2. Sayıyı Giriniz: ");
        num2 = input.nextInt();
        int ebob = 1;
        int i = 1;

        if(num1 > num2) {
            while( i <= num2) {
                if(num1 % i == 0 && num2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.println(ebob);
        } else {
            while(i <= num1) {
                if( num1 % i == 0 && num2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.println(ebob);
        }

        int ekok = (num1*num2) / ebob;
        System.out.println(ekok);
    }
}