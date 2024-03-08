package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Menu menu = new Menu();
        menu.DisplayOptions();
        int choice = input.nextInt();

        ComplexNumbers nr1 = menu.Request_Number();
        ComplexNumbers nr2 = menu.Request_Number();

        System.out.println("Your first number is: "); nr1.display();
        System.out.println("Your second number is: "); nr2.display();

        switch(choice) {
            case 1:
                ComplexNumbers sum_res = ComplexNumbers.addition(nr1, nr2);
                System.out.println("Addition result: ");
                sum_res.display();
                break;
            case 2:
                ComplexNumbers sub_res = ComplexNumbers.subtraction(nr1, nr2);
                System.out.println("Subtraction result: ");
                sub_res.display();
                break;
            case 3:
                ComplexNumbers multipl_res = ComplexNumbers.multiplication(nr1, nr2);
                System.out.println("Multiplication result: ");
                multipl_res.display();
                break;
            default:
                System.out.println("Wrong option!");
        }
    }
}