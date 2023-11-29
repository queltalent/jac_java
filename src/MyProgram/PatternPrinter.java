package MyProgram;

import java.util.Scanner;

public class PatternPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		int patternNumber, inputValue;
		boolean firstTime = true;
		
        while (true) {
        	if(firstTime) {
        		System.out.println(" - - - Welcome to Nancy's Triangle/Diamond Printer - - - ");
                System.out.println();
                System.out.println("Which pattern do you want to print?");
        	}else {
        		 System.out.println();
        		 System.out.println("So which pattern do you want to print now？");
        	}
            System.out.println("1) 54321\t2)   1\t\t3) 12345\t4)  1");
            System.out.println("   5432\t\t    12\t\t    2345\t   123");
            System.out.println("   543\t\t   123\t\t     345\t  12345");
            System.out.println("   54\t\t  1234\t\t      45\t   123");
            System.out.println("   5\t\t 12345\t\t       5\t    1");
            System.out.println();
            System.out.print("Enter your choice (pattern number(1-4),5 to Quit): ");
            patternNumber = kb.nextInt();

            if (patternNumber == 5) {
                System.out.println("Hope you enjoyed the triangles ... ");
                break;
            } else if (patternNumber < 1 || patternNumber > 4) {
            	System.out.println();
                System.out.println("Woops! " + patternNumber + " is an illegal choice. Please try again.");
                System.out.println("Please enter a number between 1 and 5 inclusive:");
                System.out.println();
                continue;
            }
            
            do{
            	System.out.print("How many rows would you like to print? (More than 1 please): ");
                inputValue = kb.nextInt();
              }while(inputValue <= 1);

            switch (patternNumber) {
                case 1:
                    printPattern1(inputValue);
                    break;
                case 2:
                	printPattern2(inputValue);
                    break;
                case 3:
                	printPattern3(inputValue);
                    break;
                case 4:
                	printPattern4(inputValue);
                    break;
                default:
                    break;
                    
            }
            firstTime = false;
        }

        kb.close();
    }
	
	private static void printPattern1(int value) {
	    for (int i = 0; i < value; i++) {
	        for (int j = value; j > i ; j--) {
	            System.out.print(j);
	        }
	        System.out.println();
	    }
	}
	
	private static void printPattern2(int value) {
		for (int i = 1; i <= value; i++) {
	    	for (int j = 1; j <= value-i; j++) {
	    		System.out.print(" ");
	    	}
	        for (int k = 1; k <=i ; k++) {
	            System.out.print(k);
	        }
	        System.out.println();
	    }
	}
	
	private static void printPattern3(int value) {
	    for (int i = value; i >=1; i--) {
	    	for (int j = 1; j <= value-i; j++) {
	    		System.out.print(" ");
	    	}
	        for (int k = value - i + 1; k <=value ; k++) {
	            System.out.print(k);
	        }
	        System.out.println();
	    }
	}
		
	private static void printPattern4(int value) {
		if (value % 2 !=0) {
			int midRow = (value + 1) / 2;
	        for (int i = 1; i <= midRow; i++) {
	            // Print spaces
	            for (int j = 1; j <= midRow - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }

	        for (int i = midRow - 1; i >= 1; i--) {
	            for (int j = 1; j <= midRow - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
		}else {
			int midRow = value / 2;
	        for (int i = 1; i <= midRow; i++) {
	            // Print spaces
	            for (int j = 1; j <= midRow - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }

	        for (int i = midRow; i >= 1; i--) {
	            for (int j = 1; j <= midRow - i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
		}
		
        
	}

}
