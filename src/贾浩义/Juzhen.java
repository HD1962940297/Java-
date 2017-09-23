package 贾浩义;

public class Juzhen {

	public static void main(String args[])
    { 
      final int SIZE=6;
      int mat[][]=new int[SIZE][SIZE];
      int i,j,k=0,n,m;
      n=SIZE;
      m=(n+1)/2;
      for(i=0;i<m;i++)
      {
         for(j=i;j<=n-i-1;j++)   //顶边，从左到右，行不变列变
             mat[i][j]=++k;      //输出1、2、3、4、13、14
         for(j=i+1;j<=n-i-1;j++)  //右边，从上到下，行变列不变
             mat[j][n-i-1]=++k;   //输出5、6、7、15
         for(j=n-i-2;j>=i;j--)    //底边，从右到左，行不变列变
             mat[n-i-1][j]=++k;     //输出8、9、10、16
         for(j=n-i-2;j>=i+1;j--)  //左边，从下到上，行变列不变
             mat[j][i]=++k;        //输出11、12
      }
      for(i=0;i<n;i++)         //输出二维数组
      {
          for(j=0;j<n;j++){
             System.out.print("  "+mat[j][i]);
             if (String.valueOf(mat[j][i]).length()==1) {
				System.out.print(" ");
			}
          }
          System.out.println();
      }
  }
}
