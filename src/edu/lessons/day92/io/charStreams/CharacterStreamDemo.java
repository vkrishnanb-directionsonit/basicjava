package edu.lessons.day92.io.charStreams;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class CharacterStreamDemo {

	public static void main(String[] args) {

	}

	public static void usingInputStreamReader() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter Data");
		String source = scanner.nextLine();
		try {
			// Encodes this String into a sequence of bytes 
			byte buf[] = source.getBytes();
			System.out.println("Length " + buf.length);
		} finally {
			scanner.close();
		}
	}

	public static void usingOutputStreamReader() {

	}
}
