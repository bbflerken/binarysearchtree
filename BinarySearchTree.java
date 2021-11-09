
public class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {
	
	protected BinaryNode<AnyType> root; //The tree root.
	
	public BinarySearchTree()//Construct the tree.
	{ root = null;}
	
	public void insert(AnyType x)//Insert into the tree; duplicates are ignored.
	{root = insert(x, root);}
	
	public void remove(AnyType x)//Remove from the tree. Nothing is done if x is not found.
	{root = remove(x, root);}
	
	public void removeMin()
	{root = removeMin(root);}

	public AnyType findMin() //Find the smallest item in the tree.
	{return elementAt(fidnMin(root));}
	
	public AnyType findMax()//Find the largest item in the tree.
	{return elementAt (findMax(root));}
	
	public AnyType find(AnyType x)//Find an item in the tree.
	{return elementAt(find(x, root));}
	
	public void makeEmpty()//Make the tree logically empty.
	{root = null;}
	
	public boolean isEmpty()//Test if the tree is logically empty.
	{return root == null;}
	
	private AnyType elementAt(BinaryNode<AnyType> t)
	{ return t == null ? null :t.element; }
	
	private BinaryNode<AnyType> find(AnyType x, BinaryNode<AnyType> t)
	{
		while(t != null)
		{
			if(x.compareTo(t.element) < 0)
				t = t.left;
			else if (x.compareTo(t.element) > 0)
				t = t.right;
			else
				return t;
		}
		
		return null;
	}
	
	private BinaryNode<AnyType> findMin(BinaryNode<AnyType> t)//Internal method to find the smallest item in a subtree.
	{
		if(t!=null)
			while(t.left != null)
				t =t.left;	
		return t;
	}
	
	private BinaryNode<AnyType> findMax(BinaryNode<AnyType> t)//Internal method to find the largest item in a subtree.
	{
		if(t!= null)
			while(t.right != null)
				t=t.right;	
		return t;
	}
	
	private BinaryNode<AnyType> insert(AnyType x, BinaryNode<AnyType> t)//Internal method to insert into a subtree.
	{
		if(t==null)
			t = new BinaryNode<AnyType>(x);
		else if(x.compareTo(t.element) < 0)
			t.left=insert(x,t.left);
		else if(x.compareTo(t.element)>0)
			t.right = insert(x, t.right);
		else
			throw new DuplicateItemException(x.toString() );
		return t;
	}
	
	private BinaryNode <AnyType> removeMin(BinaryNode<AnyType> t)
	{
		if(t == null)
			throw new ItemNotFoundException();
		else if(t.left != null)
		{
			t.left = removeMin(t.left);
			return t;
		}
		else
			return t.right;
	}
	
	private BinaryNode <AnyType> remove(AnyType x, BinaryNode<AnyType> t)//Internal method to remove from a subtree.
	{
		if(t == null)
			throw new ItemNotFoundException();
		if(x.compareTo(t.element)< 0)
			t.left = remove(x, t.left);
		else if(x.compareTo(t.element)> 0)
			t.right = remove(x, t.right);
		else if(t.left != null && t.right != null)
		{
			t.element = findMin(t.right).element;
			t.right = removeMin(t.right);
		}
		else
			t=(t.left != null) ? t.left : t.right;
		return t;
	}
	 public void print()//To print Tree
	 {
		 
	 }
}
	
