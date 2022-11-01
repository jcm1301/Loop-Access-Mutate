import java.util.Scanner; 

public class AccessMutate extends Loop{

      
      private int userNum2; 
      int fifthNum;
      String userString1; 
      String nextString; 
      
        public AccessMutate(){
            super(); 
            fifthNum = 9;
            userString1 = "unknown"; 
        }
        
      
        //parameterized constructor for AccessMutate class
        public AccessMutate(int newFifthNum, String newUserString1){
            super();
            fifthNum = newFifthNum;  
            userString1 = newUserString1; 
        }
    
        //method to access value of variable fifthNum
        public int access(){

            System.out.println("The intial value of fifthNum is: " + "\n");
            return fifthNum;
  
        }
  
        //method to change value of fifthNum
        public int mutate(Scanner input2){
  
            System.out.println("\n" + "Please enter a new value for the variable fifthNum: " + "\n");
        
            userNum2 = input2.nextInt();
            fifthNum = userNum2; 
        
            System.out.println("\n" + "The new value for fifthNum is: " + "\n");
        
            return fifthNum; 
  
        
        }
      
        //method to access string userString1
        public String accessString(){

            System.out.println("Your intial string was: " + "\n");
            return userString1;
  
        }
      
        //method to change string 
        public String mutateString(Scanner input3){
  
        
            String userString1; 
  
            System.out.println("\n" + "Please enter a string: " + "\n");
        
            userString1 = input3.nextLine();
            nextString = userString1; 
            input3.close(); 
        
            System.out.println("\n" + "The new string " + "\n");
            return userString1; 
        
        
        }

          
  }
  
      


