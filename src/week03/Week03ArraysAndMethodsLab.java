//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		
		int [] values = {1, 5, 2, 8, 13, 6};

		
		// 2. Print out the first element in the array
		
		System.out.println(values[0]);
	
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(values[values.length-1]);
		
		
		// 4. Print out the element in the array at position 6, what happens?
		// System.out.println(values[6]);

		
		// 5. Print out the element in the array at position -1, what happens?
		// System.out.println(values[-1]);

			
		// 6. Write a traditional for loop that prints out each element in the array
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for (int value : values) {
			System.out.println(value);
		}

		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		System.out.println(sum);

			
		// 9. Create a new variable called average and assign the average value of the array to it
		
		double sum2 = 0.0;
		for (int value : values) {
			sum2 += value;
		}
		System.out.println(sum2 / values.length);

		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		
		for (int value : values) {
			if (value % 2 != 0) {
				System.out.println(value);
			}
		}

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};

		
		// 12. Calculate the sum of all the letters in the new array

		int sum3 = 0;
		for (String name : names) {
			sum3 += name.length();
		}
		
		System.out.println(sum3);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		greet("Carlos");
		
		
		
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		System.out.println(greetReturn("Betsy"));
		

		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods. 13 performs the action without storing anything in memory and moves on while 14 returns a value that can be stored and used any time
		//		b. What do you find? 
		//		c. How are they different?
		
		
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		String str = "California";
		int test = 7;
		
		System.out.println(compareStrLeng(str, test));
		
		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
		String[] words = {"friend", "enemy", "acquaintence"};
		String testWord = "friend";
		
		System.out.println(checkForWord(words,testWord));
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		int[] numbers = {4,5,76,3,-7,0};
		System.out.println(smallest(numbers));
	
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		
		double[] scores = new double[4];
		scores[0] = 89.4;
		scores[1] = 79.5;
		scores[2] = 92.7;
		scores[3] = 78.0;
		
		System.out.println(mean(scores));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		
		String[] firstNames = new String[4];
		int[] count = new int[firstNames.length];
		
		firstNames[0] = "Chris";
		firstNames[1] = "Mary";
		firstNames[2] = "Steven";
		firstNames[3] = "Elizabeth";
		
		count = countLetters(firstNames);
		for (int index : count) {
			System.out.println(index);
		}
		

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		String[] lastNames = {"Johnson", "Smythe", "Kipp", "Jones"};
		
		
		System.out.println(isEvenGreater(lastNames));

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		
		String coolWord = "tacocat";
		System.out.println(isPalidrome(coolWord));
	}
	

	



	// Method 13:
	public static void greet(String name) {
		System.out.println("Welcome, " + name + ".");
	}
	


	// Method 14:
	
	public static String greetReturn(String name) {
		return "Welcome, " + name + ".";
	}

	
	// Method 15:
	public static boolean compareStrLeng(String str, int test) {
		if (str.length() > test) {
			return true;
		} else {
			return false;
		}
	}

	
	// Method 16:
	public static boolean checkForWord(String[] words, String testWord) {
		for (String word : words) {
			if (word.equals(testWord)) {
				return true;
			}
		}
		return false;
		
	}


	
	// Method 17:
	public static int smallest(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}

	
	// Method 18:
	public static double mean(double[] values) {
		double s = 0.0;
		for (double value : values) {
			s += value;
		}
		return s / values.length;
	}

	
	// Method 19:
	public static int[] countLetters(String[] words) {
		int[] count = new int[words.length];
		for (int i = 0; i < words.length; i++) {
			count[i] = words[i].length();
		}
		return count;
	}

	
	// Method 20:
	public static boolean isEvenGreater(String[] words) {
		int evens = 0, odds = 0;
		for (String word : words) {
			if (word.length() % 2 == 0) {
				evens += word.length();
			} else {
				odds += word.length();
			}
		}
		if (evens > odds) {
			return true;
		} else {
			return false;
		}
	}
	
	
	// Method 21:
	public static boolean isPalidrome(String word) {
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != word.charAt(word.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
	

}