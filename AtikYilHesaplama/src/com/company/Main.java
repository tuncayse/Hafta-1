import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int tarih;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yılı giriniz :");
        tarih = inp.nextInt();

        if (tarih % 400 == 0 ) {
            System.out.println(tarih + "Bir artık yıldır.");
        }
        else if (tarih % 100 == 0 ) {
            System.out.println(tarih + "Bir artık yıl değildir.");
        }
        else if (tarih % 4 == 0 ) {
            System.out.println(tarih + "Bir artık yıldır.");
        }
        else {
            System.out.println(tarih + "Bir artık yıl değildir.");
        }
    }
}
