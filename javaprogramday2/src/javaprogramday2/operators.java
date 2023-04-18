package javaprogramday2;
public class operators {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		int x =10;
		System.out.println( "a and b value before the operation: "+ a + " "+b);
		
		// adding/subtracting 2.Assinging
		//pre ---> 1,2
		//post --> 2,1
		
		++a; //pre -->11
		int c= ++a + b + a--;
		//12+20+12;
        System.out.println(c);
        System.out.println(a);
        
        int d= c++ + a + b--;
        // 44+11+20
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
	}

}
