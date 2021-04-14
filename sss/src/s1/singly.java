package s1;
import java.util.*;
public class singly {
	class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public Node head=null;
	public Node tail=null;
	public void addNode(int data)
	{
		Node b=new Node(data);
		if(head==null)
		{
			head=b;
			tail=b;
			
		}
		else 
		{
			tail.next=b;
			tail=b;
		}
		
	}
	//public Node current=head;
	public void reversedisplay(Node current){
	
		if(head==null)
		{
			System.out.print("no elements in this list");
		}
		else 
		{
			//System.out.println("the elements are");
			if(current.next==null)
			{
				System.out.print(current.data+" ");
				return;
			//current=current.next;
			}
			reversedisplay(current.next);
			System.out.print(current.data+" ");
			
			
		}
	}
	public static void main(String[] args)
	{
		singly a=new singly();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a.addNode(sc.nextInt());
		}
		System.out.println("reversed list");
		a.reversedisplay(a.head);
		
	}

}
