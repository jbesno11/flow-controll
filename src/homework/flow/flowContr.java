package homework.flow;

import java.util.*;

public class flowContr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keys = new Scanner(System.in);
		int total = 0;
		int count;
		int[] grades = new int[6];
		//i made an array of length 6
		//one for each class you take
		
		String userinput;
		boolean again = true;
		
		while(again){
			
			
			for(int i = 0 ;i<=5; i++) {
				count = i +1;
				System.out.println("please enter grade number " + count + ": ");
				try {
					grades[i] = keys.nextInt();
					
					
					
					if(grades[i] >100 || grades[i] < 0) {
						throw new Exception();
					}
					
					
					
					total += grades[i];	
					
					
				} catch (InputMismatchException e) {
					System.out.println("please enter a number!");
					i = i-1;
					//makes it so the loop doesn't continue
					keys.nextLine();
					//clears the scanner
					continue;
				} catch (Exception e) {
					System.out.println("number must be between 0 and 100!");
					i = i-1;
					//makes it so the loop doesn't continue
					keys.nextLine();
					//clears the scanner
					
					continue;
				}
				
				
				
			}
			
			total = total/6;
			//i didn't read i was supposed to stop at a negative number
			//until i finished the program 
			
			System.out.println("Your total is: " + total);
			
			if(total >= 90){
				System.out.println("Excellent Work!");				
			} else if (total >= 80 && total < 90) {
				System.out.println("Good Job!");
			} else if (total >= 70 && total < 80) {
				System.out.println("Keep it up!");
			} else {
				System.out.println("TRY HARDER!");
			}
			
			System.out.println("");
			System.out.println("again? (y/n)");
			//i wrote y/n to give the allusion of choice
			//anything but y will break it
			userinput = keys.next();
			
			
			if(userinput.compareToIgnoreCase("Y") != 0){
				System.out.println("thank you goodnight");
				again = false;
				break;
			}
			
			
			System.out.println("Lets go again");
		}
		
		
		
		
		
	}

}
