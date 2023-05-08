package org.tnsif.threading;
class Edge implements Runnable{
	public void run()
	{
		System.out.println("In Edge Thread");
		}
	
}
class Chrome implements Runnable{
	public void run()
	{
		System.out.println("In Chrome Thread");}
	
}
public class Exampletwo {

	public static void main(String[] args) {
		Edge e = new Edge();
		//e.run();
		Thread obj = new Thread(e);
		obj.start();
		
		Chrome c = new Chrome();
		//e.run();
		Thread obj1 = new Thread(c);
		obj1.start();
	}

}
