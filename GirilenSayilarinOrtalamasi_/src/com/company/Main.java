import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int toplam = 0, ortalama, adet = 0, k;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi Giriniz: "); // Kullanıcıdan bir sayı girmesi istenir.
        k = input.nextInt();

        for (int i = 1 ; i <= k;   i++){
            if (i % 3 == 0 && i % 4 == 0){

                System.out.print(i + " - "); // 3'e  ve 4'e tam bölünen sayılar yazdırılıyor.
                toplam += i;
                adet ++ ;
            }
        }
        ortalama = toplam / adet;
        System.out.println("Sayilarin Ortalamasi : " + ortalama );
    }
}