public class reverasindoublelinkedlist {
static class node{
    int data;
    node prev;
    node next;
    node(int data){
        this.data=data;
        
    }
}
public static void dispaly(node head){
    node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}
public static void  reverasdispaly(node tail){
    node temp=tail;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.prev;
    }
    // System.out.print(temp.data);

}
    public static void main(String[] args) {
        node head=new node(1000);
        node n2=new node(200);
        node n3=new node(300);
        node n4=new node(400);
        node n5=new node(500);
        // node n2=new node(200);
        head.next=n2;
        head.prev=null;
        n2.next=n3;
        n2.prev=head;
        n3.prev=n2;
        n3.next=n4;
        n4.prev=n3;
        n4.next=n5;
        n5.prev=n4;
        n5.next=null;
        dispaly(head);
        System.out.println();
        reverasdispaly(n5);
        
    }
}