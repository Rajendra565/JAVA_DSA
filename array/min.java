public class min {
    public static void main(String args[]){
        int arr[]={11,2,333,4,52,1,0,24};
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
             
        }
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        } 
        System.out.println((min+max)/2);       
    }
    
}

