import javax.swing.*;
public class MathTwoNumbers{
	public class ShowTwoNumbers {
		public static void main(String[] args) {
			String strNum1,strNum2;
			
			//luu gia tri nhap tu ban phim vao choi 
			strNum1= JOptionPane.showInputDialog(null, "NguyenNgocKien-20215069-Please input the first number","NguyenNgocKien-20215069-Input the first number",JOptionPane.INFORMATION_MESSAGE);
			
			strNum2= JOptionPane.showInputDialog(null, "NguyenNgocKien-20215069-Please input the second number","NguyenNgocKien-20215069-Input the second number",JOptionPane.INFORMATION_MESSAGE);
			
			//chuyen doi kieu du lieu
			double num1 = Double.parseDouble(strNum1);
			double num2 = Double.parseDouble(strNum2);
			
			// in ra ma hinh
			System.out.println(strNum1 + "+" + strNum2 + "=" +(num1+num2));
			System.out.println(strNum1 + "-" + strNum2 + "=" +(num1-num2));
			System.out.println(strNum1 + "x" + strNum2 + "=" +(num1*num2));
			System.out.println(strNum1 + "/" + strNum2 + "=" +(num1/num2));
		
			System.exit(0);
			
			
		}

	}
}