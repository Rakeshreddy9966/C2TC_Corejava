
	/*program to overloading is noting but two or more methods,
	 * having same method name but parameters are different
	 */

	package org.tnsif.polymorphism;
	public class MethodOverloading {
		//by passing different data types of arguments
		public int subtraction(int a,int b)
		{
			return a-b;
		}
		public float substraction (int a,int b)
		{
			return a-b;
		}
		// by passing different no of arguments
		public String print(String str)
		{
			return str;
		}
		public String print(String str,String str1)
		{
			return str+str1;
		}
	}



