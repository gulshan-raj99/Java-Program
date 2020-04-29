class KardanesAlgo{
    public static void main(String[]args){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int n=arr.length;
       int max=0;
       int tempmax=0;
       for(int i=0;i<n;i++){
           tempmax=tempmax+arr[i];
           if(tempmax<0){
               tempmax=0;
           }
           if(tempmax>max){
               max=tempmax;
           }
        }
        System.out.println("the maxium  sum ofsubarray is :");

       System.out.println(max);
}
}