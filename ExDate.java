package Jhomework_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class ExDate {

	public static void main(String[] args) {
		
		date();
	}
	
	//�ж�����������ַ����Ƿ����yyyy/mm/dd�ĸ�ʽ
	public static void date() {
		
		try {
			
			System.out.println("������ "+"yyyy/mm/dd"+" ��ʽ�����ڣ�");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			Date d = new SimpleDateFormat("yyyy/MM/dd").parse(str);
			System.out.println(d);
		}catch (Exception e) {

			e.printStackTrace();
			System.out.println("����ĸ�ʽ�������������룺");
			date();
		}
	}
}
