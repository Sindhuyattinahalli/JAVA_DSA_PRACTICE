////swapping a 2 values without using a thirs variable
/// This program demonstrates how to swap two numbers without using a temporary variable. It uses arithmetic operations to achieve the swap.
class Swap2_Numbers {
    public static void main(String args[]){
        int num1 = 10; // You can change this number to test with different values
        int num2 = 20; // You can change this number to test with different values
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        
        // Swapping using arithmetic operations
        num1 = num1 + num2; // Step 1: num1 now holds the sum of num1 and num2
        num2 = num1 - num2; // Step 2: num2 now holds the original value of num1
        num1 = num1 - num2; // Step 3: num1 now holds the original value of num2
        
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}
