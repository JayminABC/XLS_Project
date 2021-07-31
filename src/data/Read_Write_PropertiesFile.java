package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Write_PropertiesFile {

	public static void main(String[] args) throws IOException {
		//Read from properties file
		FileInputStream f = new FileInputStream("C:\\Testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String Browser = prop.getProperty("browser");
		System.out.println(Browser);
		
		System.out.println(prop.getProperty("correctEmail"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("test"));
		System.out.println(prop.getProperty("incorrectemail"));
		
		//Write into properties file
		prop.setProperty("tool", "Selenium");
		System.out.println(prop.getProperty("tool"));
		
		prop.setProperty("town", "Kitchener");
		System.out.println(prop.getProperty("town"));
		
		FileOutputStream fo = new FileOutputStream("C:\\Testing\\prop.properties");
		prop.store(fo, "Adding to the properties file");
		
		
		

	}

}
