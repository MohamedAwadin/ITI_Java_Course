class Calculator {
    private int op1;
    private int op2;

    public Calculator() {
        this.op1 = 0;
        this.op2 = 0;
    }
    public int add(int op1, int op2) {
        return op1 + op2;
    }
    public int subtract(int op1, int op2) {
        return op1 - op2;
    }
    public int multiply(int op1, int op2) {
        return op1 * op2;
    }
    public int divide(int op1, int op2) {
        if(op2 == 0) {
            System.out.println("Division by zero is not allowed");
            
            return 0;
        }
        else {
            
            return op1 / op2;
        }
        
    }

}


public class Calc {
    public static void main(String[] args) {
        
        
        Calculator calc = new Calculator();

        
        if(args.length == 3) {
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[2]);
            switch(args[1]) {
                case "+":
                    System.out.println(calc.add(op1, op2));
                    break;
                case "-":
                    System.out.println(calc.subtract(op1, op2));
                    break;
                case "X":
                    System.out.println(calc.multiply(op1, op2));
                    break;
                case "/":
                    if(op2 == 0) {
                        System.out.println("Division by zero is not allowed");
                        
                    }
                    else{
                        System.out.println(calc.divide(op1, op2));
                    }
                    
                    break;
                default:
                    System.out.println("You Choose invalid operation");
            }
        } else {
            System.out.println("Wrong input form : <op1> <operation> <op2>");
            System.out.println(args.length);
        }
        
    }
}
