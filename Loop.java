//import java.io.File;
//import java.io.IOException;
import java.util.Scanner;


//Write class header, intialize variables and attributes

public class Loop {
  
    int firstNum; 
    int secondNum; 
    int thirdNum;
    int fourthNum;
    int fifthNum; 

    //int x = 7;
    //double y = 582.0;
    //double z = 4.0;

   //private int fifthNum = 256; 

    //Write constructor signature
   public Loop(){
        fifthNum = 0;

   }

   public Loop(int fifthNum){
      
      fifthNum = 0; 

   }


   //Write method signature with user input parameter 
    public void loop(Scanner input){

       

        //z = y * 4 - (15 % x + z);

        //y = (5 + y)*x; 
    
        System.out.println("");
        System.out.println("Please enter a number: ");
       
        //Assign user input to variable
        int userNum = input.nextInt();
        
        //input.close();

        //if statement determining whether to run the loop or not
        if (userNum >= 0) {

        //for loop with 5 iterations of calculations
            for(int i = 0; i<5; i++){
            
                System.out.println("");
                System.out.println("i: " + i);

                //adds iteration number to 25
                firstNum = i + userNum + 25;
            
                System.out.println("i + " + userNum + " + 25 = " + firstNum);

                //divides that number by 3 and finds remainder
                secondNum = firstNum % 3; 

                System.out.println("remainder of that number divided by 3: " + secondNum);

                //adds those two numbers
                thirdNum = firstNum + secondNum;

                System.out.println(firstNum + " + " + secondNum + " = " + thirdNum);

                //adds that sum to each subsequent sum 
                fourthNum = fourthNum + thirdNum; 
    

                i = i++; 
            
                //resets first calculation to 0 for next loop
                firstNum = 0; 

                //z = z + 1; 

                }

                //System.out.println(y);
                
                //fifthNum += 2; 

        }

        //otherwise, print following message
        else {
            System.out.println("This program doesn't compute numbers below 0");
            
        }
       

    }

  }
    
    