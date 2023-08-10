

public class countnodeintree {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    public static int count(node root){
        int x,y;
        if(root==null){
            return 0;
        }
        x=count(root.left);
        y=count(root.right);
        return  x+y+1;

    }
    public static void main(String args[]){
        node root = new node(100);
        node n2 = new node(200);
        node n3 = new node(300);
        node n4 = new node(400);
        node n5 = new node(500);
        node n6 = new node(600);
        node n7 = new node(700);
        node n8 = new node(800);
        node n9 = new node(900);
        root.left = n2;
        root.right = n3;
        n2.left = n4;
        n4.left = n8;
        n2.right = n5;
        n5.left = n9;
        n3.left = n6;
        n3.right = n7;
        System.out.println(count(root));
    }
}
