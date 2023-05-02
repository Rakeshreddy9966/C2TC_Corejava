package SimpleString;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(10);
		System.out.println(sb.capacity());
		sb.append("java");
		System.out.println(sb.capacity());
		sb.append("it is programming language");
		System.out.println(sb.capacity());
		// less than the avaliable size - it is accomadate
		// more than the avalaible- calculation
		//even after that, if the not sufficient-then add the required size
	}

}
