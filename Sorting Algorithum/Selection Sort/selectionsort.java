

// public class selectionsort {

//     public static void main(String[] args) {
//         int arr[]={1,9,8,2,7,3,6,4,5};
//         int n=arr.length;
//         int swep=0;
//         for(int i=0;i<n-1;i++){
//             int min=i;
//             for(int j=i+1;j<n;j++){
//                 if(arr[j]<arr[min]){
//                     min=j;
//                 }

//             }
            
//                 swep=arr[i];
//                 arr[i]=arr[min];
//                 arr[min]=swep;
        

//         }
//         for(int i:arr){
//             System.out.print(i+" ");
//         }
//     }
// }




public class selectionsort {

    public static void main(String args[]){
        int arr[]={1,1,1,4,2,3,4,1,1,2,1,3};
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}

