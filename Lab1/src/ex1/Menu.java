package ex1;

import java.util.Scanner;

public class Menu {
    public Menu(){
    }
    public void DisplayOptions(){
        System.out.println("Select an option: \n");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication\n");
    }

    public ComplexNumbers Request_Number(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number's real part: ");
        int real_part = input.nextInt();
        System.out.println("Enter your number's imaginary part: ");
        int img_part = input.nextInt();
        return new ComplexNumbers(real_part, img_part);
    }
}