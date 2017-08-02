import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample {

	public static void main(String args[])
	{
		File file = new File("test.txt");
		
		try {
			FileReader fr = new FileReader(file);
			
			//This will not be executed if an exception is thrown
			System.out.println("Continuing.....");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Will continue to execute further
		System.out.println("Finished...");
	}
}
