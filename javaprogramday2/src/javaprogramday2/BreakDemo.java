package javaprogramday2;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for(int i=1;i<6;i++) {
    	if(i==5)
    		break;
      System.out.println(i);
    for(int j=1;j<10;j++) {
        if(j==7)
           continue;
        System.out.println(j);
    }
	}
	}
}
//break - stop the current and remaining iteration
//continue - skip the currrent iteration alone