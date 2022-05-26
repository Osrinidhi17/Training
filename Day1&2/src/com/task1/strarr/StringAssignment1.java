package com.task1.strarr;

/*Both String reverse*/
import java.util.Stack;

public class StringAssignment1 {
	public static void main(String[] args) {
		String str1 = "Hello Dear Friends";
		System.out.println("Input - "+str1);
		String wordReverse = reverseWord(str1);
		System.out.println("wordReverse - "+wordReverse);
		String stringReverseByWord = reverseStringByWord(str1);
		System.out.println("stringReverseByWord - "+stringReverseByWord);
	}
        private static String reverseWord(String str1) {
		String str[]=str1.split("\\s");//split the words
		String rs=" ";//ReversedString
		for(int i=0;i<str.length;i++)
		{
			if(i==str.length-1)
				rs = str[i]+ rs;
			else
				rs=" "+str[i]+rs;
		}
		return rs;
	}
	private static String reverseStringByWord(String str1) {
		String str = "";
		Stack<Character> st = new Stack<Character>();		// reverses individual words of a string
        // Traverse given string and push all characters to stack until we see a space.
		for (int i = 0; i < str1.length(); ++i) {
			if (str1.charAt(i)!= ' ')
				st.push(str1.charAt(i));
			// When we see a space, we print contents of stack.
			else {
				while (st.empty() == false) {
					str = str + st.pop();
				
				}
				str = str + " ";
			}
		}
		// Since there may not be space after last word.
		while (st.empty() == false) {
			str = str + st.pop();
		}
		return str;
	}
}