package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] arr = {"chocolate", "dogs", "idk", "why", "okay"};
		//2. print the third element in the array
		System.out.println(arr[3]);
		//3. set the third element to a different value
		arr[3] = "a different value";
		//4. print the third element again
		System.out.println(arr[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//6. make an array of 50 integers
		int[] intArr = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random random = new Random();
		for(int j = 0; j < intArr.length; j++) {
			intArr[j] = random.nextInt();
		}
		//8. without printing the entire array, print only the smallest number in the array
		int minValue = 0;
		for(int j = 0; j < intArr.length; j++) {
			if (j==0) {
				minValue = intArr[j];
			}
			else if(intArr[j] < minValue) {
				minValue = intArr[j];
			}
		}
		System.out.println("Minimum Value: "+minValue);
		//9 print the entire array to see if step 8 was correct
		for(int j = 0; j < intArr.length; j++) {
			System.out.println(intArr[j]);
		}
		//10. print the largest number in the array.
		int maxValue = 0;
		for(int j = 0; j < intArr.length; j++) {
			if (j==0) {
				maxValue = intArr[j];
			}
			else if(intArr[j] > maxValue) {
				minValue = intArr[j];
			}
		}
		System.out.println("Maximum Value: "+maxValue);
	}
}
