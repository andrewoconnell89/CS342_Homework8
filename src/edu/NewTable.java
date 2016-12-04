package edu;

import java.util.LinkedList;
import java.util.Vector;

class HashPair<K, E>{
	K key;
	E element;
}

public class NewTable<K, E> {


	private Vector< LinkedList<HashPair<K,E>>> table;
	
	public NewTable(){
		//TODO
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
		return element; //TODO
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
		return key.hashCode();
	}
	
	public int size(){
		return -1; //TODO
	}
	
	public static void main(String[] args){
		
	}
}
