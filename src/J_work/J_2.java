package J_work;

import java.util.Scanner;

public class J_2 {

	static int N=6,m=1;
	static int[][] a;
	
	private static void init(int N){     //根据传入的N值初始化数组
		
		int i=0;
		int j=0;
		int k=0;
		int n=N;
		for(;i<N;i++){
			for(;j<N;j++){
				
				a[j][i]=m;
				m++;
			}                 
			i++;
			j--;
			for(;i<N;i++){
				
				a[j][i]=m;
				m++;
			}               
			j--;
			i--;
			for(;j>=n-N;j--){
				
				a[j][i]=m;
				m++;
			}                
			i--;
			j++;
			for(;i>n-N;i--){
				
				a[j][i]=m;
				m++;
			}                
			j++;
			N--;
		}
	}
	
	private static void out(){     //输出方法
		
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				
				System.out.print(" "+a[i][j]);
				if(String.valueOf(a[i][j]).length()==1){
					
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("请输入一个4-10的整数：");
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt()){
			
			N=scanner.nextInt();
			a=new int[N][N];
			init(N);
			out();
		}
	}
}
