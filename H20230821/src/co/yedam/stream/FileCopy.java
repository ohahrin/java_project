package co.yedam.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		try {
			FileInputStream fis = new FileInputStream("C:/temp/img1.jpg");			
			FileOutputStream fos = new FileOutputStream("C:/temp/img1.jpg");
			byte[] buf = new byte[100];
			
			while(true) {
				int val = fis.read(buf);
				if(val == -1) {
					break;
				}
				fos.write(buf);
			}
			fis.close();
			fos.flush();
			fos.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
