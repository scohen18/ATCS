public class dAPI{
	void put(E key, T value)

	//get the value associated with a given key
	T get(E key)

	//remove a key-value pair and return its value
	T remove(E key)

	//returns true if the given key has an associated value
	boolean contains(E key)

	//returns true if the dictionary is empty
	boolean isEmpty()

	//returns the number of key-value pairs in the dictionary
	int size()

	//returns a Collection¹ of key-value pairs
	Collection<E> keys()

	//returns a Collection of values
	Collection<T>  values()
}
