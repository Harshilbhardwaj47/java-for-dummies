package DAY6;

import java.io.File;
import java.io.IOException;

public class File7 {
	public static void main(String[] args) {
		File myfile = new File("G:\\HACKERRANK\\JAVAFORDUMMIES\\src\\DAY6\\newfile.txt");
		// making the file read only
		boolean flag = myfile.setReadOnly();
		if (flag == true) {
			System.out.println("File successfully converted to Read only mode!!");
		} else {
			System.out.println("Unsuccessful Operation!!");
		}
	}
}

