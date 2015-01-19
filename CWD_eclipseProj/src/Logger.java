import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {

	public static void write(String text) {
		// Open File
		File file = new File("../LogCreating.txt");

		try {

			FileWriter sw = new FileWriter(file, true);

			sw.write(text + "\n");

			sw.close();

		} catch (Exception e) {

			System.out.print(e.getMessage());

		}
	}

	public static void statisticsWrite() {
		// WriteFile
		File file = new File("C:\\LogCreating.txt");

		try {

			FileWriter sw = new FileWriter(file, true);

			sw.write("________________________" + "\n");
			sw.write("_______Statistics_______" + "\n");
			sw.write("________________________" + "\n");

			sw.write("Speciality errors = " + Errors.SpectialityErrors + "\n");
			sw.write("Students errors = " + Errors.StudentsErrors + "\n");
			sw.close();

		} catch (Exception e) {

			System.out.print(e.getMessage());

		}
	}
}
