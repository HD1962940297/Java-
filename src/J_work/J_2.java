package J_work;

import java.util.Scanner;

public class J_2 {

	static int N=6,m=1;
	static int[][] a;
	
	private static void init(int N){     //���ݴ����Nֵ��ʼ������
		
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
	
	private static void out(){     //�������
		
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
		
		System.out.println("������һ��4-10��������");
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextInt()){
			
			N=scanner.nextInt();
			a=new int[N][N];
			init(N);
			out();
		}
	}
}
