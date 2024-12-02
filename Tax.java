  
package tax;

import java.util.Scanner;

public class Tax {

    private static int status;

        public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
            System.out.println("please enter your amount ! ");
            int income = input.nextInt();
            System.out.println("please enter your tax filling, " 
            +"\n Enter 1 for single,"
            +"\n Enter  2 for Married jointly,"
            +"\n Enter  3 for Marrid saaperatlly,"
            +"\n Enter 4 for household filling.");
            int status = input.nextInt();
            double tax;
            
            
            if(status == 1)if(income >= 0 && income <= 8350) {
             tax = (income*10)/100d;   
                System.out.println("your payable tax amount is " + tax); 
            }else if (income >= 8351 && income <= 33950){
                tax = (income * 15)/100d;
                System.out.println("your payable tax amount is " + tax);
            }else if (income >= 33951 && income <= 82250)
            {tax = (income *25)/100d;
             System.out.println("your payable tax amount is " + tax);
            }else if(income >= 82251 && income <= 171550){
                tax = (income * 28)/100d;
             System.out.println("your payable tax amount is " + tax);
            }else if(income >= 372951 && income <= 372950)
            {            {tax = (income *35)/100d;
              System.out.println("your payable tax amount is " + tax);
            }

                }
                if (status == 2){
                    if (income >= 0 && income <= 16700) {
                    tax = (income * 10 )/100d;
                     System.out.println("your payable tax amount is " + tax);
                    }else if (income >= 16701 && income <= 67900) {
                                    
                    tax = (income * 15)/100d;
                     
                     System.out.println("your payable tax amount is " + tax);
                    }else if(income >= 67901 && income <= 137050){
                         tax = (income * 28)/100d;
             System.out.println("your payable tax amount is " + tax);
                    } else if (income >= 208851 && income <= 372950) {
                       tax = (income * 33)/100d;
             System.out.println("your payable tax amount is " + tax);
                    } else if (income >= 372951) {
                {tax = (income *35)/100d;
              System.out.println("your payable tax amount is " + tax);
                        
                            

                }   
                    
                    }
                    

            
            }
            
            
            
     }
}
