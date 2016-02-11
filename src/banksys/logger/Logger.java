package banksys.logger;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.io.File;
//import java.util.logging.
import java.io.FileWriter;
import java.io.IOException;


public class Logger {
	
	public static void register(String message) throws IOException {
		
		String dateAndTime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
		File log = new File("log.txt");
		if (!log.exists()) {
			log.createNewFile();
		}
		
		FileWriter fileWriter = new FileWriter(log, true);
		fileWriter.write("("+ dateAndTime + ") " + message);
		fileWriter.write(System.getProperty("line.separator"));
		fileWriter.close();
	}	
}