
// ex4: ShowTwoNumbers.java
import javax.swing.*;
//nhap vao hai so roi hien ra
public class ShowTwoNumbers {
	public static void main(String[] args) {
		String strNum1,strNum2;
		String tb="NguyenNgocKien-20215069-You have just entered: ";
		
		strNum1= JOptionPane.showInputDialog(null, "NguyenNgocKien-20215069-Please input the first number","NguyenNgocKien-20215069-Input the first number",JOptionPane.INFORMATION_MESSAGE);
		tb+= strNum1 +"and";
		
		strNum2= JOptionPane.showInputDialog(null, "NguyenNgocKien-20215069-Please input the second number","NguyenNgocKien-20215069-Input the second number",JOptionPane.INFORMATION_MESSAGE);
		tb+= strNum2;
		
		JOptionPane.showMessageDialog(null, tb,"Show two numbers",JOptionPane.INFORMATION_MESSAGE);
	
		System.exit(0);
		
		
	}
}
	//NguyenNgocKien 20215069
	