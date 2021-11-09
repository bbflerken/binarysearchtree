
import java.util.Scanner;

public class Driver {
	
    public static void main( String [ ] args )
    {
        BinarySearchTree<Integer> t = new BinarySearchTree<Integer>( );
        Scanner in = new Scanner(System.in);
        
        while(true)
        {
        	System.out.println("===================================================");
        	System.out.println("1.Insert 2.Remove 3.RemoveMin 4.FindMin 5.FindMax\n6.Find 7.MakeEmpty 8.IsEmpty 9.Print 0.Quit");
        	System.out.println("===================================================");
        	System.out.print("Select an option: ");
        	int choice = in.nextInt();
        	
        	switch(choice)
        	{
        	case 1://Insert
        		System.out.print("Enter a new value to insert: ");
        		t.insert(in.nextInt());
        		break;
        	case 2://Remove
        		System.out.print("Enter a value to remove: ");
        		t.remove(in.nextInt());
        		break;
        	case 3://RemoveMin
        		t.removeMin();
        		break;
        	case 4://FindMin
        		System.out.println("Minimum is: " + t.findMin());
	    		break;
        	case 5://FindMax
        		System.out.println("Minimum is: " + t.findMax());
				break;
        	case 6://Find
        		System.out.println("Enter a value to find: ");
        		if(t.find(in.nextInt())==null)
        			System.out.println("Value is not present in Tree!");
        		else
        			System.out.println("Value is present!");
        		break;
        	case 7://MakeEmpty
        		t.makeEmpty();
        		break;
        	case 8://IsEmpty
        		if(t.isEmpty())
        			System.out.println("Tree is currently empty!");
        		else
        			System.out.println("Tree is NOT empty!");
	    		break;
        	case 9://Print
        		t.print();
				break;
        	case 0:
        		break;
        	default:
        		System.out.println("Wrong entry!");
				break;
        	}
        }
        
    }
}