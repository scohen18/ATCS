import java.util.*;

public class BSTDriver{
	public static void main(String [] args)
	{
		Random r = new Random();
		BinarySearchTree<Integer, Integer> b= new BinarySearchTree<Integer, Integer>();


		for(int i = 0; i < 5000; i ++)
		{

			b.put(i,r.nextInt(1000));
		}


		System.out.println(b.get(8));

		System.out.println(b.toString());
	}
}
