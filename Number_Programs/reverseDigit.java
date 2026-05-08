// Reverse a Digit
//Example: Input: 1234 Output: 4321
public class reverseDigit {
    public static void main(String[] args){
        int num = 1234;
        int reverse = 0;
        while(num!=0){
            int digit = num%10; // Get the last digit
            reverse = reverse*10 + digit; // Append the digit to the reverse
            num = num/10; // Remove the last digit
        }
        System.out.println("Reversed number: " + reverse);
    }
}