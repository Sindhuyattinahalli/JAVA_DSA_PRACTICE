// ArmStrongNumber---> An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
//  Instructions to Find an Armstrong Number
//  1.Take a number as input.
//  2.Count the total number of digits in the number.
//  3.Separate each digit of the number one by one.
//  4.Raise each digit to the power of the total number of digits.
//  5.Add all the powered values.
//  6.Compare the obtained sum with the original number.
//  7.If both are equal, the number is an Armstrong number.
//  8.Otherwise, it is not an Armstrong number.

class ArmStrongNumber{
    public static void main(String args[]){
        int num = 153;
        int original = num;
        int temp = num;
        int count = 0;
        int digit = 0;
        int sum = 0;

        while(num!=0){
            count++;
            num = num/10;
        }
         while(temp!=0){
            digit = temp % 10;
            int pow = (int)Math.pow(digit,count);
            sum = sum + pow;
            temp = temp/10;
        
         }
         if(sum == original){
            System.out.println("Given number is ArmStrongNumber");
         }
         else{
            System.out.println("Given number is not ArmStrongNumber");
         }
        }

    }
