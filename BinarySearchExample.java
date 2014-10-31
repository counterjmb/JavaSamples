import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {
	public static void main(String[] args){

		//initilize scanner for later search
		Scanner input = new Scanner(System.in);

		//initlize the array
		int[] myList = {3,4,6,65,123,9,165,1577,136,96,55,4563,12,366};

		//print array before sort
		System.out.println("This is the array before a sort:");
		for(int i = 0; i < myList.length; i++)
			System.out.printf("%5d", myList[i]);

		//sort function
		Arrays.sort(myList);

		//print after sort
		System.out.println("\nThis is the array after a sort:");
		for(int i = 0; i < myList.length; i++)
			System.out.printf("%5d", myList[i]);

		//searching the array
		System.out.println("\nNow for a search");
		System.out.print("Please enter a number to search for: ");

		//get search key: x
		int x = input.nextInt();

		//print results
		System.out.print("Item " + x + " is in array index: ");

		//pass to binary search function that handles negative values
		findIndex(myList, x);

		//blank line
		System.out.println();

	}

	//method to handle items not found in binary search
	public static void findIndex(int[] list, int searchKey){

		if(Arrays.binarySearch(list, searchKey) > -1)
			System.out.print(Arrays.binarySearch(list, searchKey));
		else
			System.out.println("Number not found!\n\n");
		}
}