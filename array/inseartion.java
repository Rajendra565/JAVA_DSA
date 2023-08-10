import java.util.*;
public class inseartion {
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size of an array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        System.out.println("Enter the elemant of "+i+" index");
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the inseart index");
    int index=sc.nextInt();
    System.out.println("Enter the inseart elemant");
    int elemant=sc.nextInt();
    for(int i=n-2;i>=index;i--){
       
        arr[i+1]=arr[i];
    }
    arr[index]=elemant;
    System.out.println("your inseart value");
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }

    
    
}

}