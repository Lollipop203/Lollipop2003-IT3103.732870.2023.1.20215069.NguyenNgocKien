
import java.util.Scanner;

public class SecondDegree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//khai bao va nhap du lieu tu ban phim cho cac bien
		System.out.println("enter a: ");
		double a=sc.nextDouble();
		while(a==0) {
			System.out.println("yeu cau nhap lai a khong duoc bang 0");
			a=sc.nextDouble();
		}
		System.out.println("enter b: ");
		double b=sc.nextDouble();
		System.out.println("enter c: ");
		double c=sc.nextDouble();
		double delta=b*b-4*a*c;
		double nghiem;
		//Gia pt
		if(delta==0) {  //nghiem kep
			nghiem=-b/(2*a);
			System.out.println("Nghiem cua pt "+a+"*"+"x^2"+"+"+b+"*"+"x"+"+"+c+ "la:"+ nghiem);
		}
		else if(delta<0) { //vo nghiem
			System.out.println("Phuong trinh vo nghiem");
		}
		else {  //2 nghiem phan biet delta>0
			double nghiem1,nghiem2;
			nghiem1=(-b+Math.sqrt(delta))/(2*a);
			nghiem2=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("Nghiem cua pt: "+a+"*"+"x^2"+"+"+b+"*"+"x"+"+"+c+"="+"0"+ "la:"+ nghiem1 +" va "+ nghiem2);
		}
		
	}
}