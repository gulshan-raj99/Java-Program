class InsertionSort{

    public static void insert(int arr[]){
int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void print(int arr[]){
       
        for(int iteam:arr){
           
            System.out.print(iteam+" ");
            
        }
    }
    public static void main(String[]args){
        int arr[]={3,9,1,7,5,6,2};
        System.out.println("\nthe array befor sorting is :");
        InsertionSort.print(arr);
        InsertionSort.insert(arr);
        System.out.println("\nthe array after sorting is :");
       
        InsertionSort.print(arr);
    }
}