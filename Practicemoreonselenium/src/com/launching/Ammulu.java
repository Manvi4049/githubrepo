package com.launching;

public class Ammulu 
{
	static int gcd(int a, int b)
	{
		if(a==0|| b==0)
			return 0;
		if(a==b)
			return a;
		if(a>b)
			return gcd(a-b,b);
		return gcd(a,b-a);
	}
	static boolean coprime(int a,int b)
	{
		return(gcd(a,b)==1);

	}
	static int numofpairs(int arr[],int n)
	{
		int count =0;
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
				if(coprime(arr[i],arr[j]))
					count++;
		return count;
	}

	public static void main(String[] args)
	{
		int arr[]= {2,6,9 };
		int n = arr.length;
		System.out.println(numofpairs(arr,n));
	}

}
