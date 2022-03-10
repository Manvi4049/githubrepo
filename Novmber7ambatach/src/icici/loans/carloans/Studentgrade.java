package icici.loans.carloans;

import java.util.Scanner;

public class Studentgrade 
{

	public static void main(String[] args) 
	{
     int [] marks = new int[5];
       float sum=0.0f,avg =0.0f;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter  marks obtained in 5 subjects");
      for(int i=0;i<marks.length;i++)
      {
    	  marks[i] = sc.nextInt();
    	  sum = sum+marks[i];
      }
      System.out.println("sum of 5 subjects:"+sum);
       avg =sum/marks.length;
       System.out.println("avegrage of subject is :"+avg);
       
       if(avg>80)
       {
    	   System.out.println("A");
       }
       else if(avg>60 && avg<=80)
       {
    	   System.out.println("B");
       }
       else if(avg>40&&avg<=60)
       {
    	   System.out.println("c");
    	  
       }
       else
       {
    	   System.out.println("fail");
       }
	}

	

}
