// finding a maximum aong three numbers using ternary operator
class MaxOf_Three {
    public static void main(String args[]){
        int num1 = 20; // You can change this number to test with different values
        int num2 = 10; // You can change this number to test with different values  
        int num3 = 15; // You can change this number to test with different values
        int max =
        (num1>num2) ? (num1>num3 ? num1:num3)
        : (num2>num3 ? num2:num3);
        System.out.println(max + " is the largest number.");    
        
    }
}