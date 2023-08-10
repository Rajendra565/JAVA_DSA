public  class queueusinglinkedlist {
static class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;

    }
}
static node fornt=null;
static node rear=null;
public static void enqueue(int data){
    node newnode=new node(data);
    if(fornt==null&&rear==null){
        fornt=rear=newnode;
    }
    rear.next=newnode;
    rear=newnode;

}
public static void dequeue(){
    if(rear==null&&fornt==null){
        System.out.println("queue is empty");
    }
   fornt=fornt.next;
}
public static void dispaly(){
    node temp=fornt;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println();
}

public static void main(String args[]){
enqueue(100);
enqueue(200);
enqueue(300);
enqueue(400);
enqueue(500);
enqueue(600);
enqueue(700);
enqueue(800);
enqueue(1000);
dispaly();
dequeue();
dequeue();
dispaly();
}
    
}