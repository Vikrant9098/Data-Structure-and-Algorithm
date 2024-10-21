/*Implement following function to delete element from specified position in given array.
the function should return the updated logical size of array*/

//int deletefromPosition (int[] arr, int n, int pos);
package Question_01;

import java.util.Arrays;

public class Array 
{
	public static void main(String...array)
	{
		//Creating the array of the size of 2
		int[] arr = new int[2];
		
		
		//Logical size : Number of valid elements in the array
		//Physical size : Total allocated space
        //count_ele represents the logical size
		int count_ele = 0;
		
		//Assigning value for index 01
		arr[0] =5;
	    //Operation count
		++count_ele;
		
		//Assigning value for index 02
		arr[1] = 10;
		//Operation count
		++count_ele;
		
		System.out.println("--------------------------------------------------------");
		//Printing the array of elements by passing the 'array' and count to the function name printArraty
		System.out.print(" Array Elements are: ");
		//also , passing the logical size in order to prevent the more no of operations
		Operations.printArray(arr , count_ele);
		System.out.println("--------------------------------------------------------");
		
		//Printing the size before resizing 
		System.out.println(" Before resize, nos size is : " + arr.length);
		
		//Resizing the array
		arr = Operations.resizearray(arr, 5);
		
		//Printing the size after resizing 
		System.out.println(" After resize, nos size is : " + arr.length);
		System.out.println("--------------------------------------------------------");
		
		//Printing the array before inserting the element in the array
		System.out.println(" Before Inserting , array is : " + Arrays.toString(arr));
		
		//Inserting the element in the array
		count_ele = Operations.insertelement(arr, count_ele, 1 , 15);
		
		//Printing the array after inserting the element in the array
		System.out.println(" After Inserting , array is : " + Arrays.toString(arr));
		System.out.println("--------------------------------------------------------");
		
		//Printing the array before deleting the element in the array
		System.out.println(" Before deleting, array is : " + Arrays.toString(arr));
		
		//Deleting the element from the array
		count_ele = Operations.deleteinarray(arr, count_ele , 0);
		
		//Printing the array after deleting the element in the array
		System.out.println(" After deleting, array is : " + Arrays.toString(arr));
		
		System.out.println("--------------------------------------------------------");
				
	}

}

