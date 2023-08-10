

    public class quickshort {
        public static int partition(int arr[],int low,int high){
            int pivot=arr[high];
            int i=low-1;
            for(int j=low;j<high;j++)
    {
        if(arr[j]<pivot){
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }  
    i++;
    int temp=arr[i];
    arr[i]=pivot;
    pivot=temp;
    return i;
    }
        public static  void quickshort(int arr[],int low,int high){
            if(low<=high){
                int pivotindex=partition(arr, low, high);
                quickshort(arr, low, pivotindex-1);
                quickshort(arr, pivotindex+1, high);
            }
        }
        public static void main(String args[]){
            int arr[]={1,5,4,2,3,10};
            int n=arr.length;
            quickshort(arr, 0, n-1);
            for(int i:arr){
                System.out.print(i+" ");
            }
        }
    }

