import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //kullanıcıdan bir sayı girmesini istiyoruz.
        System.out.print("Bir Sayi Giriniz : ");
        int sayı = inp.nextInt();
        int total = 0;
        for (int i = 1; i < sayı ; i++){
            if (sayı % i == 0){
                total += i;
            }

        }
        if (sayı == total){
            System.out.println( sayı +" Mukemmel Bir Sayidir.");
        }
        else{
            System.out.println( sayı +" Mukemmel Bir Sayi Değildir.");
        }
    }
}
