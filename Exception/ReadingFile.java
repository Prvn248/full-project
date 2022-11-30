package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) throws IOException {
		try {
			
		File file=new File("C:\\praveen onesoft\\tex.txt");
		FileReader fr=new FileReader(file);
	int temp=0;
	while((temp=fr.read())!=-1) {
		System.out.print((char)(temp));
	}
		}catch(Exception f) {
			System.out.println("File is not Saved");
		}

	}

}
