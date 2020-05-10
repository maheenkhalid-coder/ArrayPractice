package com.test.project.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileOpearationImpl implements FileOperation {

	@Override
	public void writeData(String data, String fileName) {

		try {
			File file = new File("File.txt");
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter brw = new BufferedWriter(fileWriter);

			brw.write(data);
			brw.flush();
			brw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String readData(String fileName) {

		try {
			File file = new File("File.txt");

			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String data = scanner.nextLine();
				System.out.println(data);
			}
			scanner.close();

		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return fileName;
	}

}
