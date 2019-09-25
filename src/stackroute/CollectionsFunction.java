package stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class CollectionsFunction {
	public static List<String> updateList(List<String> inputList,String item,String replace){
		int index = inputList.indexOf(item);
		inputList.set(index, replace);
		return inputList;
	}
	public static Map<String,Integer> wordCount(String inputString){
		Map<String,Integer> hm = new HashMap<String,Integer>();
		List<String> words = new ArrayList<String>();
		StringBuffer sb = new StringBuffer();
		for(char c:inputString.toCharArray()) {
			if(c<97 || c>122) {
				if(sb.length()>1)
					words.add(sb.toString());
				sb = new StringBuffer();
			}else
				sb.append(c);
		}
		String[] wordsArray = words.toArray(new String[0]);
		for(String word:wordsArray) {
			if(!hm.containsKey(word))
				hm.put(word, 1);
			else
				hm.put(word, hm.get(word)+1);
		}
		return hm;
	}
	public static Map<String,Boolean> moreThan2(String inputString){
		Map<String,Boolean> hm = new HashMap<String,Boolean>();
		String[] wordsArray = inputString.split(" ");
		for(String word:wordsArray) {
			if(!hm.containsKey(word))
				hm.put(word, false);
			else
				hm.put(word, true);
		}
		return hm;
	}
	public static Map<String,String> replaceOneTwo(Map<String,String> inputMap){
		inputMap.put("val2", inputMap.get("val1"));
		inputMap.put("val1","");
		return inputMap;
	}
	public static List<String> sortHashSet(String names){
		HashSet<String> set = new HashSet<String>();
		String[] nameArray = names.split(" ");
		for(String name:nameArray) {
			set.add(name);
		}
		List<String> list = new ArrayList<String>(set); 
        Collections.sort(list);
        return list;
	}
}
