// NeonNumber ---> Sum of digits of square of number is equal to the number.

class NeonNumber{
    public static void main(String args[]){

        int num = 9;

        int square = num * num;

        int sum = 0;

        while(square != 0){

            int digit = square % 10;

            sum = sum + digit;

            square = square / 10;
        }

        if(sum == num){
            System.out.println("Given number is Neon Number");
        }
        else{
            System.out.println("Given number is not Neon Number");
        }
    }
}