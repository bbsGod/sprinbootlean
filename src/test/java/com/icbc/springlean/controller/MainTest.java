package com.icbc.springlean.controller;

public class MainTest {
	
	//正则不包含
	public static void main(String[] args) {
		String xx= "sfdsf.txt";
	//	String regex ="(.*)\\.txt";
		//String regex ="^((?!/).)*\\.txt";//^((?!@).)*$
		String regex ="/[/]/gi\\.txt";
		boolean matches = xx.matches(regex);
		System.out.println(matches);
	}

}
