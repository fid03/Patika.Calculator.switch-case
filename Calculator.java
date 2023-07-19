package PracticeTasks;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        System.out.print("First number: ");
        num1 = sc.nextInt();
        System.out.print("Second number: ");
        num2 = sc.nextInt();
        System.out.println("1.Add\n2.Substract\n3.Multiply\n4.Divide");
        System.out.print("Choose operator: ");
        int operator = sc.nextInt();

        switch (operator) {
            case 1:
                System.out.println("num1+num2= " + (num1 + num2));
                break;
            case 2:
                System.out.println("num1-num2= " + (num1 - num2));
                break;
            case 3:
                System.out.println("num1*num2= " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("num/num2= " + (num1 / num2));
                } else System.out.println("Can't divide by zero");

                break;
            default:
                System.out.println("Please choose operator again!");

        }
    }
}
