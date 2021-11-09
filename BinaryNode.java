
public class BinaryNode<Anytype> {
	
	BinaryNode(AnyType theElement)//Constructor
	{
		element = theElement;
		left = right = null;
	}
	
	AnyType element; //The data in the node
	BinaryNode<Anytype> left; //Left child
	BinaryNode<Anytype> right;//Right child
	
}
