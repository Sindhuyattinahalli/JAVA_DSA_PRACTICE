// PerfectSquare ---> A number whose square root is an integer.

class PerfectSquare{
    public static void main(String args[]){

        int num = 25;

        int sqrt = (int)Math.sqrt(num);

        if(sqrt * sqrt == num){
            System.out.println("Given number is Perfect Square");
        }
        else{
            System.out.println("Given number is not Perfect Square");
        }
    }
}