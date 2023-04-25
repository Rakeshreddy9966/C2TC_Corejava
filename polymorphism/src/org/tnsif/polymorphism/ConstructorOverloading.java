//program  to demonstrate constructor overloading//
package org.tnsif.polymorphism;

public class ConstructorOverloading {
	
	//private data members
	private int x;
	private int y;
	
	//constructor overloading
	public ConstructorOverloading()
{
	System.out.println("Default constructor");
}
	public ConstructorOverloading(int x)
	{
		System.out.println("parametrized constructor "+x);
	}
	public ConstructorOverloading(int x,int y)
	{
		System.out.println("parametrized constructor "+x +"  "+y);
	}
	

}
