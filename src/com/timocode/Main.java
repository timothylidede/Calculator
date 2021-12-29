package com.timocode;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;

        Scanner input=new Scanner(System.in);

	    System.out.println("Enter an operator( +, -, *, / ): ");
	    operator=input.next().charAt(0);

	    System.out.println("Enter first number: ");
	    number1=input.nextDouble();

	    System.out.println("Enter second number: ");
	    number2=input.nextDouble();

	    switch(operator){
            case '+':
                result = number1 + number2;
                System.out.println(number1 + '+' + number2 + '=' + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.print(number1 + "-" + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.print(number1 + "*" + number2 + " = " + result);
                break;

            case '/':
                if (number2 == 0) {
                    System.out.print("Sijiskii kudivide number by zero!");
                } else {
                    result = number1 / number2;
                    System.out.print(number1 + "/" + number2 + " = " + result);
                }
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}

