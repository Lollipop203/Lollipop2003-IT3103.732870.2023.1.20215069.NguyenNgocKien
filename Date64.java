import java.util.Scanner;

public class Date64 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    //nhap so lieu tu ban phim
	    System.out.println("Nhap nam :");	
	    int nam=sc.nextInt();
	    System.out.println("Nhap thang :");	
	    int thang=sc.nextInt();
	    //kiem tra thangs
	    switch(thang) {
	    case 1,3,5,7,8,10,12:
	      System.out.println("thang"+thang+"nam"+nam+"co 31 ngay");
	      break;
	    case 4,6,9,11:
	    	 System.out.println("thang"+thang+"nam"+nam+"co 30 ngay");
	      break;
	    case 2:
	    	//kiem tra thang 2
	    	if(nam%4!=0)  System.out.println("Thang 2 nam "+nam+" co 28 ngay");
	    	else  System.out.println("Thang 2 nam "+nam+"co 29 ngay");
	      break;
	    default:
	  }
	}

}
