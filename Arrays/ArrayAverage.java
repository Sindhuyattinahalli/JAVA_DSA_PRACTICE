class ArrayAverage{
    public static void Average(int a[]){
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum = sum+a[i];
        }
        int average = sum/a.length;
        System.out.println(average);
    }

    public static void main(String args[]){
        int a[] = {10,20,40,50,60};
        Average(a);                 
    }
}