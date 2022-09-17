//import java.io.Loop;
//import java.io.IOException;
import java.util.Scanner;

public class LoopTest {
    
    //int firstNum; 
    public static void main(String[] args){
       
        Loop myLoop = new Loop();
        Scanner input = new Scanner(System.in);

        myLoop.loop(input);

        System.out.println("");
        System.out.println("Sum of all sums: " + myLoop.fourthNum);
        System.out.println("");

    }
    
}