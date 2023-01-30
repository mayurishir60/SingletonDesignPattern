package com.singlteon.test;

public class SingletonTest {

	private static SingletonTest s;

	private static SingletonTest test() {

		s = new SingletonTest();
		return s;
	}

	public static void main(String args[]) {

		System.out.println("one instance=" + SingletonTest.s.test().hashCode());
		System.out.println("two instance=" + SingletonTest.s.test().hashCode());
		System.out.println("three instance=" + SingletonTest.s.test().hashCode());
	}
}
/*
 * output one instance=2018699554 two instance=1311053135 three
 * instance=118352462
 */