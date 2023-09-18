public class Main {
    public static void main(String[] args) {
        int n = 2;
        for (int i = 1; i <= 100; i++) {

            while ((i >= n) && (i % n != 0)) {
                n++;
            }

            if (i == n) {
                System.out.print(i + ", ");
            }
            n = 2;
        }
    }
}