package co.yedam.generic;

import java.util.ArrayList;
import java.util.List;

public class LinkedListExe {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.add("" + i);
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList: " + (end - start) + "ms");

	}
}
