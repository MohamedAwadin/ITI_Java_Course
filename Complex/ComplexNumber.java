

public class ComplexNumber {
    
private double real;
private double imaginary;

public ComplexNumber(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
}

public double getReal() {
    return real;
}

public double getImaginary() {
    return imaginary;
}

public void setReal(double real) {
    this.real = real;
}

public void setImaginary(double imaginary) {
    this.imaginary = imaginary;
}


public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
    double real = c1.getReal() + c2.getReal();
    double imaginary = c1.getImaginary() + c2.getImaginary();
    return new ComplexNumber(real, imaginary);
}


public static ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2) {
    double real = c1.getReal() - c2.getReal();
    double imaginary = c1.getImaginary() - c2.getImaginary();
    return new ComplexNumber(real, imaginary);

}

public void display() {
    if (imaginary < 0)
        System.out.println(this.real + " - " + (-1)*this.imaginary + "i");
    else
        System.out.println(this.real + " + " + this.imaginary + "i");
}


}

class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1, 2);
        ComplexNumber c2 = new ComplexNumber(3, 4);
        ComplexNumber c3 = ComplexNumber.add(c1, c2);
        
        c1.display();
        c2.display();
        c3.display();
        
        c3 = ComplexNumber.subtract(c1, c2);
        
        c1.display();
        c2.display();
        c3.display();
    }
}