package edu;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

class HashPair<K, E>{
	K key;
	E element;
}

public class NewTable<K, E> {


	private Vector< LinkedList<HashPair<K,E>>> table;
	private int size;
	
	public NewTable(){
		size = 5;
		table = new Vector<>(size);
		
		// Populate the Vector full of linked lists
		for(int i = 0; i< table.capacity(); i++){
			LinkedList<HashPair<K,E>> tmp = new LinkedList<HashPair<K,E>>();
			table.add(tmp);
		}
	}
	
	/**
	 * Add a new element to this table using the specified key.
	 * @param key - the non-null key to use for the new element
	 * @param element the new element that's being added to this table
	 * 
	 * @Precondition
	 * If there is not already an element with the specified key, then 
	 * this table's size must be less than its capacity (ie. size() < capacity( )).  
	 * Also, neither key nor element may be numm
	 * 
	 * @Postcondition
	 * If this table already has an object with the specified key, then that 
	 * object is replaced by element, and the return value is a reference 
	 * to the replaced object.  Otherwise, the new element is added with 
	 * the specified key, and the return value is null.
	 * 
	 * @return
	 * Element E
	 * 
	 * @throws IllegalStateException - Indicates that there is no room for a new object in this table
	 * @throws NullPointerException - Indicates that key is null.
	 */
	public E put(K key, E element){
		if (key == null || element == null){
			throw new NullPointerException("Key or element is null");
		}
		
		// Set up a ListIteratory that can step through the one linked list that might
		// already have an element with the given key
		int i = hash(key);
		LinkedList<HashPair<K,E>> oneList = table.get(i);
		ListIterator< HashPair<K,E>> cursor = oneList.listIterator(0);
		
		// Two other variables for the new HashPair (if needed) and the return value:
		HashPair<K,E> pair;
		E answer;
		
		// Step through the one linked list using the iterator (see page 287):
		while (cursor.hasNext()){
			pair = cursor.next();
			if (pair.key.equals(key)){
				answer = pair.element;
				pair.element = element;
				return answer;
			}
		}
		
		// The specified key was not on oneList, so create a new node for the new entry:
		pair = new HashPair<K,E>();
		pair.key = key;
		pair.element = element;
		oneList.add(pair);
		return null;
	}
	
	
	/**
	 * Determine whether a specified key is in this table
	 * 
	 * @param key - the non-null key to look for
	 * 
	 * @Precondition Key cannot be null.
	 * 
	 * @return
	 * 	True (if this table contains an object with the specified key);
	 * 	false otherwise.
	 * Note that key.equals() is used to compare the key to the keys that are in the table
	 * 
	 * @throws NullPointer Exception - Indicates that key is null
	 * @param key
	 * @return
	 */
	public boolean containsKey(K key){
		return true; //TODO
	}
	
	/**
	 * Retrieve an object for a specified key.
	 * 
	 * @param key - the non-null key to look for
	 * 
	 * @Precondition key cannot be null
	 * 
	 * @return A reference to the object with the specified key ( if this table contains such
	 * an object); null otherwise.  Note that key.equals() is usedto compare the key to the 
	 * keys that are in the table
	 * 
	 * @throws NullPointerException - Indicates that key is null.
	 */
	public E get(K key){
		E ele = null;
		return ele; //TODO
	}
	
	
	/**
	 * Remove an object for a specified key.
	 * 
	 * @param key - the non-null key to look for
	 * @Precondition key cannot be null.
	 * @Postcondition If an object was found with the specified key, then that object has been
	 * removed and a copy of the removed object is returned: otherwise, this
	 * table is unchanged and the null reference is returned.  Note that 
	 * key.equals() is used to compare the key to the key that are in this table.
	 * 
	 * @throws NullPointerException - Indicates that key is null.
	 * @param key
	 * @return
	 */
	public E remove(K key){
		E ele = null;
		return ele; //TODO
	}
	
	public void clear(){
		//TODO
	}
	
	public int hash(K key){
		//TODO
		return key.hashCode() % this.size;
	}
	
	public int size(){
		return -1; //TODO
	}
	
	public void print(){
		for(int i=0; i<table.capacity();i++){
			System.out.println("Table: "+i+table.get(i));
		}
	}
	
	public static void main(String[] args){
		NewTable<String,Integer> nt = new NewTable<String,Integer>();
		nt.put("Andy", 27);
		nt.put("Kristin", 28);
		nt.put("Bob", 30);
		nt.put("Kelly", 43);
		nt.put("Mark", 38);
		nt.put("Joe", 73);
		
		nt.print();
	}
}
