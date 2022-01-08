package com.io.demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// File
		File f = new File("example.txt");
		f.getName();
		f.getPath();
		f.getAbsolutePath();
		f.exists();
		f.getParent();

		if (f.exists()) {
			f.canWrite();
			f.canRead();
			f.isDirectory();
			f.length();
		}

		// test file writer
		if (!f.exists()) {

			// create example.txt
			FileWriter fw = null;
			try {
				fw = new FileWriter(f);
				fw.write("Hello there");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {

				if (fw != null)
					try {
						fw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			}
		}

		// test file reader with scanner
		Scanner scanner = null;

		try {
			scanner = new Scanner(new FileReader("example.txt"));
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}

	}

}
