//program to demonstrate on final variable
package org.tnsif.finalkeyworddemo;

public class Finalvariableexample {

	/* final variable must be initialized
	 */
	 //final int num1;
	/*  when we use final keyword with any variable,
	 *  we cant change the value of that variable*/
      final int x=12;
      
      public void print(final String name)
      {
    	  
    	  /* we cant change the value of final variable*/
    	  //x=13;
    	  
    	  System.out.println("the value of x is : +x");
    	  
    	  /* if method parameters are declared final then
    	   * the value of these parameters cannot be changed.
    	   */
    	  // name="rin"
    	  System.out.println("the name is : "+name);
      }
      
      
	}


