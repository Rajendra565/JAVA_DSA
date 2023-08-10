import java.util.Scanner;

public class treeuserinput {
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
    public static node creartnode(){
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        node newnode=new node(data);
        node root;
        if(data==-1){
            return null;

        }
        root=newnode;
        System.out.println("Enter the "+data+" left node");
        root.left=creartnode();
        System.out.println("Enter the "+data+" right node");
        root.right=creartnode();
        return root;

        
    }
    public static void preorder(node root){
        if(root==null){
            return ;
        }
        
    }
    public static void main(String[] args) {
        
    }
}
