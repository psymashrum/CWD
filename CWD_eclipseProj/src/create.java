import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.in;

import java.util.ArrayList;

/**
 *
 * @author aelkin
 */
public class create {

	// Мелкие переменные
	private static String fileName = ("../AD.csv");
	private static String fileNameGroups = ("../group.csv");

	// Класс присутствия файла

	private static void exists(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		if (!file.exists()) {
			throw new FileNotFoundException(file.getName());
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Group> groups = readGroups(fileNameGroups);

		ArrayList<String> text = read(fileName);
		for (String str : text) {
			checkGroups(str, groups);
		}

		Logger.statisticsWrite();

	}

	private static void checkGroups(String student, ArrayList<Group> groups) {
		for (Group str : groups) {
			if (student.contains(str.getGroup())) {
				CreateFolder.made(student, str.getGroup(), str.getSpec());
				// System.out.print(student + " " + str.getGroup() + " " +
				// str.getSpec() + "\n");
			}
		}

	}

	// public static
	// Класс чтение файла
	public static ArrayList<String> read(String fileName)
			throws FileNotFoundException {
		StringBuilder sb = new StringBuilder();
		exists(fileName);
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File(
					fileName)));
			try {
				String s;
				while ((s = in.readLine()) != null) {
					sb.append(s);
					sb.append(",");
				}
			} finally {
				in.close();
			}
		} catch (IOException e) {
			throw new RuntimeException();
		}
		ArrayList users = new ArrayList<String>();
		String[] study = sb.toString().split(",");
		for (String x : study) {
			String resultString = x.replaceAll("\\ ||\\,", "");
			users.add(resultString);
		}

		return users;
	}

	public static ArrayList<Group> readGroups(String fileName)
			throws FileNotFoundException {
		StringBuilder sb = new StringBuilder();
		String stringGroups = new String();
		exists(fileName);
		try {
			BufferedReader in = new BufferedReader(new FileReader(new File(
					fileName)));
			try {
				String s;
				while ((s = in.readLine()) != null) {
					sb.append(s);
					sb.append(";");
				}
			} finally {
				in.close();
			}
		} catch (IOException e) {
			throw new RuntimeException();
		}
		ArrayList<Group> groupsArray = new ArrayList<Group>();
		String[] groups = sb.toString().split(";");
		for (String x : groups) {
			String[] data = x.split(",");
			groupsArray.add(new Group(data[0], data[1]));
		}
		return groupsArray;
	}

}
