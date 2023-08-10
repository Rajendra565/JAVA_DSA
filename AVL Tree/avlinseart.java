

public class avlinseart {
    static class node{
        int data;
        node left;
        node right;
        int hight;

        node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
            this.hight=1;

        }
    }
    public static int hight(node n){
        if(n==null){
            return 0;

        }
        return n.hight;
    }
    public static int balfact(node n){
        if(n==null){
            return 0;
        }
        return  hight(n.left)-hight(n.right);
    }
    public static node rightroration(node x){
        node y=x.left;
        node yr=y.right;
        y.right=x;
        x.left=yr;
        x.hight=Math.max(hight(x.left), hight(x.right))+1;
        y.hight=Math.max(hight(y.left), hight(y.right))+1;
        return y;
    }
    public static node liftrarotion(node x){
        node y=x.right;
        node yl=y.left;
        y.left=x;
        x.right=yl;
        x.hight=Math.max(hight(x.left), hight(x.right))+1; 
        y.hight=Math.max(hight(y.left), hight(y.right))+1; 
        return y;
    }


    public static node inseartavl(node root,int val){
        if(root==null){
            node newnode=new node(val);
            return newnode;
        }
        else if(root.data>val){
            root.left=inseartavl(root.left,val);
        }
        else if(root.data<val){
            root.right=inseartavl(root.right, val);

        }
        root.hight=Math.max(hight(root.left), hight(root.right))+1;
        int balfact=balfact(root);
        // ll case
        if(balfact>1&&val<root.left.data){
            return rightroration(root);
        }
        // rr case
        if(balfact<-1&&val>root.right.data){
            return liftrarotion(root);
        }
        // lr case
        if(balfact>1&&val<root.right.data){
            node left=liftrarotion(root.left);
            return rightroration(root.right);
        }
        // rl case
        if(balfact<-1&&val>root.left.data){
            node right=rightroration(root.right);
            return liftrarotion(root.left);
        }
        return root;
    }
    public static void inorder(node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void main(String args[]){
        node root=null;
    //    root= inseartavl(root, 15);
    //    root= inseartavl(root, 10);
    //    root= inseartavl(root, 5);
    int arr[]={15,20,5};
    for(int i=0;i<arr.length;i++){
        root=inseartavl(root, arr[i]);
    }
        inorder(root);
    }
}
