public class binearsearchinseart {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }static node root=null;
    public static void inseart(int val){
       root= inseart(root, val);
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
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int val[]={12,1,3,11,33,44,23,123,5,10,9,8,56,54};
        for(int i=0;i<val.length;i++){
            inseart(val[i]);
        }
        inorder(root);
    }
}
