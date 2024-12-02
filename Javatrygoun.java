
package javatrygoun;

import java.util.Scanner;

public class Javatrygoun {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,A,B,C,x1,x2,x3,y1,y2,y3;
        System.out.println("please enter thhe value of x1 : ");
        x1 = input.nextDouble();
         System.out.println("please enter thhe value of y1 : ");
        y1 = input.nextDouble();
         System.out.println("please enter thhe value of x2 : ");
        x2 = input.nextDouble();
         System.out.println("please enter thhe value of y2 : ");
        y2 = input.nextDouble();
         System.out.println("please enter thhe value of x3 : ");
        x3 = input.nextDouble();
         System.out.println("please enter thhe value of y3 : ");
        y3 = input.nextDouble();
        a = Math.sqrt(Math.pow(x3-x2, 2)) + Math.sqrt(Math.pow(y3-y2, 2));
        b = Math.sqrt(Math.pow(x3-x1, 2)) + Math.sqrt(Math.pow(y3-y1, 2));
        c = Math.sqrt(Math.pow(x2-x1, 2)) + Math.sqrt(Math.pow(y2-y1, 2));
        A = Math.toDegrees(Math.acos((a*a-b*b-c*c) / (-2*b*c)));
        B = Math.toDegrees(Math.acos((a*a-b*b-c*c) / (-2*a*c)));
        C = Math.toDegrees(Math.acos((a*a-b*b-c*c) / (-2*b*a)));

    }

}


    
    
