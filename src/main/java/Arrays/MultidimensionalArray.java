package Arrays;
//Multidimensional array is one of the array of array.that is nothing but matrix Problems[Row,Column]
public class MultidimensionalArray {

	public static void main(String[] args) 
	{
		//int [][] array=new int [2][2];
		//				0	   1     2    3
		int [][] arr= {{1,2,5},{3,4,5},{5,6,5}};//compile time memory allocation
		// 				0 1   0 1   0 1
		
		for(int col=0;col<3;col++)
		{
			for(int row=0;row<3;row++)
			{
				System.out.print(arr[col][row]+" ");
			}
			System.out.println();
		}
	}

}
