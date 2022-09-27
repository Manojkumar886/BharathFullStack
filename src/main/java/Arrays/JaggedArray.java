package Arrays;

public class JaggedArray {

	public static void main(String[] args) 
	{
//		int [][] arr=new int [3][];
//		arr[0]=new int [3]; //1 2 4
//		arr[1]=new int [5]; //4 6 7 8 9
//		arr[2]=new int [1]; //8
//		int value=0;
//		//value assumtion
//		for(int col=0;col<arr.length;col++)
//		{
//			for(int row=0;row<arr[col].length;row++)
//			{
//				arr[col][row]=value+=10;
//			}
//		}
		//priting an value
		int [][] arr= {{1,2,5},{3,4,5,6,7},{5}};
		for(int col=0;col<arr.length;col++)
		{
			for(int row=0;row<arr[col].length;row++)
			{
				System.out.print(arr[col][row]+" ");
			}
			System.out.println();
		}
	}

}
