import java.util.Scanner;
class MiniCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a value: ");
        int a =  sc.nextInt();
        System.out.println("Enetr b value: ");
        int b = sc.nextInt();
        System.out.println("Select an operator: ");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+' : System.out.println("Sum:" + (a+b));
            break;

            case '-' : System.out.println("Difference:"+ (a-b));
            break;

            case '*' : System.out.println("Product:" + (a*b));
            break;

            case '/' : System.out.println("Division:" + ((double)(a/b)));
            break;
            default : System.out.println("Invalid Operator");
        }

    }
}