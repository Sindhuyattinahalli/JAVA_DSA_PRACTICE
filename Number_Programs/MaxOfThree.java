class MaxOfThree{
    public static void main(String args[]){
        int num1 = 10; // You can change this number to test with different values
        int num2 = 20; // You can change this number to test with different values
        int num3 = 15; // You can change this number to test with different values

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println(num3 + " is the largest number.");
        }   
    }
}