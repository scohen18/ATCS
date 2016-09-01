public class nodeDriver{
	public static void main(String [] args)
	{
		node<String> first;
		node<String> n = new node<String>("A");
		first = n;
		node<String> n2 = new node<String>("B");
		n.setNext(n2);
		n = new node<String>("C");
		n2.setNext(n);

		node<String> curr = first;
		while(true)
		{
			System.out.println(curr.getItem());
			curr = curr.getNext();
			if(curr == null)
				break;
		}
	}
}
