package com.io.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterApp {

	public static void main(String[] args) throws IOException {

		Writer f = new FileWriter("bufferedWriter.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(f);
		bufferedWriter.write("hello darkness my old friend");
		bufferedWriter.close();
		f.close();

	}
}
