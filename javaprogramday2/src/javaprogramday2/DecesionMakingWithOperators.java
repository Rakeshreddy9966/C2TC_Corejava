package javaprogramday2;

public class DecesionMakingWithOperators {

	public static void main(String[] args) {
		int x=8,y=7;
		int a=10;
		int b=11;
		
		if(x>=y) {
			System.out.println("true");
			
		}
		else {
			System.out.println("false");
		}
		if(!(a<b) || (a==b)) //!T || F = !(T || F )
			{
			System.out.println("Conditipon is true");
		}
		else {
			System.out.println("condition if false");
		}
	}

}
