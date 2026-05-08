//Buzz----> A number is called a Buzz number if it is either divisible by 3.
//Fizz----> A number is called a Fizz number if it is divisible by 5.
//Buzzfizz----> A number is called a BuzzFizz number if it is divisible by both 3 and 5.
class BuzzFizz {
    public static void main(String args[]){
        int num = 15; // You can change this number to test with different values
        if(num%3==0 && num%5!=0){
            System.out.println(num + " is a Buzz number.");
        }
        else if(num%5==0 && num%3!=0){
            System.out.println(num + " is a Fizz number.");
        }
        else if(num%3==0 && num%5==0){
            System.out.println(num + " is a BuzzFizz number.");
        }
        else{
            System.out.println(num + " is neither a Buzz number nor a Fizz number.");
        }

        
}
}