package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	//Test Driven Development
	//Step 1- Write a failing test
	//Step 2- Write the logic to make it pass
	//Step 3- Refactor your code
	//Arrange, Act, Assert
	
	
	@Test
	void should_add_item_at_index() {
		//Arrange
		CustomList<Integer> numberList = new CustomArrayList<>();
		///Act
		for(int i = 0; i <= 10; i++) {
			numberList.add(i);
		}
		
		numberList.add(1, 15);
		//Assert
		assertEquals(0, numberList.get(0));
		assertEquals(1, numberList.get(2));
		assertEquals(15, numberList.get(1));
		
	}
	
	@Test
	void should_remove_item() {
		//Arrange
		CustomList<Integer> numberList = new CustomArrayList<>();
		//Act
		for(int i = 0; i <=  10; i++) {
			numberList.add(i);
		}
		// 0 = 0; 1 = 1; 2 = 2; 3= 3; 4 = 4;
		Integer numberRemoved = numberList.remove(3);
		
		
		//Assert
		assertEquals(3, numberRemoved);
		assertEquals(5, numberList.get(4));
		assertEquals(10, numberList.getSize());
		
		
	}
	
	@Test
	void should_get_item() {
		//Arrange
		CustomList<Integer> numberList = new CustomArrayList<>();
		//Act
		for(int i = 0; i <=  10; i++) {
			numberList.add(i);
		}
		//Assert
		assertEquals(2, numberList.get(2));
		assertEquals(5, numberList.get(5));
		assertEquals(10, numberList.get(10));
	}
	
	@Test
	void should_throw_index_out_of_bounds_on_add() {
		//Arrange
		CustomList<Integer> numberList = new CustomArrayList<>();
		//Act
		for(int i = 0; i <=  10; i++) {
			numberList.add(i);
		}
		
		Exception e = Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			numberList.add(15, 11);
		});
		
		//Assert
		String msg = e.getMessage();
		assertEquals("Index 15 is out of bounds!", msg);
	}
	
	@Test
	void should_throw_index_out_of_bounds_on_remove() {
		//Arrange
		CustomList<Integer> numberList = new CustomArrayList<>();
		//Act
		for(int i = 0; i <= 10; i++) {
			numberList.add(i);
		}
		
		Exception e = Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			numberList.remove(11);
		});
		
		//Assert
		String msg = e.getMessage();
		assertEquals("Index 11 is out of bounds!", msg);
	}
	
	@Test
	void should_throw_index_out_of_bounds_on_get() {
		//Arrange
		CustomList<Integer> numberList = new CustomArrayList<>();
		//Act
		for(int i = 0; i <= 10; i++) {
			numberList.add(i);
		}
				
		Exception e = Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			numberList.get(12);
		});
		
		//Assert
		String msg = e.getMessage();
		assertEquals("Index 12 is out of bounds!", msg);
	}

}
