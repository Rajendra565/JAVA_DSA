

public class stackusinglinkedlist {
    static class node{
        int data;
        node next;
        node (int data){
            this.data=data;
            this.next=null;
        }
    }
    static node top=null;
public static void push(int data){
    node newnode=new node(data);
    if(top==null){
        top=newnode;
    }
    else{

        newnode.next=top;
        top=newnode;
    }
    

}
public static void pop(){
    if(top==null){
        System.out.println("Stack is underflow");
    }
    top=top.next;
}
public static void dispaly(){
    node temp=top;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println();

}
    public static void main(String args[]){
        push(100);
        push(200);
        push(300);
        push(400);
        push(500);
        dispaly();
        pop();
        dispaly();
    }
}
