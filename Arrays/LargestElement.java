class LargestElement{
    public static void largest(int a[]){
        int largest = Integer.MIN_VALUE;;
        for(int i=0;i<a.length;i++){
            if(a[i] > largest){
                largest = a[i];
            }
        }
                System.out.println(largest);
            
        
    }

    public static void main(String args[]){
        int a[] = {10,30,12,15,80,90,110};
        largest(a);
    }
}