//driver class
package org.tnsif.finalkeyworddemo;

public class FinalExecutor {

	public static void main(String[] args) {
		Finalvariableexample f= new Finalvariableexample();
		f.print("john");
		//final method
		FinalChildMethod m1=new FinalChildMethod();
		System.out.println(m1.print(12));
		System.out.println(m1.print(0));
	}

}
