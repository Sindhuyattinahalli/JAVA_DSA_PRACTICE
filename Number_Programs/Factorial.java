// Finding a factorial of a number
// Ex : 5! = 5*4*3*2*1 = 120
class Factorial{
    public static void main(String args[]){
        int num = 10; // You can change this number to test with different values
        int factorial = 1; // Initialize factorial to 1
        for(int i=num; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}