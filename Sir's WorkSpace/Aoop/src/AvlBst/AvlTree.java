package AvlBst;

public class AvlTree {
	private static Node root;
	public AvlTree()
	{
		root=null;
	}
	private int height(Node avlNode)
	{
		return avlNode == null ? -1 : avlNode.height;
	}
	private int max(int lHeight,int rHeight)
	{
		return lHeight >rHeight ? lHeight:rHeight;
	}
	public void insert(int data)
	{
		root=insert(data,root);
	}
	private Node insert(int data,Node avlNode)
	{
		if(avlNode == null)
			avlNode = new Node(data);
		else if(data < avlNode.key)
		avlNode.left=insert(data,avlNode.left);
		else if(data > avlNode.key)
		avlNode.right=insert(data,avlNode.right);
	return avlNode;
	}
//	public void inorder()
//	{
//		inorder(root);
//	}
	private static void inorder(Node avlNode)
	{
		if(avlNode!=null)
		{
			inorder(avlNode.left);
		System.out.println(avlNode.key);
		inorder(avlNode.right);
		}
	}
	public static void main(String[]args)
	{
		AvlTree st=new AvlTree();
		st.insert(5);
		st.insert(4);
		st.insert(3);
		st.inorder(root);
	}
}
