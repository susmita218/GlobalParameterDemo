import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Global {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\workspace2\\GlobalParameter\\src\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos=new FileOutputStream("C:\\Users\\hp\\workspace2\\GlobalParameter\\src\\data.properties");
		prop.store(fos, null);
	}

}
