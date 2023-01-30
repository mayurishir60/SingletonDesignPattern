package com.singlteon.test;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {

	private static Singleton singletonobject;

	private Singleton() {

	}

	public static Singleton getSingletonObject() {

		synchronized (Singleton.class) {

			if (singletonobject == null) {
				singletonobject = new Singleton();
			} else {
				return singletonobject;
			}

			return singletonobject;

		}
	}

	protected Object readResolve() {
		return singletonobject;
	}

	/*
	 * public static void main(String[] args) throws CloneNotSupportedException {
	 * 
	 * Singleton object1 = Singleton.getSingletonObject(); Singleton object2 =
	 * (Singleton) object1.clone();
	 * 
	 * System.out.println("Object1>>" + object1.hashCode());
	 * System.out.println("Object2>>" + object2.hashCode());
	 * 
	 * }
	 */
}

/*
 * output Object1>>2018699554 Object2>>1311053135
 */