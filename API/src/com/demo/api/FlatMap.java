package com.demo.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	public static void main(String[] args) {
		List<List<String>> namesList = Arrays.asList(Arrays.asList("Ayub", "Bob"), Arrays.asList("Chandan", "David"),
				Arrays.asList("elvish"));

		List<String> allNames = namesList.stream().flatMap(List::stream).collect(Collectors.toList());

		System.out.println(allNames);
	}
}