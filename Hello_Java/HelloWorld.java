
package mypkg;
public class HelloWorld {
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            System.out.println(args[0]);
        }
        
    }
}
