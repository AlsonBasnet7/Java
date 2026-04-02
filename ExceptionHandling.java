//take two numbers from the user and its sum exception handling
import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {                    
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int div = num1 / num2;
        System.out.println("Sum: " + div);    
        }
        catch(Exception e){
            System.out.println("Please enter a valid integer");
        }
        System.err.println("Hello Bokachoda");
        //try and catch block
        // try {
        //     int div1 = num1 / num2;
        //     System.out.println("Division: " + div1);
        // } catch (ArithmeticException e) {           
        //     System.out.println("Error: " + e.getMessage());
        // } finally {
        //     System.out.println("This block will always execute.");
        // }




    }
}