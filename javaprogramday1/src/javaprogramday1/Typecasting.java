package javaprogramday1;

public class Typecasting {

	public static void main(String[] args) {
	byte x =127;
	
	int y =2147483647;
	
	int z =127; // TypeCasting-1//Automatic //Widening Casting
	
	byte b1 = (byte)128; // 4 // TypeCasting-2 //manual //Narrowing Casting
	
	float f=(float) 10.5; //
	
	//W
	byte b =10;
	int i=b;
	System.out.println(i);
	
	float f1 =22.14f;
	double d = f1;
	System.out.println(d);
	System.out.println(f1);
	
	//w
	char ch ='A';
	int i1 =ch;
	System.out.println(i1);
	
	//N
	double f2 =10.52f;
	long l = (long)f2;
	//
	float f3=34.56f;
	int i2=(int)f3;
	System.out.println(f2);
	System.out.println(i2);
	
	

	}

}
