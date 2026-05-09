// HappyNumber ---> Sum of squares of digits finally becomes 1.

class HappyNumber{
    public static void main(String args[]){

        int num = 19;

        while(num != 1 && num != 4){

            int sum = 0;

            while(num != 0){

                int digit = num % 10;

                sum = sum + (digit * digit);

                num = num / 10;
            }

            num = sum;
        }

        if(num == 1){
            System.out.println("Given number is Happy Number");
        }
        else{
            System.out.println("Given number is not Happy Number");
        }
    }
}