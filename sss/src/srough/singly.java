package srough;

public class singly {
	class Node{
		int data;
		Node next;
		public Node(int data) {
		this.data=data;
		this.next=null;
		}
		}
		int c=0;
		public Node head,tail=null;
		public void addNode(int data)
		{
		Node b=new Node(data);
		if(head==null)
		{
		head=tail=b;

		}
		else
		{
		tail.next=b;
		tail=b;
		}
		c++;

		}
		public void display() {
		Node current=head;
		if(head==null)
		{
		System.out.println("No elements");
		}
		else
		{
		System.out.println("the elements are :");
		while(current!=null)
		{
		System.out.print(current.data+" ");
		current=current.next;
		}
		System.out.println();
		}

		}
		public Node reverse(Node temp)
		{
		Node prev=null,nextNode=null;
		Node current=temp;
		while(current!=null)
		{
		nextNode=current.next;
		current.next=prev;
		prev=current;
		current=nextNode;
		}
		return(prev);
		}
		public void change() {
		int d=0;
		int n=(c%2==0)?c/2:(c/2)+1;
		Node current=head;
		for(int i=0;i<n;i++)
		{
		current=current.next;
		}
		Node revhead=reverse(current);
		Node temp=head,store2;
		while(d<n)
		{
		Node temp1=revhead;
		if(temp1!=null)
		{
		store2=temp1.next;
		temp1.next=temp.next;
		temp.next=temp1;
		//System.out.print(temp.data);
		temp=temp1.next;
		revhead=store2;
		
		//System.out.print()



		}
		d++;
		if(d==n)
		{
		temp.next=null;
		return;
		}

		}


		}
		public static void main(String[] args)
		{
		singly a=new singly();
		a.addNode(10);
		a.addNode(20);
		a.addNode(30);
		a.addNode(40);
		a.addNode(50);
		a.addNode(60);
		a.addNode(70);
		a.display();
		a.change();
		a.display();


		}

		}  		
