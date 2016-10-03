public class BSTDriver{
	public static void main(String [] args)
	{
		BinarySearchTree<Integer, String> b= new BinarySearchTree<Integer, String>();

		b.put(8,"eight");
		b.put(10,"ten");
		b.put(4,"four");

		System.out.println(b.get(8));
	}
}
