package com.test.project.main;
import java.io.IOException;
import java.util.Scanner;

public class WriteReadOperation {

	public static void main(String[] args) throws IOException {

		boolean isExit = false;

		do {
			System.out.println(
					"Please choose your category:\nPress 1\t For write something.\nPress 2\t For see the data.\nPress 3\t For Quit!");

			Scanner scanner = new Scanner(System.in);
			int code = scanner.nextInt();
			switch (code) {

			case 1:

				FileOpearationImpl fileOpearationImpl = new FileOpearationImpl();
				System.out.println("write your content please: ");
				System.out.println("\n");
				Scanner data = new Scanner(System.in);
				String value = data.nextLine();
				fileOpearationImpl.writeData(value, "File");
				System.out.println("\n");
				break;

			case 2:

				FileOpearationImpl fileOpearationImpl2 = new FileOpearationImpl();
				System.out.println("Your content is here: ");
				System.out.println("\n");
				fileOpearationImpl2.readData("File");
				System.out.println("\n");

				break;

			case 3:

				isExit = true;
				break;

			default:
			}

		} while (!isExit);

	}

}
