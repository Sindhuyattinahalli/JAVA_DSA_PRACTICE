class SmallestElement{
    public static void smallest(int a[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i] < smallest){
                smallest = a[i];
            }
        }
        System.out.println(smallest);
    }

    public static void main(String args[]){
        int a[] = {10,20,45,60,100};
        smallest(a);
    }

}