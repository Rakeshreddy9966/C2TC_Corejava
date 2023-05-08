package org.tnsif.threading;
class PPT extends Thread{
	
	public void run()
	{
		for( int i=0;i<=10;i++);
		System.out.println("PPT Priority: "+Thread.currentThread().getPriority());
		System.out.println("In PPT Thread");
		System.out.println("PPT ID is: "+ Thread.currentThread().getId());
		System.out.println("PPT Name is: "+ Thread.currentThread().getName());}
	}
class Eclipse extends Thread{
	public void run() {
		for( int i=0;i<=10;i++);
		System.out.println(" In Eclipse thread");
		System.out.println("Eclipse Priority: "+Thread.currentThread().getPriority());
		System.out.println("Eclipse ID is: "+ Thread.currentThread().getId());
		System.out.println("Eclipse Name is: "+ Thread.currentThread().getName());
		}
	
	}
class Gmeet extends Thread{
	public void run() {
		for( int i=0;i<=10;i++);
		System.out.println(" In Gmeet thread");
		System.out.println("Gmeet Priority: "+Thread.currentThread().getPriority());
		System.out.println("Gmeet ID is: "+ Thread.currentThread().getId());
		System.out.println("Gmeet Name is: "+ Thread.currentThread().getName());
		}
	
	}
public class Multithreading {

	public static void main(String[] args) {
		PPT obj = new PPT();
		obj.start();
		obj.setPriority(1);
		
		Eclipse e = new Eclipse();
		e.start();
		e.setPriority(10);//11 is illegal argument exception
		
		Gmeet g = new Gmeet();
		g.start();
		g.setPriority(Thread.MIN_PRIORITY);
		}

}
