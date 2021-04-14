// Assignment #: 2
//         Name: Joseph Kharzo
//      Lecture: TTH 1:30-2:45pm
//   Time spent: 20 minutes
//  Description: This program collects an unspecified amount of numbers from the user
//               and performs some calculations on them. The calculations are
//               displayed to the user, noting the maximum integer, the amount of
//               even integer, the smallest odd integer, and the sum of negative
//               integers. The program displays the output once the user enters 0.

import java.util.Scanner;

/**
 *
 * @author Joseph
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // The scanner class is used to read user input
        Scanner userInput = new Scanner(System.in);
        
        // This boolean is what enables the do-loop to run
        boolean keepRunning = true;
        
        // This variable will store user input
        int number;
        
        // This variables will store the results of the calculations
        int sumOfNegativeIntegers = 0;
        
        int smallestOddInteger = 0;
        
        int evenIntegers = 0;
        
        int maximum = 0;
        
        do {
            
            // The input is collected
            number = userInput.nextInt();
            
            // Checks whether the user input is larger than the previous largest number
            if(number > maximum){
                maximum = number;
            }
            
            // Checks if the input is even or odd
            // If the input is even, then the number of even integers is incremented
            // If the input is odd, then the number is checked to see if it is smaller than the previous smallest odd number
            if(number % 2 == 0){
                evenIntegers++;
            }else{
                
                if(number < smallestOddInteger){
                    smallestOddInteger = number;
                }
                
            }
            
            // Checks if the number is negative, then it find the new sum of negative integers
            if(number < 0){
                sumOfNegativeIntegers += number;
            }
            
            // Checks if the user input is 0 to end the do-loop
            if(number == 0){
                keepRunning = false;
            }
            
            
        } while (keepRunning);
        
        // The calculations are displayed
        System.out.println("The maximum integer is " + maximum);
        System.out.println("The count of even integers in the sequence is " + evenIntegers);
        System.out.println("The smallest odd integer in the sequence is " + smallestOddInteger);
        System.out.println("The sum of negative integers is " + sumOfNegativeIntegers);
        
    }
    
}
