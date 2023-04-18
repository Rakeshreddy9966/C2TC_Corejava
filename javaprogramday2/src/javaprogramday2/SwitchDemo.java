package javaprogramday2;

public class SwitchDemo {

	public static void main(String[] args) {
		char x='l';
		switch(x) {
		case 'l':
		case 'L':
			System.out.println(x +" is a Letter");
			
		case'd':
		case'D':
			System.out.println(x +"is a digit");
			break;
		default:
			System.out.println( x + " is other than letter,digit");
	}
	} 
  }
