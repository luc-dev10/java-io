package com.io.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedReaderApp {

	public static void main(String[] args) throws IOException {

		// get file
		BufferedReader in = new BufferedReader(new FileReader("example.txt"));
		try (Scanner scanner = new Scanner(in)) {
			while (scanner.hasNext())
				System.out.println(scanner.nextLine());
		}
		in.close();

	}

}
