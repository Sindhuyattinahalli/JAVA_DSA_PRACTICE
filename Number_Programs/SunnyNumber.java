// SunnyNumber ---> If next number is a perfect square.

class SunnyNumber{
    public static void main(String args[]){

        int num = 8;

        int next = num + 1;

        int sqrt = (int)Math.sqrt(next);

        if(sqrt * sqrt == next){
            System.out.println("Given number is Sunny Number");
        }
        else{
            System.out.println("Given number is not Sunny Number");
        }
    }
}