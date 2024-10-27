package com.demo.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ruben", "Inamdar", "hdhdhd");

		List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(upperCaseNames);
	}
}