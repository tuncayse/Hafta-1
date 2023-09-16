import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;

        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz :"); //Kullanıcıdan sayı alınır.
        k = input.nextInt();

        for (int i = 1;  i <= k; i*=4){
             System.out.println(i); //4'ün kuvvetleri yazdırılır.
        }
        for (int i = 1;  i <= k; i*=5){
            System.out.println(i);  //5'in kuvvetleri yazdırılır.
        }
    }

}
