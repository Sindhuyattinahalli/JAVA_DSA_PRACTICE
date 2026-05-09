class CountPositiveNegative{
    public static void isCount(int a[]){
        int positive = 0;
        int negative = 0;
        for(int i=0 ;i <a.length;i++){
            if(a[i] >0 ){
                positive++;
            }
            else if(a[i]<0){
                negative++;
            }
        }
        System.out.println("Positive Count is: " + positive);
        System.out.println("Negative Count is: " + negative);
    }

    public static void main(String args[]){
        int a[] = {10,20,30,-1,-2,12,-7,-8,10};
        isCount(a);
    }
}