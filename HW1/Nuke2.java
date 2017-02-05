/* 
This program reads an input stream entered from the keyboard
and print out the stream with second character removed
*/

import java.io.*;

class Nuke2{


	public static void main(String[] arg) throws Exception{

		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Please enter a word with minimum length of 2: ");

		String word = new String(keyboard.readLine());

		char[] chars = word.toCharArray();

		System.out.println(chars);

		int index=1;

		while(index != word.length()-1){
			chars[index] = chars[index+1];
			index++;
		}

		
		String output = new String();

		for (int j=0; j<word.length()-1;j++){

			output = output + chars[j];
		}

		System.out.println("The final answer is: " + output);

	}
}

