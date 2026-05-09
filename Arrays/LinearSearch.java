class LinearSearch{
    public static String isSearch(int a[] , int key){
        for(int i=0;i<a.length;i++){
            if(a[i] == key){
                return "key Element is found at index:" + i ;
            }
        }
                return "Key Element not fond ";
            }

    public static void main(String args[]){
        int a[] = {10,20,30,40};
        System.out.println(isSearch(a,30)); 
    }
}