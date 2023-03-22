package com.coderscampus.arraylist;

public class CustomApplication {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();
		
		for (int i = 0; i <= 10; i++) {
			myCustomList.add("element " + i);
		}
		
		for(int i = 0; i < myCustomList.getSize(); i++) {
			System.out.print(myCustomList.get(i) + " ");
		}
		
		System.out.println("\n-----------------------------------------------");
		myCustomList.add(3, "bump the rest");
		myCustomList.add(1, "bump again here");
		
		for(int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
		
		System.out.println(myCustomList.get(20));
	}

}
