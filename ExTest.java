package Jhomework_1;

import java.util.Scanner;

public class ExTest {

	public static void main(String[] args) {

		determine();
	}
	
	//�ж�����������Ƿ�Ϊʮ�����ƣ�
	//����ǣ���ת����ʮ���������������������
	public static void determine() {
		
		try {
			Scanner sc = new Scanner(System.in);
	        System.out.print("\n������һ��16������:\n");
	        String str = sc.next();
	        int n = Integer.parseInt(str, 16);
	        System.out.println("����:" + str + "��ת����������:" + n );
			}catch (Exception e) {
				
				e.printStackTrace();
				System.err.println("Please enter the sixteen decimal number:\n");
				System.out.println();
				determine();
			} 
	}

}
