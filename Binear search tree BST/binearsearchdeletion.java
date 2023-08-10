public class binearsearchdeletion {
static class  node{
    int data;
    node left;
    node right;
    node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public static node inseart(node root,int val){
    if(root==null){
    node newnode=new node(val);
    return newnode;
    }
    else if(root.data>val){
       root.left= inseart(root.left, val);
    }
    else if(root.data<val){
      root.right=inseart(root.right, val);
    }
    return root;
}
public static node deletion(node root,int val){
    if(root==null){
        return null;
    }
    else if(root.data>val){
       root.left= deletion(root.left, val);
    }
    else if(root.data<val){
        root.right=deletion(root.right, val);
    }
    else{
        if(root.left==null&&root.right==null){
            return null;
        }
        node is=inordersuccesser(root);
        root.data=is.data;
        root.right=deletion(root.right, root.data);
        
    }
    return  root;
}
public static node inordersuccesser(node root){
    root=root.right;
    while(root.left!=null){
        root=root.left;
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
    public static void main(String args[]){
        node root=null;
        int arr[]={50,2121,3,123,43,543,25,90,89,8,76,12 ,33};
        for(int i=0;i<arr.length;i++){
            root=inseart(root, arr[i]);
        }
        inorder(root);
    //    root= deletion(root, 50);
    //     System.out.println();
    //     inorder(root);

    }
}