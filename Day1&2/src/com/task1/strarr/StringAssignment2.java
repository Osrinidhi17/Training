package com.task1.strarr;

/*url string*/
public class StringAssignment2 {

	public static void main(String[] args) {
		String url1="www.codegram.in/admin/addCourse.jsp";
		String url2="www.codegram.in/student/courses/java_course.jsp";
		
		String command = getCommand(url1);
		System.out.println("command : "+command);
		
	}

	private static String getCommand(String url1) {

		String substring = url1.substring(url1.lastIndexOf("/")+1);

        String substring1 = url1.substring(url1.lastIndexOf("."));

        return substring.replace(substring1, "");
	}
}