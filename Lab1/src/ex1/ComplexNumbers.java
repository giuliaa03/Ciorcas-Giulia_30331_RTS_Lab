package ex1;

public class ComplexNumbers {
    int real, imaginary;

    public ComplexNumbers(int r, int i) {
        this.real = r;
        this.imaginary = i;
    }

    public void display() {
        if (this.imaginary > 0)
            System.out.println(this.real + "+" + this.imaginary + "i");
        else if (this.imaginary == 0) System.out.println(this.real);
        else System.out.println(this.real + "" + this.imaginary + "i");

    }

    public static ComplexNumbers addition(ComplexNumbers c1, ComplexNumbers c2) {
        int res_real = c1.real + c2.real;
        int res_img = c1.imaginary + c2.imaginary;
        return new ComplexNumbers(res_real, res_img);
    }

    public static ComplexNumbers subtraction(ComplexNumbers c1, ComplexNumbers c2) {
        int res_real = c1.real - c2.real;
        int res_img = c1.imaginary - c2.imaginary;
        return new ComplexNumbers(res_real, res_img);
    }

    public static ComplexNumbers multiplication(ComplexNumbers c1, ComplexNumbers c2) {
        int res_real = c1.real * c2.real - c1.imaginary * c2.imaginary;
        int res_img = c1.real * c2.imaginary + c2.real * c1.imaginary;
        return new ComplexNumbers(res_real, res_img);
    }
}
