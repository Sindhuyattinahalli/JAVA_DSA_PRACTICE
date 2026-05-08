// finding a given number is even or odd without using modulus
class EvenOdd {
    public static void main(String[] args) {
        int number = 10; // You can change this number to test with different values

        if ((number / 2) * 2 == number) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}