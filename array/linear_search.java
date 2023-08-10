import java.util.*;
public class linear_search {


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the "+i+" index elemant");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter search elemant");
        int elemant=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==elemant){
                System.out.println("this elemant are presant in "+i+" index");
            }
            
        }


    }
}