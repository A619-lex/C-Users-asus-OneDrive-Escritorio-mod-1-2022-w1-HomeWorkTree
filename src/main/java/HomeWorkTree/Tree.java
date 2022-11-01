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
/**
alejandro barraza
 */
public class Tree {
    private int numBranches;
    private String Type;
    
    //constructor - create a specific tree with a given type and number of Branches
    
    public Tree(int numBranches, String Type){
        
        this.Type = Type;
        this.numBranches = numBranches;
        
    }
    public String climbTree(){
        return "i am climbing the" + this.Type + "tree.";
        
    }
    
}
