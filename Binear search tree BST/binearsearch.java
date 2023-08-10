public class binearsearch {
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
static node root=null;
public static void inseart(int val){
    root=inseart(root, val);
}
public static node inseart(node root,int val){
    if(root==null){
         root=new node(val);
        return root;
    }
    if(root.data>val){
        root.left=inseart(root.left, val);

    }
    else if(root.data<val){
        root.right=inseart(root.right, val);
    }
       return root; 
}
public static void inorder(node root){
    if(root==null){
        return ;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
}
public static void search(int val){
    search(root, val);
}
public static boolean search(node root,int val){
    if(root==null){
        return false;
    }
    if(root.data==val){
        return true;
    }
    if(root.data>val){
        return search(root.left, val);
    }
    else{
        return search(root.right, val);
    }
    
    
}
public  static int count(node root){
    int x,y;
    if(root==null){
        return 0;
    }
    x=count(root.left);
    y=count(root.right);
    return x+y+1;
}
    public static void main(String args[]){
      inseart(12);
      inseart(32);
      inseart(43);
      inseart(11);
      inseart(25);
      inseart(23);
      inseart(4);  
      inseart(34);
      inseart(65);
      inseart(54);
      inseart(2);
      inorder(root);
      System.out.println(search(root,2) );
     
        System.out.println(count(root));
    }
}