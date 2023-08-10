public class binary_search {

    public static void main(String args[]){
       int arr[]={12,22,33,44,55,66,77,88,90,99,109,120};
       int item=12;
       int li=0;
       int hi=arr.length-1;
       while(li<=hi){
          int  mid=(li+hi)/2;
     
          if(arr[mid]==item){
           System.out.println("item is persant in "+mid+ " index");
           break;

          }
          else if(arr[mid]<item){
           li=mid+1;
          }
          else{
           hi=mid-1;
          }
      }
      System.out.println(arr.length);
    }
}

