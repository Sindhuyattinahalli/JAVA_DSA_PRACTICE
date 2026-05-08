//swapping a 2 values using third variable
class Swap2Numbers {
    public static void main(String args[]){
        int num1 = 10; // You can change this number to test with different values
        int num2 = 20; // You can change this number to test with different values
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        int temp = num1; // Store num1 in a temporary variable
        num1 = num2; // Assign num2 to num1
        num2 = temp; // Assign the value stored in temp (original num1) to
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}
