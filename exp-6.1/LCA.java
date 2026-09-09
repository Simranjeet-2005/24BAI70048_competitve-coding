import java.util.*;
public class LCA {
    static class TreeNode {
        int val;
        TreeNode left, right;
       TreeNode(int val) {
            this.val = val;
            left=right=null;
        }
    }
        static TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root.val == p.val || root.val == q.val)
            return root;
        TreeNode left = LCA(root.left, p, q);
        TreeNode right = LCA(root.right, p, q);
        if(left!=null && right!=null)
            return root;
        return left != null ? left : right;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter root: ");
        int x = sc.nextInt();
        TreeNode root = new TreeNode(x);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            System.out.print("Enter left child of " + curr.val);
            int left = sc.nextInt();
            if (left != -1) {
                curr.left = new TreeNode(left);
                q.add(curr.left);
            }
            System.out.print("Enter right child of " + curr.val);
            int right = sc.nextInt();
            if (right != -1) {
                curr.right = new TreeNode(right);
                q.add(curr.right);
            }
        }
        System.out.print("Enter p: ");
        int pValue = sc.nextInt();
        System.out.print("Enter q: ");
        int qValue = sc.nextInt();
        TreeNode p = new TreeNode(pValue);
        TreeNode qNode = new TreeNode(qValue);
        TreeNode ans = LCA(root, p, qNode);
        System.out.println("LCA = " + ans.val);
        sc.close();
    }
}