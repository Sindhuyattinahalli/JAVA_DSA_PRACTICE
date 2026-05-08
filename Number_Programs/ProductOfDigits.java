// Program to find the product of digits of a number
class ProductOfDigits{
    public static void main(String args[]){
        int num = 6234; // You can change this number to test with different values
        int product = 1; // Initialize product to 1
        while(num!=0){
            int digit = num%10;
            product = product*digit;
            num = num/10;
        }
        System.out.println("Product of digits: " + product);
    }
}