
package chinesezodiac;

import java.util.Scanner;


public class Chinesezodiac {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("please entered the year to check : ");
        int year = input.nextInt();
        switch (year%12) {
        case 0:
            System.out.println("the entred year monkey : ");
            break;
        case 1:
            System.out.println("the enter year is rooster : ");
             break;
        case 2:
            System.out.println("the enter year is dog : ");
     
     break;
        case 3:
            System.out.println("the enter year is pig : ");
  break;
        case 4:
            System.out.println("the enter year is rat : ");
            
           break;
        case 5:
            System.out.println("the enter year is ox : ");
   
         break;
        case 6:
            System.out.println("the enter year is tiger : ");
     
           break;
        case 7:
            System.out.println("the enter year is rabbit : ");
   
           break;
        case 8:
            System.out.println("the enter year is dragon : ");
   
           break;
        case 9:
            System.out.println("the enter year is Snake : ");
   
          break;
        case 10:
            System.out.println("the enter year is  horse ");
    
          break;
        case 11:
            System.out.println("the enter year is sheep : ");
    
            
            
            
            
            
            
            
            
            
            
            
        }
        
        
      
    }
    
}
