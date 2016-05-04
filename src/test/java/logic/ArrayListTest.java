package logic;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListTest {
	public static void main(String[] args) {
		HashMap<Integer,ArrayList<String>> cache = new HashMap<Integer,ArrayList<String>>();

		ArrayList<String> list = new ArrayList<String>();
		list.add("123");
		list.add("3434");
		list.add("333");
		cache.put(123, list);
		cache.get(123).remove("123");
		ArrayList<String> newList = cache.get(123);
		for(String str:newList){
			System.out.println(str);
		}
		
	}
}
