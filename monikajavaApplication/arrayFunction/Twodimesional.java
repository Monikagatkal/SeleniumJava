package arrayFunction;

public class Twodimesional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int arr[][] = new int[3][2];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		
		arr[1][0] = 30;
		arr[1][1] = 40;
		
		arr[2][0] = 50;
		arr[2][1] = 60;
		
		System.out.println(arr[1][0]);*/
		
		int values[][] = {{10,20},{30,40},{50,60}};
		System.out.println(values[2][1]);
		
		
		
		float num[][] = {{1.2f,2.3f},{3.4f,4.5f},{5.6f,2.5f},{5.3f,8.4f}};
		System.out.println("value of Float numbers ="+ num[0][1]);
		
		char ch[][]= {{'a','b'},{'c','d'},{'p','k'},{'i','o'}};
		System.out.println("character is ="+ ch[0][0]);
		System.out.println("character is ="+ ch[0][1]);
		System.out.println("character is ="+ ch[1][0]);
		System.out.println("character is ="+ ch[1][1]);
		System.out.println("character is ="+ ch[2][0]);
		System.out.println("character is ="+ ch[2][1]);
		System.out.println("character is ="+ ch[3][0]);
		System.out.println("character is ="+ ch[3][1]);
		//System.out.println("character is ="+ ch[0][1]);
		
		String arr[][] = {{"monika","mony"},{"moni","mona"}};
		System.out.println("Arrray content is ="+ arr[0][0] + "|" + arr[0][1] + "|" + arr[1][0] + "|" + arr[1][1]);
		
		
		

	}

}
