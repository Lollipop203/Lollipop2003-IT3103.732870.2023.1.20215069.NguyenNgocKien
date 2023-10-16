
import java.util.Scanner;

public class FirstDegree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//khai báo biến yêu cầu nhập dữ liệu
		System.out.println("Nhap a11: ");
		double a11=sc.nextDouble();
		System.out.println("Nhap a12: ");
		double a12=sc.nextDouble();
		System.out.println("Nhap a21: ");
		double a21=sc.nextDouble();
		System.out.println("Nhap a22: ");
		double a22=sc.nextDouble();
		System.out.println("Nhap b1: ");
		double b1=sc.nextDouble();
		System.out.println("Nhap b2: ");
		double b2=sc.nextDouble();
		double A=a11*a22-a21*a12;
		double A1=b1*a22-b2*a12;
		double A2=a11*b2-a21*b1;
		//tim nghiem
		if(A!=0) {
			double x1=A1/A;
			double x2=A2/A;
			System.out.println("Nghiem x1 = "+x1);
			System.out.println("Nghiem x2 = "+x2);
		}
		else {
			if(A1==0||A2==0) {
				System.out.println("Phuong trinh vo nghiem");
				}
			else {
				System.out.println("Phuong trinh vo so nghiem");
			}							
		}
		
	}
}
