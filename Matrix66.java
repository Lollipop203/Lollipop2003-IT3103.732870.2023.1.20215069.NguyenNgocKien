import java.util.Arrays;
import java.util.Scanner;
public class Matrix66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mang A va B");
        System.out.println("chieu dai la");
        int d=sc.nextInt();
        System.out.println("chieu rong la");
        int r=sc.nextInt();
        int[][] A=new int[d][r];
        System.out.println("nhap ma tran A");
        for(int i=0;i<=d-1;i++) {
        	for(int j=0;j<=r-1;j++) {
        		System.out.println("A["+(i+1)+"]["+(j+1)+"]=");       	
        		A[i][j]=sc.nextInt();
        	}
        }
        int[][] B=new int[d][r];
        System.out.println("nhap ma tran B");
        for(int i=0;i<=d-1;i++) {
        	for(int j=0;j<=r-1;j++) {
        		System.out.println("B["+(i+1)+"]["+(j+1)+"]=");  
        		B[i][j]=sc.nextInt();
        	}
        }
        //khai bao ma tran tong
        int[][] Sum=new int[d][r];
        //A+B
        for(int i=0;i<=d-1;i++) {
        	for(int j=0;j<=r-1;j++) {
        		Sum[i][j]=A[i][j]+B[i][j];
        	}
        }
        System.out.println("Tong hai ma tran A+B la:");
        //in ma tran C
        for(int i=0;i<=d-1;i++) {
        	for(int j=0;j<=r-1;j++) {
        		System.out.print(" "+Sum[i][j]+" "  );
        	}
        	System.out.println();
        	
        }
        
    }

}