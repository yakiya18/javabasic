package sample2;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
	public static void main(String[]args) {
		
			try {
				FileWriter obj = new FileWriter("C:\\Users\\lenovo\\Desktop\\Text file\\sample2");
				obj.write("this is y im learning java");
				obj.close();
			}catch(IOException e) {
			  e.printStackTrace();
			}
		}
	}



