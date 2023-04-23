package javaprogramday3;

public class EncapsulationTester {

		public static void main(String[] args) {
			// call by reference
			Encapsulation obj=new Encapsulation();
			obj.myInteger=3;
			obj.myString="call by reference";
			System.out.println(obj.myInteger);
			System.out.println(obj.myString);
			System.out.println("---------------------------");
			
			// call by method
			Encapsulation object=new Encapsulation();
			object.setter(3,"call by method");
			object.getter();

		}

	}


