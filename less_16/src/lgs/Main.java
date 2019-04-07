package lgs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, 
											IllegalAccessException, IllegalArgumentException, InvocationTargetException,
											NoSuchFieldException {

		Class pc = Student.class;

		System.out.println("Name of class = " + pc.getName());
		System.out.println("Simple name of class = " + pc.getSimpleName());
		System.out.println();

		System.out.println("Text = " + Modifier.toString(pc.getModifiers()) + ", int = " + pc.getModifiers());
		System.out.println("Class is abstact = " + Modifier.isAbstract(pc.getModifiers()));
		System.out.println("Class is static = " + Modifier.isStatic(pc.getModifiers()));
		System.out.println();

		Package pack = pc.getPackage();
		System.out.println("Package of class = " + pack);
		Class sup = pc.getSuperclass();
		System.out.println("SuperClass = " + sup);
		Class[] inter = pc.getInterfaces();
		System.out.println("Interfaces = " + Arrays.toString(inter));
		Constructor<Student>[] constrArray = pc.getConstructors();
		System.out.println();

		System.out.println("Constructor size = " + constrArray.length);
		for (int i = 0; i < constrArray.length; i++) {

			System.out.println("Constructor = " + constrArray[i]);
		}
		Constructor<Student> constructor2 = pc.getConstructor(Map.class);
		System.out.println();
		
		System.out.println("Single constructor = "+ constructor2 );
		Map<String, Integer> st = new HashMap<>();
		st.put("geometry", 10);
		st.put("algebra", 11);
		Student student = constructor2.newInstance(st);
		System.out.println("Reflection Student = " + student.toString());
		System.out.println();
		
		Constructor<Student> constructor = constrArray[0];
		Class<?>[] parType = constructor.getParameterTypes();
		for (int i = 0; i < parType.length; i++) {
			System.out.println("Parameter = " + parType[i]);

		}
		Field[] fields = pc.getFields();
		for (int i = 0; i < fields.length; i++) {

			System.out.println("Field = " + fields[i]);

		}
		System.out.println();

		fields = pc.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {

			System.out.println("Field = " + fields[i]);

		}
		System.out.println();
		
		Method [] methods = pc.getMethods();
		for (int i = 0; i < methods.length; i++) {
			
			System.out.println("Method = " + methods[i]);
			
		}
		System.out.println();
		
		methods[4].invoke(student, "Olha");
		System.out.println(student);
		

		Field nameNew = pc.getField("name");
		nameNew.set(student, "Bogdan");
		System.out.println(student);
		
		
		Method meth1 = pc.getMethod("replaceLevel", int.class);
		meth1.invoke(student, 4);
		System.out.println(student);
		
		meth1 = pc.getMethod("UpYears", String.class, int.class);
		meth1.invoke(student, "Vika", 1);
		System.out.println(student);
		
		
		
		
		

	}

}
