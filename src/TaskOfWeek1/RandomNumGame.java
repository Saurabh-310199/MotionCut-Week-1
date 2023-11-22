package TaskOfWeek1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumGame {
	public static void main(String[] args) {
		// create a object for random class
		Random ran = new Random();
		
		int randomnum = ran.nextInt(100) + 1;
		
		
		
		int tryCount =0;
		
		while(true) {
			System.out.println("Enter your guess (1-100) :-");
			
			Scanner sc = new Scanner(System.in);
			
			int guess = sc.nextInt();		
			tryCount++;
			if(guess== randomnum) {
				System.out.println("Correct! YOU WIN..!");
				System.out.println();
				System.out.println("It took you  "+ tryCount + "  tries");
				break;
				
			}else if(randomnum > guess) {
				System.out.println("So Sorry! The Number is Greater..Please Try Again..");
				System.out.println();
			}else{
				System.out.println("So Sorry! The Number is Smaller..Please Try Again..");
				System.out.println();
			}
		}
		
		
		
	}
	

}
