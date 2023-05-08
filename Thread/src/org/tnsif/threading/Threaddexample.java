package org.tnsif.threading;
class Rak extends Thread{
	public void run()
	{
		for(int i=1;i<=10;i++) {
			System.out.println("Rak Priority: "+ Thread.currentThread());
			try {
				sleep(1000);}
			
				catch(InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}

public class Threaddexample {

	public static void main(String[] args) {
		Rak obj = new Rak();
		obj.start();
		obj.setPriority(1);



	}

}
