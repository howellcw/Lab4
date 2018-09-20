import java.util.Arrays;
public class Lab4 
{
	public static int[] sortArr(int[] arr)
	{
		int size = arr.length;
		int[] sortedArr = arr.clone();
		int start = 0;
		int end = (size-1);
		

		if (size == 0)
		{
			throw new IllegalArgumentException("Your array is empty.") ;
		}
		else
		{
			Arrays.sort(sortedArr);
			while(start<end)
			{
				int temp = sortedArr[start];
				sortedArr[start] = sortedArr[end];
				sortedArr[end] = temp;
				start++;
				end--;
			}
			
		}
		return sortedArr;
	}
	
	public static void main(String[] args)
	{
		int[] testArray1 = new int[8];
		testArray1[0]= 2;
		testArray1[1]= 1;
		testArray1[2] = 5;
		testArray1[3] = 4;
		testArray1[4] = 8;
		testArray1[5] = 6;
		testArray1[6] = 9;
		testArray1[7] = 10;
		
		int[] testArray2 = new int[3];
		testArray2[0]= 3;
		testArray2[1]= 2;
		testArray2[2] = 1;
		
		int[] testArray3 = new int[4];
		testArray3[0]= 5;
		testArray3[1]= 7;
		testArray3[2] = 9;
		testArray3[3] = 8;
		
		int[] testArray4 = new int[5];
		testArray4[0]= 10;
		testArray4[1]= 9;
		testArray4[2] = 8;
		testArray4[3] = 7;
		testArray4[4] = 11;

		int[] testArray5 = new int[0];
		try
		{
			int [] sortArray1 = sortArr(testArray1);
			System.out.println("Test Case 1: " + Arrays.toString(sortArray1));
		
			int [] sortArray2 = sortArr(testArray2);
			System.out.println("Test Case 2: " + Arrays.toString(sortArray2));
		
			int [] sortArray3 = sortArr(testArray3);
			System.out.println("Test Case 3: " + Arrays.toString(sortArray3));
		
			int [] sortArray4 = sortArr(testArray4);
			System.out.println("Test Case 4: " + Arrays.toString(sortArray4));
		
			int [] sortArray5 = sortArr(testArray5);
			System.out.println("Test Case 5: " + Arrays.toString(sortArray5));
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Test Case 5: " + e.getMessage());
		}
	}
}
