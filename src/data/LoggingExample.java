package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		
		//add log4j.jar to the project - to build path
		//copy log4j.properties directly inside the src folder
		// create the object in the code
		Logger a = Logger.getLogger("devpinoyLogger");
		a.debug("Hello"); // system.out.println();
		a.debug("We're writing in to a log");

	}

}
