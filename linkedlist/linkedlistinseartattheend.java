

public class linkedlistinseartattheend {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;

        }
    }
    public static node  inseartattheend(int data,node head){
        node newnode=new node(data);
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
         temp.next=newnode;
        return head;
    }
    public static void dispaly(node head){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
       node head=new node(100);
       node n2=new node(200);
       node n3=new node(300);
       node n4=new node(400);
       node n5=new node(500);
       head.next=n2;
       n2.next=n3;
       n3.next=n4;
       n4.next=n5;
      head= inseartattheend(222222, head);
       dispaly(head);
    }
}
