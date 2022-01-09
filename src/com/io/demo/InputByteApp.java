package com.io.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputByteApp {
	public static void main(String[] args) {

		try {

			InputStreamReader input2 = new InputStreamReader(new FileInputStream("example.txt"));
			Scanner scanner = new Scanner(input2);
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		try (InputStreamReader input = new InputStreamReader(new FileInputStream("example.txt"))) {

			// Reads characters from the file
			int data = input.read();

			while (data != -1) {
				System.out.println(String.format("%s: %s", ((char) data), data));
				data = input.read();
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

	} // _____
}
