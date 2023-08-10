public class inseartionsort {

    public static void main(String args[]){
        int arr[]={4,3,2,1};
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];

                }
                
                j--;
            }
            arr[j+1]=temp;

        }
        for(int i:arr)
        System.out.print(i+" ");
    }
}