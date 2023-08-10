import java.util.*;
public class queueusingarray {
static int size=10;
static int arr[]=new int [size];
static int fornt=-1;
static int rear=-1;

public static void enqueue(int data){
    Scanner sc=new Scanner(System.in);
    // int data=sc.nextInt();
    if(rear==size-1){
        System.out.println("queue is full");
    }
    rear++;
    arr[rear]=data;
}
public static void dequeue(){
    if(rear==-1&&fornt==-1){
       System.out.println("queue is underflow");
    }
    fornt=fornt+1;
    
}
public static void dispaly(){
    for(int i=fornt+1;i<=rear;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}


    public static void main(String  args[]){
      enqueue(100);
      enqueue(200);
      enqueue(300);
      enqueue(400);
      enqueue(500);
      enqueue(600);
      enqueue(700);
      enqueue(800);
      enqueue(900);
      enqueue(1000);
    //   enqueue(1000);
    //   dequeue();
      dispaly();
      dequeue();
      dequeue();
      dispaly();

    }
    
}

