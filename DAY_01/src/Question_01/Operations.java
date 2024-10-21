package Question_01;

public class Operations 
{

	//Operation 1 : Printing the Array
		public static void printArray(int[] arr , int n ) 
		{
			//Printing the array using normal for loop 
			for(int i = 0; i < n; i++)
			{
				System.out.print(arr[i] + " " );
			}
			System.out.println(" ");
		}

		
		//Operation 2 : Resizing the Array
		//here from main class the size is send as 5 and in these function/method 
		//we have catch it with the another name as new_size
		public static int[] resizearray(int[] arr, int new_size) 
		{
			
			//Creating the larger array
			int[] newarr = new int[new_size];
			
			//Copy the elements of the old array into the new array using traditional for loop
			//Using the i++ and ++i is matter of personal or team preference 
			//no change in logic by the way
			for(int i = 0; i < arr.length; ++i)
			{
				//Logic for copying the one array to the another array
				newarr[i] = arr[i];
			}
		
			return newarr;
		}

		//Operation 3 : Inserting the element in the array
		public static int  insertelement(int[] arr, int count_ele, int pos, int ele) 
		{
			//Shift elements to right by one place using traditional for loop
			for(int i = count_ele; i > pos ; --i)
			{
				//Logic 1 : right shift the elements from the position you want to insert at
				arr[i] = arr[i - 1];
			}
			
			//Logic 2 : Adding the element at the given position and with the given element
			arr[pos] = ele;
			
			//Logic 3 : return the incremented value of logical size in order to keep the records
			return count_ele + 1 ;
		}


		//Operation 4 : Deleting the element in the array
		public static int deleteinarray(int[] arr, int count_ele , int pos) 
		{
			//Shift elements to left by one position
			for(int i = pos ; i < count_ele; i++ )
			{
				arr[i] = arr[i+1];
			}
			
			//Reduce logical size by 1 
			return count_ele ;
		
		}

}
