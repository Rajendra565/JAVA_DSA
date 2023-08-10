public class reverslinkedlist {
static class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public static void revers(node head){
    if(head!=null){
        revers(head.next);
        System.out.print(head.data+" ");
    }
}
public static void dispaly(node head){
    node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println();
}
    public static void main(String args[]){
        node head=new node(10);
        node n2=new node(20);
        node n3=new node(30);
        node n4=new node(40);
        node n5=new node(50);
        node n6=new node(60);
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=null;
        dispaly(head);
        revers(head);


    }
}