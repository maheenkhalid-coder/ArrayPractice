package com.test.project.main;

public interface FileOperation {

	/**
	 * Write data in the file
	 * 
	 * @param data     to be saved in the file
	 * @param fileName of the file.
	 */
	public void writeData(final String data, final String fileName);

	public String readData(final String fileName);

}
