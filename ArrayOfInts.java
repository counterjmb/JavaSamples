/**
  * James Beagle
  * Assignment 7.2
  * July 6, 2012
  * Bellevue University
  * File Name: ArrayOfInts.java
  * Purpose: 	This program will create an array of random ints and print them to the screen.
  				The list size is set to a 100 to start with, but can be change by modifying the constant.
  */

public class ArrayOfInts {

    public static void main(String[] args) {

		//creat array of 100 random integers.
        int[] list = new int[100];

        for(int i = 0; i < list.length; i++){
            list[i] = (int)(Math.random() * 1000);

			//printing array
            if((i+1) % 10 == 0 && i != 0)
            	System.out.printf("%7d\n",list[i]);
            else
                System.out.printf("%7d",list[i]);

        } 


    } 
}
