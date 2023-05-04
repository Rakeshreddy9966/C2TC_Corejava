package exception;
/*
 * /*An expection  handling in normal flow of program : exception object having the info about the error .

checked exception is comile4r time exception
unchecked error .if array has no values it says exception bounds error.

import javaprogramday1.all;
import javaprogramday1.certain;
import javaprogramday1.excepect;
import javaprogramday1.gives;
import javaprogramday1.like;
import javaprogramday1.pairs;
import javaprogramday1.to;
import javaprogramday1.we;

try {pairs of both try catch,}

catch
finally-it do all program gives output
throw excepect error like saying we have to use certain like ex:{upper case symbols like @##}
throws
 */

public class Checkedexception {

	public static void main(String[] args) {
		System.out.println("First Line");
		System.out.println("Secound line");
		try {
		int[] myIntArray = new int [] { 1,2,3};
		print (myIntArray); }
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The array doesn't have fourth element!");
			
		}
		System.out.println("third line");
	}
	public static void print(int[] arr) {
		System.out.println(arr[3]);
		
		
			
		
	}

}
