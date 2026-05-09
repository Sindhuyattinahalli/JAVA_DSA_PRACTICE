class Fibonacci{
    public static void main(String[] args){
        int num = 7;// You can change this  value to test with different values
        int first = 0;
        int second = 1;
        for(int i = 1;i<=num;i++){
            System.out.println(first);

            int next = first + second;
                first = second;
                second = next;
        }
    }
}