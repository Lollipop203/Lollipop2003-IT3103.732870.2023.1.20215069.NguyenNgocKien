import java.util.Scanner;

public class Bai63 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhap chieu cao cua tam giac:");
        int height = sc.nextInt(); // The height of the triangle
        for (int i = 1; i <= height; i++) {
            // Print spaces
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
