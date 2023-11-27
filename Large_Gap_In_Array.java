/* This is a Java program to calculate the largest gap between
sorted elements of an array of integers*/

package Gapping_Range_pack1;

import java.util.Arrays;

public class Large_Gap_In_Array {

	public static void main(String[] args) {
		int[] arr= {28,43,-5,83,75,39};
		
		Large_Gap_In_Array l=new Large_Gap_In_Array();
		int gap=l.getGap(arr);
		System.out.println("Large Gap is : "+gap);
		
	}
	public int getGap(int[] arr)
	{
		int largeGap=0;
		if(arr==null||arr.length<2)
		{
			System.out.println("Al least Two element should be in the list");
			return -1;
		}
		
		Arrays.sort(arr);
		
		for(int i=1;i<arr.length;i++)
		{
			int currentGap=arr[i]-arr[i-1];
			if(currentGap>largeGap)
			{
				largeGap=currentGap;
			}
		}
		return largeGap;
	}

}
