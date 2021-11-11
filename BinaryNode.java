
public class BinaryNode<AnyType> {
	
	BinaryNode(AnyType theElement)//Constructor
	{
		element = theElement;
		left = right = null;
	}
	
	AnyType element; //The data in the node
	BinaryNode<AnyType> left; //Left child
	BinaryNode<AnyType> right;//Right child
	
}
