import java.util.LinkedList;
import java.util.Queue;

public class levelordertraversel {
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
    public static node inseart(node root,int data){
        if(root==null){
           node newnode=new node(data);
             return newnode;
        }
        else if(root.data>data){
            root.left=inseart(root.left, data);
        }
        else if(root.data<data){
            root.right=inseart(root.right, data);
        }

        return root;
    }
    public static void levelorder(node root){
        Queue <node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            node cur=q.poll();
            System.out.println(cur.data);
            if(cur.left!=null){
                q.add(cur.left);
            }
            if(cur.right!=null){
                q.add(cur.right);
            }

        }
    }
    public static void main(String args[]){
        node root=null;
        root=inseart(root, 40);
        root=inseart(root, 30);
        root=inseart(root, 50);
        root=inseart(root, 25);
        root=inseart(root, 35);
        root=inseart(root, 45);
        root=inseart(root, 60);
        
        levelorder(root);

    }
}
