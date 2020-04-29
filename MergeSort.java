class MergeSort{
    
void merge(int arr[],int low,int mid,int high){
//finding the Size of subArray;
    int n1=mid-low+1;
    int n2=high-mid;
//decleare two sub arry;
    int a1[]=new int[n1];
    int a2[]=new int[n2];
//copiing data ti temprory array from main array arr[];
    for(int i=0;i<n1;i++){
        a1[i]=arr[low+i];
    }
    for(int j=0;j<n2;j++){
        a2[j]=arr[mid+1+j];
    }
/*merging the arrays*/

// intial index of first and second array
int i=0,j=0;

//intial index of merged subarray
int k=low;
while(i<n1 && j<n2){
    if(a1[i]<=a2[j]){
        arr[k]=a1[i];
        i++;
    }
    else{
        arr[k]=a2[j];
        j++;
    }
    k++;
}
//copying remaing element of subarray a1[]
while(i<n1){
    arr[k]=a1[i];
    i++;
    k++;
}
//copying remaing element of subarray a2[]

while(j<n2){
    arr[k]=a2[j];
    j++;
    k++;

}
}
//main function that sort the array using merge();

void sort(int arr[],int low,int high){
    if(low<high){
        //finding middle element.
       int  mid=(low+high)/2;
       //sort first and and second sub array
sort(arr,low,mid);
sort(arr,mid+1,high);
//merge the sorted array
merge(arr,low,mid,high);
    }
}
public  static void print(int arr[]){
    for(int iteam:arr){
        System.out.print(iteam+" ");
    }
}
public static void main(String[]args){

    int arr[]={9,3,6,5,7,8};
    System.out.println("given array is");
    print(arr);
    MergeSort obj=new MergeSort();
    obj.sort(arr,0,arr.length-1);

    System.out.println("\nSorted array is");
    print(arr);

}

}

