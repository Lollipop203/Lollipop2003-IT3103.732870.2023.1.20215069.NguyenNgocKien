import java.util.Arrays;
import java.util.Scanner;
public class Array65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử : ");
        int a = scanner.nextInt();
        int[] array = new int[a];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < a; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng trước khi sắp xếp: " + Arrays.toString(array));
        // Sắp xếp mảng
        selectionSort(array);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));
        int sum=0 ;
        for(int i=0;i<a;i++) {
        	sum=sum+array[i];
        }    
        double ave=(double)sum/a;
        System.out.println("trung binh mang:" + ave);
        scanner.close();
    }
    public static void selectionSort(int[] array) { //phuong thuc sap xep
        int n = array.length;

        for (int i = 0; i < n ; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            // Doi cho
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
