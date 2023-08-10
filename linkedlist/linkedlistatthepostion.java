
public class linkedlistatthepostion {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node inseartatthepostion(node head,int data,int pos){
        node newnode=new node(data);
        node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        return head;
    }
    public static void dispaly(node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        } 
        System.out.println();
    }
    
    public static void main(String args[]){
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
      head= inseartatthepostion(head, 1212121, 4);
      dispaly(head);

    }
}
