
public class linkedlistinseartatthe1st {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static  node inseartatthebiginning(node head,int data){
        node newnode=new node(data);
        node temp=head;
        while(temp!=null){
            temp=temp.next;
        }
        newnode.next=head;
        head=newnode;
         return head;
    }
    public static void dispaly(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        node head=new node(1000);
        node n2=new node(2000);
        node n3=new node(3000);
        node n4=new node(4000);
        node n5=new node(5000);
        node n6=new node(6000);
        node n7=new node(7000);
        node n8=new node(8000);
        node n9=new node(9000);
        node n10=new node(10000);
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;
        n8.next=n9;
        n9.next=n10;
       head= inseartatthebiginning(head,11111111);
        dispaly(head);

        

    }
    
}
