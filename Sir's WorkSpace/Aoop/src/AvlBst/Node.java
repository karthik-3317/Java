package AvlBst;

public class Node {
	
	Node left,right;
	int key,height;
	public Node()
	{
		left = right =null;
		key =0;
		height=0;
	}
	public Node(int n)
	{
		left=right=null;
		key=n;
		height=0;
	}
}
