package lab5_Strings;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map.Entry;

public class TopLetter {
		
	static char getMostFrequentChar(String str)
	{
	
		int count = 0;
		int max_value = 0;
		String new_s = "";
    	ArrayList<String> tokens = new ArrayList<String>();
    	String i = "[a-z]";
	    Matcher m = Pattern.compile(i).matcher(str);
	    while (m.find()) {
	    	tokens.add(m.group());
	    }
	    
	    HashMap<String, Integer> letter = new HashMap<>();
	    
	    for (int j=0; j<tokens.size(); j++) 
	    	letter.put(tokens.get(j), count++);
	    System.out.println(letter.keySet());
	    for (int k=0; k<letter.keySet().size(); k++)
	    	
	    	if (letter.get(tokens.get(k)) > max_value)
	    		max_value = letter.get(tokens.get(k));
	    
	    for(Entry<String, Integer> entry: letter.entrySet()) {

	        // if give value is equal to value from entry
	        // print the corresponding key
	        if(entry.getValue() == max_value) {
	        	new_s = entry.getKey();

	        }
	    }
	    return new_s.charAt(0);
	  
	 }
	  
	 public static void main(String[] args)
	 {
	     String str1 = "abracadabra";
	     String str2 = "Supercalifragilisticexpialidocious";
	     System.out.println(getMostFrequentChar(str1));
	     System.out.println(getMostFrequentChar(str2));
	 }
	
}
