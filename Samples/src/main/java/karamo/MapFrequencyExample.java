package karamo;

import java.util.*;

public class MapFrequencyExample {

	public static Map<String, Integer> calculateFrequencies(List<String> words) {
		Map<String,Integer> frequencies=new HashMap<String, Integer>();
		
		for(String word : words) {
			if( frequencies.containsKey(word)) {
				frequencies.put(word,  frequencies.get(word)+1);
			} else {
				frequencies.put( word, 1);
			}
		}
		
		return frequencies;
	}
	
	public static void main(String args[]) {
		String phrase="One fish two fish red fish blue fish";
		List<String> words= Arrays.asList(phrase.split(" "));
		
		Map<String,Integer> frequencies=calculateFrequencies(words);
		
		for( Map.Entry<String, Integer> entry : frequencies.entrySet()) {
			System.out.println(entry.getKey() + " -> "+ entry.getValue());
		}
	}
}
