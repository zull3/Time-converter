/**
* The program calculates and converts time to seconds
* 
* 1. Create constants and variables 
* 2. Calculate hours and minutes to seconds
* 3. Print result
*
* @author Alexander Kraskovsky, laxkar-2
*/

//Import Scanner
import java.util.Scanner;
//Declare class and method
class Main {
  public static void main(String[] args) {

    //Declare hours to seconde
    //Declare minutes to seconds
    //Add the entered seconds to total

    //60s = 1min
    //60m = 1h
    //60s * 60m = 1h
    
    //Declare constants
    final int SEC_IN_A_MINUTE = 60;
    final int MINUTES_IN_A_HOUR = 60;
    final int SEC_IN_A_HOUR = SEC_IN_A_MINUTE * MINUTES_IN_A_HOUR; 

    //Define variables
    int hours = 0;
    int minutes = 0;
    int seconds = 0;

    int noOfSeconds = 0;

    Scanner userInput = new Scanner (System.in); 

    
    // Delimiter
    userInput.useDelimiter ("[:|\\s]+");

    
    System.out.println("Enter hour, min and seconds in the format (hh:mm:ss): ");

    hours = userInput.nextInt();
    //Validate hours
    if(hours < 0){
      System.out.println("hours must be > 0");
      System.exit(0);
    }
    if(hours > 23){
      System.out.println("hours must be < 23");
      System.exit(0);
    }
    minutes = userInput.nextInt();
    //Validate minutes
    if(minutes < 0){
      System.out.println("minutes must be > 0");
      System.exit(0);
    }
    if(minutes > 59){
      System.out.println("minutes must be < 59");
      System.exit(0);
    }
    seconds = userInput.nextInt();
    //Validate seconds
    if(seconds < 0){
      System.out.println("seconds must be > 0");
      System.exit(0);
    }
    if(seconds > 59){
      System.out.println("seconds must be < 23");
      System.exit(0);
    }

    noOfSeconds = seconds + (minutes * SEC_IN_A_MINUTE) + (hours * SEC_IN_A_HOUR);

      System.out.println("The total seconds are: " + noOfSeconds);
    
  }
}