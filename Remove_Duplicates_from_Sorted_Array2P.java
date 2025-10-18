/*Remove Duplicates from Sorted Array
Remove duplicates from a sorted array using two pointers and return new length.*/

import java.util.*;
public class Remove_Duplicates_from_Sorted_Array2P
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		//enter the Size of Array
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];

		//enter the value in array
		System.out.println("Enter the Values in Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		for(int i = 0; i< a.length; i++)
		{
			for(int j = i+1; j <a.length; j++)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}		

		
		//logic
		System.out.println(a[0]+" ");
		for(int i = 1; i < a.length; i++)
		{
			if(a[i] != a[i-1])
			{
				System.out.println(a[i]+ " ");
			}
		}
	}
}