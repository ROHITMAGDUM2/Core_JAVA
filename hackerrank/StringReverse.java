package hackerrank;

import java.util.Scanner;

/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes
*/
public class StringReverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();

		// Remove any spaces and convert to lowercase for a case-insensitive check
		A = A.replaceAll("\\s", "").toLowerCase();

		// Compare the original string with its reverse
		if (isPalindrome(A)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

// Function to check if a string is a palindrome
	public static boolean isPalindrome(String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}
}
