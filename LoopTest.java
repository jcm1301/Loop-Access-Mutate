//import java.io.IOException;
import java.util.Scanner;

public class LoopTest {
    
    //int firstNum; 
    
    
    public static void main(String[] args){
       
        //Instantiate object
        Loop myLoop = new Loop();
        Scanner input = new Scanner(System.in);

        //-----------------------Loop Class
        
        //call loop method with first user input and run loop
        myLoop.loop(input);

        System.out.println("");
        System.out.println("Sum of all sums: " + myLoop.fourthNum);
        System.out.println("");

        //------------------------AccessMutate Class

        //Instantiate object 
        AccessMutate Test1 = new AccessMutate(0, "initial String"); 
        
        //Access the initial value of variable fifthNum
        System.out.println(Test1.access()); 
        System.out.println("");

        //Access initial value of variable fifthNum by printing object and variable
        System.out.println(Test1.fifthNum);
        System.out.println("");
        
        //Prompts user to enter new value for fifthNum
        Scanner input2 = new Scanner(System.in);

        //outputs this new value of fifthNum
        System.out.println(Test1.mutate(input2));
        System.out.println("");

       
        //Access the intial string userString1
        System.out.println(Test1.accessString()); 
        System.out.println("");
        
        //Prompts user to enter a new string
        Scanner input3 = new Scanner(System.in);

        //outputs this string
        System.out.println(Test1.mutateString(input3));
        System.out.println("");

    }
    
}