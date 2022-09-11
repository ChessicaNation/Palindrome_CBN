import java.util.*;

/**
 * This class uses a stack to test whether a string 
 * entered by the user is a palindrome.
 * @author chessicanation
 * CS215ON
 * Assignment 2.2
 *
 */
public class Application 
{

	public static void main(String[] args) 
	{
		String str;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter any string to check if it is a palindrome:");
		str = scan.nextLine();
		scan.close();
		str = str.toLowerCase();
		str = str.replaceAll("[^a-z0-9]", "");
		checkPalindrome(str);

	}//end main

	private static void checkPalindrome(String test)
	{		
		String reverse = "";
		
		Stack<Character> myStack = new Stack<Character>();
		
		//using a loop to push each character of the string onto the stack
		for(int i=0; i<test.length(); i++)
			myStack.push(test.charAt(i));
		
		//using a loop to pop each character of the stack into a new string (the reverse of the original string)
		while(!myStack.isEmpty())
			reverse = reverse + myStack.pop();
		
		//comparing the original string with the reverse to see if they are a match
		if(test.equals(reverse))
			System.out.println("Yes, " + test + " is a palindrome!");
		else
			System.out.println("Sorry, " + test + " is NOT a palindrome.");
		
	}//end checkPalindrome
		
}//end class
