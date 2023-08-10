import java.util.Scanner;

public class stackusingarray {
static  int size=10;
static  int arr[]=new int[size];
static  int top=-1;
public static void isfull(){
    if(top==size-1){
        System.out.println("overflow");
    }
    
}
public static void isEmpty(){
    if(top==-1){
        System.out.println("underflow");
    }
}
public static void push(){
    Scanner sc=new Scanner(System.in);
    int elemant=sc.nextInt();
    isfull();
    top++;
    arr[top]=elemant;
}
public static void pop(){
    isEmpty();
    int result=arr[top];
    arr[top--]=0;
    System.out.println("your elemant is  "+result+" delet suessfully");
}
public static void dispaly(){
    for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
public static  void peek(){
    isEmpty();
    System.out.println(arr[top]);
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){

            System.out.println("1. push\n2. pop\n3. dispaly\n4. peek");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                push();
                break;
                
                case 2:
                pop();
                break;
                
                case 3:
                dispaly();
                break;
                
                case 4:
                peek();
                return;
            }
     }

    }
}