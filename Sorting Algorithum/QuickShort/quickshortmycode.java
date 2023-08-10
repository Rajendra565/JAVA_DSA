public class quickshortmycode {

    
 
    public static int parition(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            if(arr[i]<pivot){   
                i++;
            }
            else if(arr[j]>pivot){
                j--;
            }
            if(arr[j]<arr[i]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i];
        arr[i]=pivot;
        pivot=temp;
        return i;
    }
    public static void quick(int arr[],int low,int high){
        if(low<high){
            int pivotindex=parition(arr, low, high);
            quick(arr, low, pivotindex-1);
            quick(arr, pivotindex+1, high);
        }
    }
    
public static void main(String args[]){
int arr[]={5,3,4,2,1,8,23,12,42,1};
int low=0;
int high=arr.length;
quick(arr, low, high-1);
for(int i:arr){
    System.out.print(i+" ");
}
}
    
}