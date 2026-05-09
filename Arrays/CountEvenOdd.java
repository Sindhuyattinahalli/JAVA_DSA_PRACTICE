class CountEvenOdd{
    public static void Count(int a[]){
        int Even = 0;
        int Odd = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                Even++;
            }
            else{
                Odd++;
            }
        }
        System.out.println( "Even Count:" + Even);
        System.out.println( "Odd Count :" + Odd);

    }
    public static void main(String args[]){
        int a[] = {1,2,4,5,6,9,11,20,42,7};
        Count(a);

    }
}