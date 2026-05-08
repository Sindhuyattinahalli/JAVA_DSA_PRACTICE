// GCD---> Greatest Common Divisor
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int a = num1;
        int b = num2;
         
        while(num2 !=0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("GCD of " + a + " and " + b + " is: " + num1);
    }
}