package com.bridgelabz.essentials;

public class Queue<T> {

	LinkedList<T> LinkedList;
	
	/**
	 * Constructor
	 * initializes linked list 
	 */
	public Queue(){
		LinkedList = new LinkedList<T>();
	}
	
	/**
	 * @param data - element to be enqueued
	 * adds element a the end of the list
	 */
	public void enqueue(T data){
		LinkedList.add(data);
	}
	
	/**
	 * removes top element in the list
	 * @returns removed element
	 */
	public T dequeue(){
		return LinkedList.pop(0);
	}
	
	/**
	 * @returns true if list is empty else returns false
	 */
	public boolean isEmpty(){
		return LinkedList.isEmpty();
	}
	
	/**
	 * @returns size of the list
	 */
	public int size(){
		return LinkedList.size();
	}
	
}
