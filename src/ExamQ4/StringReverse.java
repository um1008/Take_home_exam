package ExamQ4;

public class StringReverse {
	public String reverseString(String s) {
		String[] str = s.split(" ");
		String result = "";
		for (int i = 0; i < str.length; i++)
	        {
	           String val = str[i]; 
	           String word = "";
	           for (int j = val.length()-1; j >= 0; j--) 
		   {
			word = word + val.charAt(j);
		   }
		   result = result + word + " ";
		}
		return result;
	}

}

