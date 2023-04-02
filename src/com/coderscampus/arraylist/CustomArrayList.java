package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T>{

	int size = 0;
	Object[] items = new Object[10];
	
	@Override
	public boolean add(T item) {
		
		if (size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
		
		items[size] = item;
		size++;
		return true;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		
		if(index > size || index < 0) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
		}
		if (size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
 
		for (int i = size; i > index; i--) {
			
			items[i] = items[i-1];
			
		}
		
		items[index] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if(index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
		}
		return (T) items[index];
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if(index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
		}
		T indexItem = (T) items[index];
		
		for(int i = index; i < size - 1 ; i++) {
			items[i] = items[i + 1];
		}
		
		items[size - 1] = null;
		size--;
		
		return indexItem;
	}

}
