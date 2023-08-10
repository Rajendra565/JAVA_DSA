public class delect {
    public static void main(String args[]){
        int arr[]={1,2,34,3,4,5,6,7,8,9,0};
        int index=2;
        System.out.println("befor array ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("");
        for(int i=index+1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        System.out.println(   "after delect array ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
