 
package bmi;

import java.util.Scanner;

 
public class BMI {

    
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double weight,height;
        System.out.println("enter the value of your weight in kg : ");
        weight = input.nextDouble();
        System.out.println("enter the value of your height in meters : ");
        height = input.nextDouble();
        double BMI = (weight)/(height*height);
        if(BMI<=18.5){System.out.println("your underweight");
        }else if(BMI<=30){System.out.println("your obese");
        
        }
        }

    }
    

