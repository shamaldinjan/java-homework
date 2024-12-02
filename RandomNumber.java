
package randomnumber;

import java.util.Scanner;

public class RandomNumber {

        public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             int number1,number2;
             number1 = (int)(Math.random()*10);
             number2 = (int)(Math.random()*10);

             number2 = input.nextInt();
             double sub = number1 - number2;
             System.out.println("what is the answer " +number1+"-"+number2+"?");
             double userAnswer = input.nextDouble();
             if(sub==userAnswer){System.out.println("correct");  }
        
             else{System.out.println("wrong");
             
             }
         }      
}
             
             
    
    

