package rough;
import java.util.*;
public class Main {
	public static Node root;
	static class Node{
	int data;
	Node left,right;
	public Node(int data)
	{
	this.data=data;
	this.left=null;
	this.right=null;
	}
	}

	public void preorder(Node root) {

	if(root==null)
	return;
	System.out.print(root.data+" ");
	preorder(root.left);
	preorder(root.right);

	}

	public static void main(String[] args) {
	        Main tree = new Main();
	        root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.left.right = new Node(5);
	        System.out.println("Preorder traversal of binary tree is ");
	        tree.preorder(root);
	 
	        //System.out.println("\nInorder traversal of binary tree is ");
	        //tree.Inorder(b);
	 
	        //System.out.printlnhttps://www.onlinegdb.com/online_java_compiler#tab-stdin("\nPostorder traversal of binary tree is ");
	        //tree.Postorder();

	}

	}