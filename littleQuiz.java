// 19.11.2020, created with Notepad

import java.util.Scanner;


public class littleQuiz {
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
        String name;
	int choice, score;
	score = 0;


//Username
	System.out.print("\nHello, what's your name? ");
	name = input.next();

	System.out.println("\nHello " + name + ", welcome to the quiz!");
	System.out.println("Please type \"only a number \" of your choosen choice as an answer.");


//Quiz section :
// Q#1
	
		System.out.println("");
	
		System.out.println("Q1) What is the capital city of Thailand?");
		System.out.println("\t1) Bangkok\n\t2) Phuket\n\t3) Miami");
		choice = input.nextInt();

		if (choice == 1) {
			System.out.println("That's correct!");
			score = score +1;
		}
		else if (choice == 2)
		{
			System.out.println("Sorry, PHUKET is not the capital of Thailand.");
		}
		else {
			System.out.println("Sorry, MIAMI is in the USA :P");
		}
//Q#2

		System.out.println("");
	
		System.out.println("Q2) Can you store the value \"Narak\" in a variable type double?");
		System.out.println("\t1)Sure, why not?\n\t2)No no no");
		choice = input.nextInt();

		if (choice == 2) {
		    System.out.println("That's correct!");
		    score = score +1;
		     }
	        else {
		    System.out.println("Sorry, \"Narak\" is a string. Double is for the numbers :P");
		     }
//Q#3

		System.out.println("");
	
		System.out.println("Q3) What's the result of 100-4*14? ");
		System.out.println("\t1)1344\n\t2)44\n\t3)82");
		choice = input.nextInt();

		if (choice == 2) {
			System.out.println("That's correct!");
		 	score = score +1;
		  }

		else {
		    	System.out.println("WRONG :(");
		     }
// Q#4
	
		System.out.println("");
	
		System.out.println("Q4) What is my name?");
		System.out.println("\t1) Elon Musk\n\t2) Karen\n\t3) Hamie");
		choice = input.nextInt();

		if (choice == 3) {
			System.out.println("That's correct!");
			score = score +1;
		}
		else if (choice == 2)
		{
			System.out.println("Sorry, Karen is not my name.");
		}
		else {
			System.out.println("Well, not me. But he's a cool guy.");
		}
//Q#5

		System.out.println("");
	
		System.out.println("Q5) Can we hack the NASA with HTML?");
		System.out.println("\t1)YES, someone already did it.\n\t2)I doubt that...");
		choice = input.nextInt();

		if (choice == 2) {
		    System.out.println("Me too!!");
		    score = score +1;
		     }
	        else {
		    System.out.println("Err...");
		     }
//

System.out.println("\n____________________________________________________");
System.out.println("Summary, you got " + score + " out of 5 points.");
System.out.println("Thank you for playing!");
	
 	
}

}
