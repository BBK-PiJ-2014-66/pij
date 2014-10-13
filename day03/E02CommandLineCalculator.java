/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 3 Command-line calculator (*)
 *
 * task set:
 *
 *	Write a program that reads a text representing a mathematical 
 *	operation (one of the four basic ones) with two operands, and 
 * 	then execute it. For example, if the user enters "3/5" the 
 *	program outputs “0.6”; if the user enters "23 * 4"
 *	the program outputs "92".
 *  @author Oliver S. Smart
 *
 *  Initial thoughts
 *
 * Command line args are easier than prompt and response menus!
 * Task appears to have been made to be tricky by explicily
 * giving 
 * (1st) example "3/5" where a single argument args[0] = "3/5"
 * (2nd) example "23 * 4" would result in 3 arguments 
 *       args[0]="23" arg[1]="*" and args[2]="4"
 *
 * Guess the thing to do is to concat all the args together.
 * into a single string.
 *
 * Use a for loop to go thru that string (meant to be use for this week)
 * character by character. split into 
 * (a) first word
 * (b) the operand char (either + or - or * or /)
 * (c) the second word
 * read the numbers from the words (with no error handling)
 * do the operation
 * 
 */
public class E02CommandLineCalculator {
	public static void main(String[] args) {
		for (int cc = 0; cc < args.length; cc++) {
			System.out.println("debug args["+cc+"] = \"" + args[cc] + "\"");
		}
		if (args.length==0) {
			System.out.println("Usage you must specify the calculation wanted on the command line");
			System.out.println("for instance:\n");
			System.out.println("\tjava E02CommandLineCalculator 3/5");
			System.out.println("\nor:\n");
			System.out.println("\tjava E02CommandLineCalculator 23 * 4");
			System.out.println("\ntry again");
		}
	}
}
