package arrayFunction;

public class Threedimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][][] = new int[2][2][3];
		arr[0][0][0] = 11;
		arr[0][0][1] = 22;
		arr[0][0][2] = 13;
		
		arr[0][1][0] = 12;
		arr[0][1][1] = 15;
		arr[0][1][2] = 26;
		
		arr[1][0][0] = 17;
		arr[1][0][1] = 28;
		arr[1][0][2] = 16;
		
		arr[1][1][0] = 25; 
		arr[1][1][1] = 11;
		arr[1][1][2] = 32;
		
		System.out.println(arr[0][1][1]);
		
		
		int arr1[][][]= {{{22,33},{44,66}},{{88,99},{11,45}}};
		System.out.println(arr1[1][0][1]);
		

	}

}
