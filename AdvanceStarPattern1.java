

/*
	**
	***
	****
	*****
	******
	*******
	********
	*********
	********
	*******
	******
	*****
	****
	***
	**
	*

*/
package Advance_StarPackage;

public class AdvanceStarPattern1 {

	public static void main(String[] args) {
	
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print("*");		
			}
			
			System.out.println();
		}
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9-i-1;j++)
			{
				System.out.print("*");		
			}
			
			System.out.println();
		}
	}
}
