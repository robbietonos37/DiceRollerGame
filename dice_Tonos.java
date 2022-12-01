import java.util.*;

/* Course: CSCI 111 Student Name: Jane Doe Student ID: 12345678 Program 3 (Homework) Due Date:
In keeping with the Honor Code of UM, I have neither given nor received assistance from anyone other than the instructor or the TA.
Program Description: */

public class dice_Tonos {
	public static void main(String[] args) {

//Here we will declare our variables and 

		int computer = 0;
		int user = 0;

		int count = 0;

//Here we will start a while loop that will run for 10 rounds		
 
		while (count < 10) {
 
			count++;

//Here we will create the two random integers to be the dice

			Random rand = new Random();
			int myNum = 1 + rand.nextInt(6);
			int comNum = 1 + rand.nextInt(6);

//Here we will use if/else statements to determine who wins and keep count of the number of wins

			if (myNum > comNum) {
				System.out.printf("Round %d: You won!\n", count);
				user++;
			}
			else if (myNum < comNum) {
				System.out.printf("Round %d: Computer won!\n", count);
				computer++;
			}
			else {
				System.out.printf("Round %d: It's a tie!\n", count);
			}

			}

			if (user > computer){
				System.out.printf("You won %d times, the computer won %d times, you are the grand winner!\n", user, computer);
			}
			else if (computer > user){
				System.out.printf("You won %d times, the computer won %d times, the computer is the grand winner!\n", user, computer);
			}
			else {
				System.out.printf("You won %d times, the computer won %d times, it's a tie!\n", user, computer);
		}
	}
}