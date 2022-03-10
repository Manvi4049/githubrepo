package icici.loans.carloans;

public class Twodimensionalarray
{

	public static void main(String[] args) 
	{
   //int[] a= {10,20,30,40};
   //int[] a = new int[4];
		int [][] a= {  
				
			{1,2,3},
			{5,6,4},
			{7,8,9}
		};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			//for(int j=0;j<a[i].length;j++)// this used for columns and rows are not equal
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
		for(int[] p:a)// adavnced for loop
		{
			for(int q:p)
			{
				System.out.print(q+"  ");
			}
			System.out.println();
		}
   
   
	}

}
