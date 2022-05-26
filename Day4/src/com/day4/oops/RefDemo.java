package com.day4.oops;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class RefDemo {

	public static void main(String[] args) throws Exception {
		/**
		 * Diff class creations class is loader in the forName
		 */
		Class c = Class.forName("com.day4.oops.ReflectionApiEx");
		
		//ReflectionApiEx reflectionapiex = new ReflectionApiEx();
		/**
		 * create object and display class name
		 */
		//Class c = reflectionapiex.getClass();
		//Class c = ReflectionApiEx.class;
		System.out.println(c);
		/**
		 * wt is the superclass of the class then
		 */
		System.out.println("Super class of Employee :"+c.getSuperclass());
		/**
		 * anaysis the access modifier of it and it ill display constant value for it
		 * and tostring is so display like public abstract/final...
		 */
		int mod = c.getModifiers();
		System.out.println("Modifier : "+Modifier.toString(mod));
		/**
		 * Class[]> then display the Serializable,clonable and display hashcode
		 */
		Class[] classes = c.getInterfaces();
		for(Class cls : classes) {
			System.out.println("Interface array hashcode :"+ classes.hashCode());
			/**
			 * at 0 postion we have serializable
			 */
			System.out.println("classes[0] : "+classes[0]);
			/**
			 * at 0 postion we have serializable n obj
			 */
			System.out.println("classes[0].hashcode : "+classes[0].hashCode());
			/**
			 * Num of const in pgm
			 */
			Constructor[] constructors = c.getDeclaredConstructors();
			System.out.println("Length " +constructors.length);
			//display type of constr
			for(Constructor constructor : constructors) {
				System.out.println(constructor);
			}
			/**
			 * num of methods
			 */
			Method[] methods = c.getDeclaredMethods();
			System.out.println("Length " +methods.length);
			//display type of methods
			for(Method method : methods) {
				System.out.println(method);
			}
			
			Field[] fields = c.getDeclaredFields();
			for(Field field : fields) {
				System.out.println(field);
			}
			
			/**ReflectionApiEx reflectionapiex = new ReflectionApiEx();
			Class c = Class.forName("com.day4.oops.ReflectionApiEx");
			Constructor[] constructors = c.getDeclaredConstructors();
			constructors**/

			
 		}
	}
}
