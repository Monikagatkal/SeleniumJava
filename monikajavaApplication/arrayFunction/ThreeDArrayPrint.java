package arrayFunction;

public class ThreeDArrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][][]= {{{22,33},{44,66}},{{88,99},{11,45,68}},{{25,85,75}}};
		System.out.println("First Dimension: "+arr1.length);
		System.out.println("Second Dimension: "+arr1[0].length);
		System.out.println("Third Dimension: "+arr1[0][0].length);
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
			{
				for(int j1=0;j1<arr1[0][0].length;j1++)
				{
					System.out.println(arr1[i][j][j1]);
			}
		}
	}
	}
}


