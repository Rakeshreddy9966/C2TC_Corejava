package org.tnsif.Array1D;

public class TwoDArray {

	public static void main(String[] args) {
		//dataType arrayName[] []= new Data_Type[row_size][column_size];
    int arr[] = {10,20,30,40};
    int a = 50;
    call(a,arr);
    System.out.println(a);
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    
	}
	public static void call(int a ,int arr[]) {
		a=a+2;
		arr[0]=100;
		arr[1]=200;
	}
}
