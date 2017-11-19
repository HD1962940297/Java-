package Jhomework_1;

import java.util.Scanner;

public class ExTest {

	public static void main(String[] args) {

		determine();
	}
	
	//判断输入的数字是否为十六进制，
	//如果是，就转换成十进制输出，否则重新输入
	public static void determine() {
		
		try {
			Scanner sc = new Scanner(System.in);
	        System.out.print("\n请输入一个16进制数:\n");
	        String str = sc.next();
	        int n = Integer.parseInt(str, 16);
	        System.out.println("输入:" + str + "，转换成整数是:" + n );
			}catch (Exception e) {
				
				e.printStackTrace();
				System.err.println("Please enter the sixteen decimal number:\n");
				System.out.println();
				determine();
			} 
	}

}
