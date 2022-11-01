/*
Create a new Java Class called “Tree” 
Add TWO properties following best practice. The properties should be (i) type – this is text, and (ii) 
numBranches - this is an integer 
Add a constructor to the class that will create a new tree based on a type and a number of branches 
passed as parameters 
Add a method called climbTree() that will return a message saying “You are climbing the <tree type 
here>” 
Now create a main class called Park in the same project. Add some code to create 5 trees by asking 
the user for the type of tree and the number of branches. The validation rules are: 
 The type (of tree) must be text (you do not have to check that it is a real colour!) 
The number of branches must be a number between 10 and 45 
If invalid data is entered, output a useful error message. 
Finally, include a loop that will climb all the trees in the Park and output the message from the 
climbTree() method. 
*/
package HomeWorkTree;
import java.util.Scanner;
/**
alejandro barraza
 */
public class InputUtilities {
    public static String getUserText(String prompt){
        
        Scanner myKB = new Scanner(System.in);
        String userInput;
        do{
            
            System.out.println(prompt);
            
            try{
                userInput = myKB.nextLine();
                
            }
            catch(Exception e){
                
                System.out.println("Input error!");
                userInput = ""; //set it to nothinig if invalid
        }
    }while (!userInput.matches("[a-zA-Z]+"));
        return userInput;
    
}
 public static int getUserInt(String prompt, int minValue, int maxValue){
        
        
          Scanner myKB = new Scanner(System.in);
           
          int userInput=0;
           
          boolean valid = false; 
           
           do{
             //prompt user for input - if not integer - output error and ask again
               System.out.println(prompt); //output prompt
               System.out.println("You must enter a value between " + minValue + " and " + maxValue );
               
            try{
                userInput = Integer.parseInt(myKB.nextLine()); //read input
                valid = true;
            }
            catch(Exception e){
                
                System.out.println("That is not a number. Please try again");
                //valid stays false
            }
            
            //not valid if < minValue or > maxValie
        }while ( (!valid) || (userInput < minValue) || (userInput > maxValue));
           
           //must be valid and within the range
           return userInput;
           
    }
     public static double getUserDouble(String prompt, int minValue, int maxValue){
        
       
          Scanner myKB = new Scanner(System.in);
           double userInput=0;
           boolean valid = false;
           
           do{
                //prompt user for a decimal - if not decimal - output error and ask again
               System.out.println(prompt); //output prompt
               System.out.println("You must enter a value between " + minValue + " and " + maxValue );
               
            try{
                userInput = Double.parseDouble(myKB.nextLine()); //read input
                valid = true;
            }
            catch(Exception e){
                
                System.out.println("That is not a number. Please try again");
                //valid stays false
            }
            
        }while ( (!valid) || (userInput < minValue) || (userInput > maxValue));
           
           //must be valid and within the range
           return userInput;
           
    }
}
