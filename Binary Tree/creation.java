import java.util.Scanner;

public class creation {
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
public static node creart(){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter data");
   int data=sc.nextInt();
   node newnode=new node(data);
   node root;
   if(data==-1){
    return null;
   }

   root=newnode;
   System.out.println("enter  "+root.data+" left node");
   root.left=creart();
   System.out.println("enter  "+root.data+" right node");
   root.right=creart();

   return root;
    
}
public static void inorder(node root){
    if(root!=null){
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);

    }

}
    public static void main(String args[]){
        node root=null;
       root= creart();
        inorder(root);
    }
}