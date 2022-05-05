import java.util.*;
public class Main
{

	static void Combination(int arr[],int n,int r,int index,int data[],int i)
	{
	    if(index==r)
		{
		    for(int j=0;j<r;j++)
		    {
		        System.out.println(data[j]);
		    }
		    System.out.println("");
		    return;
		}
		if(i>=n)
		return;
		data[index]=arr[i];
		Combination(arr,n,r,index+1,data,i+1);
		Combination(arr,n,r,index,data,i+1);
	}
	static void printCombination(int arr[],int n,int r)
	{
	    int data[]=new int[r];
	    Combination(arr,n,r,0,data,0);
	}
		public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int r=s.nextInt();
	
		int arr[]=new int[number];
		
		for(int i=0;i<number;i++)
		{
		    arr[i]=s.nextInt();
		}
			int n=arr.length;
			printCombination(arr, n, r);
	}
}
