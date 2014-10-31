/**
  * James Beagle
  * Assignment 8.2
  * July 17, 2012
  * Bellevue University
  * File Name: bubbleArray.java
  * Purpose: 	This program will create two arrays, one 1dimentional and a 2 dimentional array. The arrays will be printed,
  				then sorted, then printed again to show that the arrays were sorted.

  				Professor Darrell Payne provided the algorithm for the bubble sort.
  */
public class bubbleArray {
	public static void main(String[] args){

	//create arrays
	int[] myList = new int[10];
	int [][] doubleList = new int[5][5]; 

	//fill 1 dementional array with random numbers up to 50
	for(int i = 0; i < myList.length; i++){
		myList[i] = (int)(Math.random() * 50);
	}

	//fill 2 dementional array with random numbers up to 50
	for(int row = 0; row < doubleList.length; row++){
		for(int column = 0; column < doubleList[row].length; column++){
			doubleList[row][column] = (int)(Math.random() * 50);
			}
		}

	//1D array handeling
	printArray("One Dimentional:",myList);
	bubbleSort(myList);
	printArray("One Dimention sorted:",myList);

	//2D array handeling
	printArray("Two Dimentional:", doubleList);
	bubbleSortDimentional(doubleList);
	printArray("Two Dimentional sorted:", doubleList);


	} 

//Print a one dimentional array.
public static void printArray(String x,int [] arrayPass){

	System.out.println(x);

	for(int i = 0; i < arrayPass.length; i++){
		System.out.printf("%3d", arrayPass[i]);
		}
		System.out.println("\n"); //blank lines for spacing
	} 

//Print a two dimentional array.
public static void printArray(String x, int[][] arrayPass){


	System.out.println(x);

	for(int row = 0; row < arrayPass.length; row++){
		for(int column = 0; column < arrayPass[row].length; column++){
			System.out.printf("%3d",arrayPass[row][column]);
			}
		System.out.println(); //blank line for next row
		}
	System.out.println(); //blank line for spacing
	} 
	
//This is take a two dimentional array and sort each of its rows.
public static void bubbleSortDimentional(int [][] arrayPass){

	for(int row = 0; row < arrayPass.length; row++){
		bubbleSort(arrayPass[row]);
		}
	}



/*
	provided by: Professor Darrell Payne
	sort arrays with a bubble sort
	this will go through the array elements and swap smaller elements to lower indexes.
	Parameter is a one dimentional array

	bubble sort algorithm was provided by proffessor Darrell Payne

	algorithm:

			boolean changed;
			do{
			  changed = false;
			  for(int i = 0; i < list.length - 1; i++){
				if(list[i] > list[i + 1]){
				  swap list[i] with list[i + 1];
				  changed = true;
				}
			  }
			}while(changed);
*/
public static void bubbleSort(int [] arrayPass){

	boolean sorted;

	do{
		sorted = false;

			//go through each index and if the first index is larger than the next, swap them.
			// length - 1 is used becuase the loop checks the index + 1
			for(int i = 0; i < arrayPass.length - 1; i++)
			{
				//temperary variable used for swapping
				int temp;

				if(arrayPass[i] > arrayPass[i+1])
				{
					//swap elements if smaller index is larger
					temp = arrayPass[i+1];
					arrayPass[i+1] = arrayPass[i];
					arrayPass[i] = temp;
					sorted = true;
				}
			}

		}while(sorted);
	} //end bubbleSort

}