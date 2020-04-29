
class ArrayTypes {

    public static void main(String[]args){
        int[] arr = { 2, 4,6,8,10,12 };
        int n=arr.length;
        int even=0,odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0)
            even++;
            else if(arr[i]%2==1)
           odd++;          
        }
        if(even==n){
            System.out.println(" Even ");
        }
        else if(odd==n){
            System.out.println(" Odd ");
        }
        else{
            System.out.println("Mixed");
        }
    }
}