import java.util.*;
public class inorder_brute {
    static class TreeNode {
        int val;
        TreeNode left,right;
        TreeNode(int val){
            this.val = val;
        }
    }
    static void inorder(TreeNode root, List<TreeNode> list){
        if(root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root);
        inorder(root.right, list);
    }
    static TreeNode successor(TreeNode root, TreeNode p){
        List<TreeNode> list=new ArrayList<>();
        inorder(root, list);
               for(int i = 0; i < list.size(); i++){
            if(list.get(i) == p){
                if(i + 1 < list.size()){
                    return list.get(i + 1);
                }
                return null;
            }
        }
        return null;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
       int n=sc.nextInt();
        TreeNode[] nodes=new TreeNode[n];
            for(int i = 0; i < n; i++){
            nodes[i] = new TreeNode(i);
        }
        System.out.println("Enter left and right child for each node.");
        System.out.println("Enter -1 if there is no child.");
        for(int i = 0; i < n; i++){
            System.out.print("Node " + i + " left child: ");
            int left = sc.nextInt();
            if(left != -1){
                nodes[i].left = nodes[left];
            }
            System.out.print("Node " + i + " right child: ");
            int right = sc.nextInt();
            if (right != -1){
                nodes[i].right = nodes[right];
            }
        }
        System.out.print("Enter p: ");
        int p=sc.nextInt();
        TreeNode result=successor(nodes[0], nodes[p]);
        if (result!=null){
            System.out.println("In-order successor of "+p+" is " + result.val);
        } else {
            System.out.println("In-order successor of "+p+" is null");
        }

        sc.close();
    }
}