class PrimeNumber {
    public static void main(String[] args) {
        int num = 10; // You can change this number to test with different values
        int count = 0;
        for(int i=1; i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
            if(count==2){
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }


        