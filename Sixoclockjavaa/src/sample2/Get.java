package sample2;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Get {
public static void main(String[]args) {
	try {
		File obj = new File("C:\\Users\\lenovo\\Desktop\\Text file\\sample2");
		Scanner myobj = new Scanner(obj);
		if(myobj.hasNext()) {
			String s = myobj.nextLine();
			System.out.println(s);
		}
	}catch(FileNotFoundException e) {
		System.out.println("error occured");
	}
	

}
}
