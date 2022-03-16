/*
 * Name: Ngan Hoang
 * Date: 9/16/19
 * Course: CSC110AB
 * Program name: Base2toBase10Conversion
 * Purpose: Converting between character, integer and string
 */
package assignment;
import java.util.Scanner;

public class Base2toBase10Coversion_NganHoang {

	public static void main(String[] args) {
		// * Challenge 1
		
		
		// write the world "hello" by creating individual integer variables for each letter 
		// of the word" hello"
		
		
		// declare
		// Given ascii value
		int ascii_h= 104, ascii_e=101, ascii_l=108 , ascii_o=111;
		char letter_h,letter_e,letter_l,letter_o;
		
		// convert a ascii value into character
		
		letter_h = (char)ascii_h;
		letter_e = (char)ascii_e;
		letter_l = (char)ascii_l;
		letter_o = (char)ascii_o;
		
		System.out.println(""+letter_h+letter_e+letter_l+letter_l+letter_o);
		// Done.
		
		// * Challenge 2:
		
		Scanner scnr = new Scanner(System.in);
		
		// declare
		String info;
		int one,two,three,four,five,result;
		char index1,index2,index3,index4,index5;
	
		System.out.println("Enter five bit binary value : ");
		info = scnr.nextLine();
		
		// read a character of a String
		
		index1 = info.charAt(0);
		index2 = info.charAt(1);
		index3 = info.charAt(2);
		index4 = info.charAt(3);
		index5 = info.charAt(4);
		
		// convert into an integer
		
		one = (int)index1-48;
		two = (int)index2-48;
		three = (int)index3-48;
		four = (int)index4-48;
		five = (int)index5-48;
		
		
		
		// calculate
		
		result = one*16+two*8+three*4+four*2+five*1;
		
		// output
		
		System.out.println("The value of "+info+" is "+result);
		
        scnr.close();
		
		//Done
		
		
	
		
		
	}//end main

}
