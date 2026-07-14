package stesting;

// my first java program
public class Learning_areas {
    public static void main(String[] args) {
        //operator and operand class topic   
           
        System.out.println("=================================");
        System.out.println("=     |                   |     =");
        System.out.println("=    |OPERATOR AND OPERANDS|    =");
        System.out.println("=   |                       |   =");
        System.out.println("=================================");
        
        
          System.out.println("");
          System.out.println("");
          System.out.println("");        
        
        
        //examples of arithmetics + , - , * , / , % .
        System.out.println("===== ARITHMETIC EXAMPLES =====");
          System.out.println("");
        System.out.println("      35 + 23 = " + (35 + 23));
        System.out.println("      35 - 23 = " + (35 - 23));
        System.out.println("      35 * 23 = " + (35 * 23));
        System.out.println("      35 / 23 = " + (35 / 23)); 
        System.out.println("      50 % 50 = " + (50 % 50)); 
          System.out.println("");
        System.out.println("===============================");
        
        
          System.out.println("");
          System.out.println("");
          System.out.println("");
        
        
        //examples of Assignment operators = , += , -= , *= , /= , %= .
        
        System.out.println("===== ASSIGNMENT OPERATORS =====");
          System.out.println("");
        
        int num1 = 10;
        int num2 = 20;
        
        System.out.println("     Out Put Example: " + (num1  = num2));
        num1 = 10;      // this lines like num1 and num2 resets the number so it woudnt use the number that the = output
        num2 = 20;        
        System.out.println("     Out Put Example: " + (num1 += num2));
        num1 = 10;
        num2 = 20;
        System.out.println("     Out Put Example: " + (num1 -= num2));
        num1 = 10;
        num2 = 20;
        System.out.println("     Out Put Example: " + (num1 *= num2));  
        num1 = 10;
        num2 = 20;
        System.out.println("     Out Put Example: " + (num1 /= num2));
        num1 = 10;
        num2 = 20;
        System.out.println("     Out Put Example: " + (num1 %= num2));
        
          System.out.println("");
        System.out.println("===============================");
        
        
          System.out.println("");
          System.out.println("");
          System.out.println("");
          
         //examples of Unary operators ++ , -- , ! .
        System.out.println("====== Unary OPERATORS ======");
          System.out.println("");
          
        int Unary = 5;
        Unary ++;
        System.out.println("     Example Out put: " + (Unary));
        Unary --;
        System.out.println("     Example Out put: " + (Unary));
        
        boolean Test = true;
        System.out.println("     Example Out put: " + (!Test));
        
          System.out.println("");
        System.out.println("=============================");
  
        
          System.out.println("");
          System.out.println("");
          System.out.println("");   
        
          
          //Examples of Logical operators && , || , ! .
        System.out.println("====== LOGICAL OPERATOR ======");
         System.out.println("");
         
         System.out.println("    Example Out put: " + ((true) && (true)));
         System.out.println("    Example Out put: " + ((true) || (false)));
         System.out.println("    Example Out put: " + !(true));
        

         System.out.println("");
        System.out.println("=============================="); 

        
          System.out.println("");
          System.out.println("");
          System.out.println("");
          
          
          //Examples of Relationa operator == , > , < , >= , <= , !=
        System.out.println("====== RELATIONAL OPERATOR ======");
         System.out.println("");
         
         System.out.println("    Example Out put: " + ((num1) == (num2)));
         System.out.println("    Example Out put: " + ((num1) > (num2)));
         System.out.println("    Example Out put: " + ((num1) < (num2)));
         System.out.println("    Example Out put: " + ((num1) >= (num2)));
         System.out.println("    Example Out put: " + ((num1) <= (num2)));
         System.out.println("    Example Out put: " + ((num1) != (num2)));
         
         System.out.println("");
        System.out.println("=================================");
    }
}
