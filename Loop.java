//import java.io.File;
//import java.io.IOException;
import java.util.Scanner;

public class Loop {
  
    int firstNum; 
    int secondNum; 
    int thirdNum;
    int fourthNum; 
    
   public Loop(){
        
   }

    public void loop(Scanner input){

    //public static void main(String[] args){
    
        System.out.println("");
        System.out.println("Please enter a number: ");
       
        int firstNum = input.nextInt();
        
        input.close();

        for(int i = 0; i<5; i++){
            
            System.out.println("");
            System.out.println("i: " + i);

            firstNum += i + 25;
            
            System.out.println("i + 25: " + firstNum);

            secondNum = firstNum % 3; 

            System.out.println("modulus 3: " + secondNum);

            thirdNum = firstNum + secondNum;
            System.out.println(firstNum + " + " + secondNum + " = " + thirdNum);

            fourthNum = fourthNum + thirdNum; 
            //sumThirdNums = thirdNum; 

            i = i++; 
            
            //return thirdNum;  

        }
        
       //return thirdNum; 
  }

    
}

