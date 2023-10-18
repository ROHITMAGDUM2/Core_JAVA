package hackerrank;
/*
Given a string, , and two indices,  and , print a substring consisting of all characters in the inclusive range from  to . You'll find the String class' substring method helpful in completing this challenge.

Input Format

The first line contains a single string denoting .
The second line contains two space-separated integers denoting the respective values of  and .

Constraints

String  consists of English alphabetic letters (i.e., ) only.
Output Format

Print the substring in the inclusive range from  to .

Sample Input

Helloworld
3 7
Sample Output

lowo
Explanation

In the diagram below, the substring is highlighted in green:

*/

import java.util.Scanner;

public class SubstringRange {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String inputString = scanner.nextLine();

        // Read the two indices
        int startIndex = scanner.nextInt();
        
        int endIndex = scanner.nextInt();

        // Use the substring method to extract the substring
        String substring = inputString.substring(startIndex, endIndex);

      
        // Print the extracted substring
        
        System.out.println(substring);
        scanner.close();
    }
}
