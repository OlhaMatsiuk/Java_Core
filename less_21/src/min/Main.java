package min;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		List<String> list = getAnnoationValue(Person.class);
		System.out.println();
		System.out.println(list);
			writeListInF(list, new File("File.obj"));
	}

	public static List<String> getAnnoationValue(Class<?> customClass) throws IOException {
		Field[] fields = customClass.getDeclaredFields();
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			if (field.getAnnotation(Integ.class) instanceof Integ) {
				System.out.print(field.getName() + " ----- ");
				System.out.println(" annotaion value = " + field.getAnnotation(Integ.class).params());
				list.add(field.getName());
			}
		}
		return list;
	}
	
	public static void writeListInF(List<String> list, File file) throws IOException {
		Files.write(file.toPath(), list);
	}
}