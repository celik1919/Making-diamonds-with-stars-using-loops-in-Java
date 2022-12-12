import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner mec = new Scanner(System.in);
        System.out.print("Enter diamond height: ");
        int n = mec.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int r = 1; r <= (2 * i - 1); r++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int k = (n - i); k >= 1; k--) {
                System.out.print(" ");
            }
            for (int r = (2 * i - 1); r >= 1; r--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
