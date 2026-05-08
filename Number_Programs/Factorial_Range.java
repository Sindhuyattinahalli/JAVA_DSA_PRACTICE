//  Finding factorial of a number in a given range
class Factorial_Range{
    public static void main(String args[]){
        int n = 10;
        for(int i=1;i<=n;i++){
            int factorial = 1;
            for(int j=i; j>0; j--){
                factorial = factorial*i;
            }
            System.out.println("Factorial of " + i + "("+ i + "!"+ ")" + " is: " + factorial);
        }
    }
}