public class bubblesort {
    

    public  static void main(String args[]){
        int arr[]={9,1,2,8,3,7,4,6,5};
        int temp=0;
        int pass=0;
        for(int i:arr){
            System.out.print(i+" ");
        }
        for(int i=1;i<arr.length;i++){
            pass=0;
            for(int j=0;j<arr.length-1;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                pass=1;
            }
            if(pass==0){
                break;
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}