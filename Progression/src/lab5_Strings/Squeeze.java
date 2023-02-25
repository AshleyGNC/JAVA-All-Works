package lab5_Strings;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Squeeze {
	    public static String squeeze(String s) { 
	    	String new_s = "";
	    	ArrayList<String> tokens = new ArrayList<String>();
	    	String i = "[^ ]+";
		    Matcher m = Pattern.compile(i).matcher(s);

		    while (m.find()) {
		    	tokens.add(m.group());
		    }
		    for (int j=0; j<tokens.size(); j++) 
		    	new_s += tokens.get(j) + " ";
		    
			return new_s;
	    }


	    public static void main(String[] args) { 
	    	
	        System.out.println(squeeze("hello  worlds    map"));
	    }

}
