// MagicNumber ---> Sum of digits repeatedly becomes 1.

class MagicNumber{
    public static void main(String args[]){

        int num = 1729;

        while(num > 9){

            int sum = 0;

            while(num != 0){

                int digit = num % 10;

                sum = sum + digit;

                num = num / 10;
            }

            num = sum;
        }

        if(num == 1){
            System.out.println("Given number is Magic Number");
        }
        else{
            System.out.println("Given number is not Magic Number");
        }
    }
}