package com.io.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		person.setAge(1);
		person.setName("Lucio");

		try {
			FileOutputStream fileOut = new FileOutputStream("person.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(person);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in /tmp/employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}

		Person e = null;
		try {
			FileInputStream fileIn = new FileInputStream("person.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Person) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}

		System.out.println("Deserialized Employee...");
		System.out.println("Name: " + e.getAge());
		System.out.println("Address: " + e.getName());

	}

}
