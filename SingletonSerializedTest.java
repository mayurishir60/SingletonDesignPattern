package com.singlteon.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonSerializedTest implements Serializable {

	public static void main(String[] args) {

		try {
			Singleton instance1 = Singleton.getSingletonObject();
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("D:\\test.txt"));
			out.writeObject(instance1);
			out.close();

			ObjectInput in = new ObjectInputStream(new FileInputStream("D:\\test.txt"));
			Singleton instance2 = (Singleton) in.readObject();
			in.close();

			System.out.println("instance 1>>" + instance1.hashCode());
			System.out.println("instance 2>>" + instance2.hashCode());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
/*
 * output instance 1>>1442407170 instance 2>>1442407170
 */
