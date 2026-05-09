//PerfectNumber -- >Sum of factors excluding the number itself is equal to the original number.

class PerfectNumber{
    public static void main(String [] args){
        int num = 6; // You can change this value to test with different values
        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum = sum + i;
            }
        }
        if(sum == num){
            System.out.println("Given number is Perfect number");
        }
        else{
            System.out.println("Given number is not a Perfect number");
        }

    }
}
