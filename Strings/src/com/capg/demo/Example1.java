package com.capg.demo;

import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		String[] list = {"abc","xy","aaaa","d"};
		Arrays.sort(list,(x,y)->Integer.compare(x.length(),y.length()));
		System.out.println(Arrays.deepToString(list));

	}

}
