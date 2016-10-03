
//add an key-value pair to the dictionary
import Java.util.*;
public class Map<E,T>{
	private int size;

	private ArrayList<E> keys = new ArrayList<E>();
	private ArrayList<T> values = new ArrayList<E>();

	public Map()
	{
		size = 0;
	}
	void put(E key, T value)
	{
		values.add(value);
		keys.add(keys);
		size ++;
	}

	//get the value associated with a given key
	T get(E key)
	{
		int index = 0;
		for(int i = 0; i < keys.size(); i ++)
		{
			if(key.equals(keys.get(i)))
			{
				index = i;
			}
		}
		return values.get(index);
	}

	//remove a key-value pair and return its value
	T remove(E key)
	{
		int index = 0;
		for(int i = 0; i < keys.size(); i ++)
		{
			if(key.equals(keys.get(i)))
			{
				index = i;
			}
		}
		size --;
		key.remove(index);
		return values.remove(index);

	}

	//returns true if the given key has an associated value
	boolean contains(E key)
	{
		boolean containsThing = false;
		for(int i = 0; i < keys.size(); i ++)
		{
			if(key.equals(keys.get(i)))
			{
				containsThing = true;
			}
		}
		return containsThing;
	}

	//returns true if the dictionary is empty
	boolean isEmpty()
	{
		return size==0;
	}

	//returns the number of key-value pairs in the dictionary
	int size()
	{
		return size;
	}

	//returns a Collection¹ of key-value pairs
	Collection<E> keys()
	{
		return keys;
	}
	Collection<E> values()
	{
		return values;
	}
}
