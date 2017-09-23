package J_work;

import java.util.Scanner;

public class Java_1 {

	static double n=0,m=0;
	static double k=2.0;
	
	public static void f(double d) {
		
		if(d<=5000&&d>=m){
			
			System.out.println(d);
			d=d*k;
			f(d);
		}else if(d>5000){
			
			System.out.println(d);
			System.out.println(d);
			k=0.5;
			d=d*k;
			f(d);
		}else
			System.out.println("over");
	}
	
	public static void main(String[] args) {
		
		System.out.println("请输入一个大于0的整数：");
		Scanner nScanner = new Scanner(System.in);
		if(nScanner.hasNext()){
			
			n = nScanner.nextInt();
			m=n;
			f(n);
		}

	}

}
