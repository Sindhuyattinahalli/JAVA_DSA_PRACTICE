//StrongNumber----> It is a number in which the sum of the factorials 
// of its digits is equal to the original number.
// * Read the number.
// * Fetch each digit of the number.
// * Calculate the factorial of each digit.
// * Add all Factorial Values.
// * Compare the sum with Original value.
// * If both are equal it is a StrongNumber.
class StrongNumber{
    public static void main(String args[]){
        int num = 145;
        int original = num;
        int sum = 0;
        int digit = 0;

        while(num!=0){
            digit = num % 10;
            int fact = 1;

            for(int i=1;i<=digit;i++){
                 fact = fact * i;
            }
            sum = sum + fact;
            num = num/10;
        }
        if(sum == original){
            System.out.println("Given number is StrongNumber");
        }
        else{
            System.out.println("Given number is not a StrongNumber");
        }

    }
}