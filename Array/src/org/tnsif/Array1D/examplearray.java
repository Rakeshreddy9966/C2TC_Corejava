package org.tnsif.Array1D;

public class examplearray {

	public static void main(String[] args ) {
		int arr [] []= { {42,2,23},{5,60,12},{19,10,1}};
	System.out.println( arr );
	}
		public static void function(int array [][]) {
			for ( int i=0;  i<3;  i++)
			{
				for ( int j=0;  j<3;  j++)
			
			{
				System.out.println(array[j][i] + " ");
				
			}
			System.out.println();
		}

	}

}
