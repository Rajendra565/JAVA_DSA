

public class linkedlistdelete {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node  deleteatthebigining(node head){
        node temp=head;
        while(temp!=null){
            temp=temp.next;
        }
        // head=head.next;

        return head.next;
    }
    public static void deleteattheend(node head){
        node temp=head;
        while(temp.next.next!=null){
             temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    public static void deleteatthepostion(node head,int pos){
        node temp=head;
        for(int i=0;i<pos-1;i++){
           temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    public static void dispaly(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
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
        dispaly(head);
    //    head= deleteatthebigining(head);
    // deleteattheend(head);
    deleteatthepostion(head, 3);
        dispaly(head);
    }
}
