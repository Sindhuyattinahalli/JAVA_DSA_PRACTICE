//Palindrome-->
//A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization). 
//  Example, "madam" and "racecar" are palindromic words,
// 121 --> 121 is a palindromic number.
public class Palindrome {
    public static void main(String[] args){
        int num = 1221;
        int reverse = 0;
        int temp = num; // Store the original number in a temporary variable
        while(num!=0){
            int digit = num%10; // Get the last digit
            reverse = reverse*10 + digit; // Append the digit to the reverse
            num = num/10; // Remove the last digit
        }
        if(temp == reverse){
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        
}
}