package challenge2;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		 
		String  str, rev="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		str = sc.nextLine();
		
		int length = str.length();
		
		for (int i = length-1; i>=0; i--) 
			rev= rev+str.charAt(i);
		
		if(str.equals(rev))
			System.out.println("String is a palindrome");
		else
			System.out.println("String is not a palindrome");
		

	}

}