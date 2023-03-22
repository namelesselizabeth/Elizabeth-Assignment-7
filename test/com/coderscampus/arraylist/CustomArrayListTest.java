package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

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
		numberList.remove(3);
		
		
		//Assert
		assertEquals(4, numberList.get(3));
		assertEquals(5, numberList.get(4));
		assertEquals(10, numberList.getSize());
		
		
	}

}
