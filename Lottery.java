package lottery;

import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int randomNumber1 = (int) (Math.random() * 10);
        int randomNumber2 = (int) (Math.random() * 10);

        System.out.println("please enter the golden numbers ");
        int golden1, golden2;
        System.out.print("please enter the golden number1 : ");

        golden1 = input.nextInt();

        System.out.print("please enter the golden number2 : ");

        golden2 = input.nextInt();

        if (golden1 == randomNumber1 && golden2 == randomNumber2) {
            System.out.println("Congratulation you hava won 10000$");
        } else if (golden1 == randomNumber2 || golden2 == randomNumber1) {
            System.out.println("Congratulation you hava won 3000$");
        } else if (golden1 == randomNumber1 || golden2 == randomNumber2) {
            System.out.println("Congratulation you hava won 1000");
        } else {
            System.out.println("Sorry , you hava no thing , please try again ");

        }
    }

}
