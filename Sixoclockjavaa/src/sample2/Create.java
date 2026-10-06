package sample2;
import java.io.File;
import java.io.IOException;

public class Create {
	public static void main(String[]args) {
		try {
			File obj = new File("C:\\Users\\lenovo\\Desktop\\Text file\\sample2");
		 if(obj.createNewFile()) {
			 System.out.println("file created");
		 }else {
			 System.out.println("file exist");
		 }
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
