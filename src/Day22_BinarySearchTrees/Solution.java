package Day22_BinarySearchTrees;

import java.util.Scanner;

public class Solution {
	public static int getHeight(Node root){
		int heightLeft = 0;
		int heightRight =0;
		if(root!=null) {
			if(root.left!=null) {
				heightLeft++;
				heightLeft = heightLeft +  getHeight(root.left);
			}
			if(root.right!=null) {
				heightRight++;
				heightRight = heightRight +  getHeight(root.right);
			}
		}
		return (heightLeft>heightRight?heightLeft:heightRight);
	}
	
	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
