
public class missing_number {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,7};
        for(int i=arr.length-1;i>=1;i--){
            if(arr[i] - 1 != arr[i - 1]){
                System.out.println(arr[i] - 1);
                // break;
            }
        }
    }
}

// public class missingnumber {
//     public static void main(String args[]){
//         int arr[]={1,2,3,4,6,7,8,9};
//         // for(int i=arr.length-1;i>0;i--){
//         //     if(arr[i]-1!=arr[i-1]){
//         //         System.out.println(arr[i]-1);
//         //     }
//         // }
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i]+1!=arr[i+1]){
//                 System.out.println(arr[i]+1);
//             }
//         }
//     }
// }