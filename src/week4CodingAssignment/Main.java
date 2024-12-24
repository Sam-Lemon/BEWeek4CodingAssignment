package week4CodingAssignment;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. Create an array of int called ages that contains the following 
//			values: 3, 9, 23, 64, 2, 8, 28, 93.
					int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
					
					System.out.println("#1. ages: " + Arrays.toString(ages));
				// Here I have declared a variable, ages, as an array of 
				// integers and then initialized the array with 8 values.
		
//			a. Programmatically subtract the value of the first element in 
//				the array from the value in the last element of the array 
//				(i.e. do not use ages[7] in your code). Print the result 
//				to the console.  
					int firstElement = ages[0];
					int lastElement = ages[ages.length - 1];
					int difference = lastElement - firstElement;
					
					System.out.println("1.a. ages[] Difference: " + difference);
				// First I created two integer variables, firstElement
				// and lastElement, as the data in the array are numbers.
				// I used the 0 index to pull the first number from the array
				// and assign it to firstElement. Instead of using the index
				// of the last number, [7], I used ages.length-1 because if the
				// number of elements in the array changes that could potentially
				// not be the last number of the array.
					
//			b. Create a new array of int called ages2 with 9 elements 
//				(ages2 will be longer than the ages array, and have more 
//				elements).  
					int[] ages2 = new int[9];
					
					System.out.println("#1.b. ages2: " + Arrays.toString(ages2));
				// Once again I used declared an array of integers, but this
				// time I named it ages2, and I specified that it will have
				// 9 elements in it.
					
//				i. Make sure that there are 9 elements of type int in this 
//					new array.  
					ages2[0] = 55;
					ages2[1] = 3;
					ages2[2] = 41;
					ages2[3] = 38;
					ages2[4] = 63;
					ages2[5] = 4;
					ages2[6] = 9;
					ages2[7] = 14;
					ages2[8] = 78;
					
					System.out.println("#1.b.i. ages2: " + Arrays.toString(ages2));
				// I assigned a value to each index of the array.
					
//				ii. Repeat the subtraction from Step 1.a. (Programmatically 
//					subtract the value of the first element in the new array 
//					ages2 from the last element of ages2).	
//				iii. Show that using the index values for the elements is 
//					dynamic (works for arrays of different lengths).
					int ages2FirstElement = ages2[0];
					int ages2LastElement = ages2[ages2.length - 1];
					int ages2Difference = ages2LastElement - ages2FirstElement;
					
					System.out.println("#1.b.ii. ages2[] Difference: " + ages2Difference);
				// Once again I created two new variables to store the first and last
				// elements of the ages2 array. ages2FirstElement is accessed using the [0]
				// index and ages2LastElement is accessed dynamically using ages2.length - 1,
				// which allows me to pull the value of the last element regardless of how
				// long the array is.

//		c. Use a loop to iterate through the array and calculate the average 
//			age. Print the result to the console.
					int sum = 0;
					for (int i = 0; i < ages2.length; i++) {
						sum += ages2[i];
					}
					
					double average = (double) sum / ages2.length;
					
					System.out.println("#1.c Average: " + average);
				// I created a new variable named sum, and set it to 0 because the sum 
				// is 0 before we start adding the array's elements to it. Then I looped
				// through the array and added each index's value to the sum. After that
				// I created another variable, average, using the double data type,
				// because I knew the average wouldn't be a whole number. I took the 
				// value of the sum variable and divided it by the length of the ages2 array
				// to get the average.

//		2. Create an array of String called names that contains the following 
//			values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
					String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
					
					System.out.println("#2 names[] " + Arrays.toString(names));
				// I created a new array of Strings named names and added values to it.
					
//			a. Use a loop to iterate through the array and calculate the average 
//				number of letters per name. Print the result to the console.
					int totalLetters = 0;
					for (int i = 0; i < names.length; i++) {
						totalLetters += names[i].length();
					}
					double averageLetters = (double) totalLetters / names.length;					
					System.out.println("#2.a. Average number of letters per name: " + averageLetters);
				// Here I created a new integer variable named totalLetters and set it's value to
				// 0, for the same reason as sum above. Then I looped through the array,
				// and took the length of each index and added it to the totalLetters.
				// Once again I used the double data type for the average variable and took 
				// totalLetters and divided it by the length of the names array.
					
//			b. Use a loop to iterate through the array again and concatenate all 
//				the names together, separated by spaces, and print the result 
//				to the console.
					String concatenatedNames = "";
					for (int i = 0; i < names.length; i++) {
						concatenatedNames += names[i];
						if (i < names.length -1) {
							concatenatedNames += " ";
						}
					}
					System.out.println("#2.b. Concatenated names: " + concatenatedNames);
				// I started with a new String variable, concatenatedNames and set it as an
				// empty string. Then I looped through the array and added each name into 
				// the concatenatedNames string. I also added a space between each name
				// with an if statement.

//		3. How do you access the last element of any array?
					int agesLast = ages[7];
					int agesLast2 = ages[ages.length - 1];
					
					System.out.println("#3. Last element: " + agesLast);
					System.out.println("#3. Last element: " + agesLast2);
				// There are two different ways you can access the last element of an array. 
				// You can directly reference the index of the last element. For the ages array
				// there are eight elements in that array, so the final index would be [7].
				// If you wanted to access the element more dynamically you could take the
				// length of the array and minus one (since the first element is at index [0]).

//		4. How do you access the first element of any array?
					int agesFirst = ages[0];
					
					System.out.println("#4. First element: " + agesFirst);
				// You access the first element of the array by calling the 0 index because 
				// arrays are zero-indexed.

//		5. Create a new array of int called nameLengths. 
//			Write a loop to iterate over the previously created names array 
//			and add the length of each name to the nameLengths array.
					int[] nameLengths = new int[names.length];
					for (int i = 0; i < names.length; i++) {
						nameLengths[i] = names[i].length();
					}
					
					System.out.println("#5. Lengths of names: " + Arrays.toString(nameLengths));
				// First I created a new array, nameLengths, that is the same
				// size as the names array. Then I used a for loop to iterate
				// through the names array and stored the length of each index
				// in the nameLengths array. 

//		6. Write a loop to iterate over the nameLengths array and calculate the 
//			sum of all the elements in the array. Print the result to the console.
					int nameLengthsSum = 0;
					for (int i = 0; i < nameLengths.length; i++) {
						nameLengthsSum += nameLengths[i];
					}
					
					System.out.println("#6. Sum of nameLengths array: " + nameLengthsSum);
				// First I created a new integer variable named nameLengthsSum and
				// set it's initial value to 0. Then I used a for loop to iterate 
				// through it and added the values from the nameLength array to
				// the sum.

//		7. Write a method that takes a String, word, and an int, n, as arguments and 
//			returns the word concatenated to itself n number of times. (i.e. if I pass 
//			in “Hello” and 3, I expect the method to return “HelloHelloHello”).	
					String result = repeatWord("Hello", 3);
					
					System.out.println("#7. The result is: " + result);
				// Here I created a String variable, result, and called the repeatWord
				// method, passing the string "Hello" as the word, and 3 as the number.

//		8. Write a method that takes two Strings, firstName and lastName, and returns 
//			a full name (the full name should be the first and the last name as a 
//			String separated by a space).
					String firstName = "Sam";
					String lastName = "Lemon";
					String fullName = getFullName(firstName, lastName);
					
					System.out.println("#8. Full Name: " + fullName);
				// I created two new String variables, firstName and lastName, and gave them 
				// values. Then I created another variable, fullName, and gave it the value
				// that the getFullName method returns, passing through firstName and lastName
				// as parameters.
					

//		9. Write a method that takes an array of int and returns true if the sum of all 
//			the ints in the array is greater than 100.
					int[] numbers = {3, 7, 22, 5, 19};
					boolean result9 = isSumGreaterThan100(numbers);
					
					System.out.println("#9. Is the sum greater than 100? " + result9);
				// I initialized an array of numbers and then created another variable
				// to hold the value that is returned by the method isSumGreaterThan100.

//		10. Write a method that takes an array of double and returns the average of all 
//			the elements in the array.
					double[] values = {11.2, 85.3, 45.7, 1.2, 65.3};
					double averageOfValues = calculateAverage(values);
					
					System.out.println("#10. The average is: " + averageOfValues);
				// After initializing an array of doubles, I created a variable, 
				// averageOfValues, to hold he value that is returned by the method
				// calculateAverage.

//		11. Write a method that takes two arrays of double and returns true if the average 
//			of the elements in the first array is greater than the average of the elements 
//			in the second array.
					double[] array1 = {10.5, 20.5, 85.1};
					double[] array2 = {21.5, 55.3, 71.4};
					
					boolean resultDoubleArrays = isFirstAverageGreater(array1, array2);
					
					System.out.println("#11. Is the average of the first array greater? " + resultDoubleArrays);
				// Here I created two new arrays of doubles then a new boolean 
				// variable, resultDoubleArrays, to call my method, 
				// isFirstAverageGreater, passing the two arrays as parameters.

//		12. Write a method called willBuyDrink that takes a boolean isHotOutside, 
//			and a double moneyInPocket, and returns true if it is hot outside and 
//			if moneyInPocket is greater than 10.50.
					boolean isHotOutside = true;
					double moneyInPocket = 9.00;
					
					boolean resultWillBuyDrink = willBuyDrink(isHotOutside, moneyInPocket);
					
					System.out.println("#12. Will buy drink: " + resultWillBuyDrink);
				// I created two new variables, one boolean because it is either hot outside
				// or it's not, and the other a double because we're dealing with money.
				// with the boolean variable resultWillBuyDrink I called the method I created
				// below and passed the arguments isHotOutside and moneyInPocket.
					

//		13. Create a method of your own that solves a problem. In comments, write what 
//			the method does and why you created it.
					int[] num = new int[5];
					num[0] = 22;
					num[1] = 43;
					num[2] = 12;
					num[3] = 11;
					num[4] = 9;
					
					System.out.println("#13. Num array " + Arrays.toString(num));
					
					int max = findMax(num);
					
					System.out.println("#13. The highet number in the array is: " + max);
				// For this problem I wanted to find the highest number in the array.
				// First I created said array of integers and filled it with random values.
				// Then I created a new int variable to call the findMax method, with the 
				// num array passed through as an argument.
		
		
	}
	
	// Method 7:
			public static String repeatWord(String word, int n) {
				StringBuilder result = new StringBuilder();			
				for (int i = 0; i < n; i++) {
					result.append(word);
				}			
				return result.toString();
			}
		// For this method I used the public access modifier, so it can be accessed from 
		// anywhere in my program. Then I used the static modifier so that this method will
		// belong to the class. String is the return type I used because we're looking to 
		// have a string returned. The parameters are a word, and a number for the number 
		// of times the word will be repeated. Since you have to identify the type of data
		// you're working with I used the String data type for the word and the int data
		// type for the number. Then I used a for loop to iterate through the array, n 
		// amount of times, and appended (or added) the word to the result, then turned that
		// into a string.
	
	// Method 8:
			public static String getFullName(String firstName, String lastName) {
				return firstName + " " + lastName;
			}
		// This method, getFullName, takes two parameters, which are strings, and returns
		// the concatenation of the two with a space between them.
	
	// Method 9:
			public static boolean isSumGreaterThan100(int[] numbers) {
				int sum = 0;
				for (int number : numbers) {
					sum += number;
				}
				return sum > 100;
			}
		// For this method I used a boolean as the return type and it takes an array of
		// integers as input. Using a for loop, I calculated the sum of all of the numbers
		// in the array numbers.
	
	// Method 10:
			public static double calculateAverage(double[] numbers) {
				double sum = 0;
				
				for (double number : numbers) {
					sum += number;
				}
				
				return numbers.length > 0 ? sum / numbers.length : 0;
			}
		// This method takes a double array as an input and returns a 
		// double, which is the average of the elements. Using a for loop,
		// I iterated through the array numbers and added the value of each
		// element to sum, then divided it by the length of the numbers 
		// array.
	
	// Method 11:
			public static boolean isFirstAverageGreater(double[] array1, double[] array2) {
				double average1 = calculateAverage(array1);
				double average2 = calculateAverage(array2);
				
				return average1 > average2;
			}
		// First I created a method, isFirstAverageGreater, that takes two double arrays
		// as parameters and calls the helper function, calculateAverage, to determine
		// if the first array is greater than the second. I used a boolean return type
		// because I'm looking for a true/false. I also reused the calculateAverage method
		//	from above that calculates the average of any double array it's called on.
	
	// Method 12:
			public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
				return isHotOutside && moneyInPocket > 10.50;
			}
		// Using a boolean return value, I created a new method to determine if 
		// the two variables, isHotOutside and moneyInPocket were greater than 10.50.
		// If they are, the method would evaluate as true.

	
	// Method 13:
			public static int findMax(int[] arr) {
				int max = arr[0];
				
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] > max) {
						max = arr[i];
					}
				}
				return max;
			}
		// For this method I used public, because I want it to be accessible from anywhere
		// in my program. I used static so I can call the method using the class name. I used
		// int because the array is filled with ints and I will need an integer returned to
		// me at the end of the method. The name of the method is findMax and I'm passing an
		// array of integers into the method. I assign the value of the first index of the 
		// array as max and then use a for loop to iterate through the array, checking each
		// index of the array against the one before to see if it has a higher value. If it
		// does, then it is assigned as the max value.
}
