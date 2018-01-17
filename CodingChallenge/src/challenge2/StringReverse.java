package challenge2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//option to end the program
		
		char opt = 'Y';
		
		while(opt!='N')
		{
			//ask for the input string to reverse from the user
			System.out.println("Enter the input string you want to reverse: ");
			
			
			String input = br.readLine();
			String rev = "";
			//traverse from end index to the zero index and add it to the rev string
			
			for(int i=input.length()-1;i>=0;i--) {
				
				rev+=input.charAt(i);
			}
			//display the result
			System.out.println("Reversed String is: " +rev);
			
			//ask for options
			
			System.out.println("Do you wish to continue ? press Y for Yes and N for No");
			
			opt=(br.readLine().charAt(0));
		
			
		}
		

	}

}
