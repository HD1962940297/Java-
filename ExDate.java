package Jhomework_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class ExDate {

	public static void main(String[] args) {
		
		date();
	}
	
	//判断输入的日期字符串是否符合yyyy/mm/dd的格式
	public static void date() {
		
		try {
			
			System.out.println("请输入 "+"yyyy/mm/dd"+" 格式的日期：");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			Date d = new SimpleDateFormat("yyyy/MM/dd").parse(str);
			System.out.println(d);
		}catch (Exception e) {

			e.printStackTrace();
			System.out.println("输入的格式有误，请重新输入：");
			date();
		}
	}
}
