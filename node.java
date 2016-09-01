public class node<E>{

	private E item;
	private node next;

	public node(E item, node next){
		this.item = item;
		this.next = next;
	}
	public node(E item){
		this.item = item;
		this.next = null;
	}

	public void setItem(E input)
	{
		this.item = input;
	}
	public void setNext(node input)
	{
		this.next = input;
	}
	public node getNext()
	{
		return this.next;
	}
	public E getItem()
	{
		return this.item;
	}
}
