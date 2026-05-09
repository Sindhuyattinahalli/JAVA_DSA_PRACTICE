class CheckSortedArray{
    public static boolean isSorted(int a[]){
        for(int i=0; i<a.length-1; i++){
            if(a[i] > a[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        int a[] = { 10,60,30,40,50};
        System.out.println(isSorted(a));
    }
}