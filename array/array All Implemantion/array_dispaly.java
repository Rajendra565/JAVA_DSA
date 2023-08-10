public class array_dispaly {
    
public static void dispaly(int arr[]){
    
    
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
public static void inseart(int arr[],int index,int elemant){
    arr[index]=elemant;
    for(int i=arr.length-2;i>=0;i--){
        arr[i+1]=arr[i];

    }
}
public static void deletion(int arr[],int index){
    for(int i=index+1;i<arr.length;i++){
        arr[i-1]=arr[i];
    }
}
public static void linear_search(int arr[],int elemant){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==elemant){
            System.out.println("this elemant is presant in "+i+" index");
            break;
        }
    }
}
public static void binarySearch(int arr[],int elemant){
    int li=0;
    int hi=arr.length-1;
    int mid=0;
    while(li<=hi){

       mid=(li+hi)/2;
        if(arr[mid]==elemant){
            System.out.println("this elemant is presant in "+mid+" index");
            break;
        }
        else if(arr[mid]<elemant){
            li=mid+1;
            
        }
        else{
            hi=mid-1;
        }
    }
}
    public static void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        int swap=0;
        while(i<=j){
           swap=arr[i];
           arr[i]=arr[j];
           arr[j]=swap;
           i++;
           j--;
        }
        // for (int k : arr) {
        //     System.out.println(k);
        // }
    }
    public static void max(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maxmum elemant is "+max);
        

    }
    public static void min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];

            }
        }
        System.out.println("minimum elemant is "+min);

    }
    public static void missing_number(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]+1!=arr[i+1]){
                System.out.println(arr[i]+1);
                // break;
            }
        }
    }



    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10,0};
        // System.out.println();
        // dispaly(arr);
        // System.out.println("inseartion");
        // inseart(arr, 4, 11111);

        // dispaly(arr);
        // System.out.println("Deletion\n ");
        // deletion(arr, 4);System.out.println();
        // dispaly(arr);
        // System.out.println("\nelemant search");
        // linear_search(arr, 6);
        // dispaly(arr);
        // binarySearch(arr, 7);
        // dispaly(arr);
        // System.out.println();
        reverse(arr);
        // dispaly(arr);
        // dispaly(arr);
        // max(arr);
        // min(arr);
        
        // this missing in a sort array sort array are as below
        // int arrar[]={1,2,3,4,6,8,10};
        // missing_number(arrar);



    }
}