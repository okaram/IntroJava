import java.lang.Character;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.*;
import java.util.HashMap;

class MapUtils {
	public static class Pair<K, V> {
		public K key;
		public V value;

		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	public static <K,V> Map<K,V> makeHashMap(List<MapUtils.Pair<K,V>> entries)
	{
		Map<K,V> theMap=new HashMap<K,V>();
		for(Pair<K,V> entry : entries)
			theMap.put(entry.key, entry.value);
		return theMap;
	}

	public static <K,V> Map<K,V> makeHashMap(List<K> keys, List<V> values)
	{
		Map<K,V> theMap=new HashMap<K,V>();
		for(int i=0; i<keys.size(); ++i)
			theMap.put(keys.get(i),values.get(i));
		return theMap;
	}
}

class NumberTranslator {
	static final Map<Integer, String> digitNames=MapUtils.makeHashMap(Arrays.asList(
			new MapUtils.Pair<Integer,String>(0,"Zero"),
			new MapUtils.Pair<Integer,String>(1,"One"),
			new MapUtils.Pair<Integer,String>(2,"Two"),
			new MapUtils.Pair<Integer,String>(3,"Three"),
			new MapUtils.Pair<Integer,String>(4,"Four"),
			new MapUtils.Pair<Integer,String>(5,"Five"),
			new MapUtils.Pair<Integer,String>(6,"Six"),
			new MapUtils.Pair<Integer,String>(7,"Seven"),
			new MapUtils.Pair<Integer,String>(8,"Eight"),
			new MapUtils.Pair<Integer,String>(9,"Nine")
	));

	static final Map<Integer, String> teenNames=MapUtils.makeHashMap(Arrays.asList(
			new MapUtils.Pair<Integer,String>(10,"Ten"),
			new MapUtils.Pair<Integer,String>(11,"Eleven"),
			new MapUtils.Pair<Integer,String>(12,"Twelve"),
			new MapUtils.Pair<Integer,String>(13,"Thirteen"),
			new MapUtils.Pair<Integer,String>(14,"Fourteen"),
			new MapUtils.Pair<Integer,String>(15,"Fifteen"),
			new MapUtils.Pair<Integer,String>(16,"Sixteen"),
			new MapUtils.Pair<Integer,String>(17,"Seventeen"),
			new MapUtils.Pair<Integer,String>(18,"Eightteen"),
			new MapUtils.Pair<Integer,String>(19,"Nineteen")
	));

	static final Map<Integer, String> tensNames=MapUtils.makeHashMap(Arrays.asList(
			new MapUtils.Pair<Integer,String>(2,"Twenty"),
			new MapUtils.Pair<Integer,String>(3,"Thirty"),
			new MapUtils.Pair<Integer,String>(4,"Forty"),
			new MapUtils.Pair<Integer,String>(5,"Fifty"),
			new MapUtils.Pair<Integer,String>(6,"Sixty"),
			new MapUtils.Pair<Integer,String>(7,"Seventy"),
			new MapUtils.Pair<Integer,String>(8,"Eighty"),
			new MapUtils.Pair<Integer,String>(9,"Ninety")
	));

	public static String unitsToLetters(int digit) {
		return digitNames.get(digit);
	}

	public static String unitsToLettersAtEnd(int digit)
	{
		if(digit==0)
			return "";
		else
			return unitsToLetters(digit);
	}


	public static String numberBelow99ToLetters(int number) {
		if(number<10)
			return unitsToLetters(number);

		if(number>=10 && number<20)
			return teenNames.get(number);

		return tensNames.get(number/10) + " " + unitsToLettersAtEnd(number%10); // deal with zero :)
	}
}

public class CollectionsExamples {

	public static void demoArrayList() {
		// boxing - int is a primitive, not an object, so I need to use the boxed class Integer
		List<Integer> l= new ArrayList<Integer>();
		l.add(3); // java does auto boxing/unboxing most of the time
		l.add(4); // java does auto boxing/unboxing most of the time
		l.add(5); // java does auto boxing/unboxing most of the time
		l.add(3); // java does auto boxing/unboxing most of the time
		l.add(4); // java does auto boxing/unboxing most of the time

//		System.out.println(l.size());
//		System.out.println(l.get(0));

		printList(l);
	}

	public static void demoSet() {
		// boxing - int is a primitive, not an object, so I need to use the boxed class Integer
		Set<Integer> l= new HashSet<Integer>();
		l.add(3); // java does auto boxing/unboxing most of the time
		l.add(4); // java does auto boxing/unboxing most of the time
		l.add(5); // java does auto boxing/unboxing most of the time
		l.add(3); // java does auto boxing/unboxing most of the time
		l.add(4); // java does auto boxing/unboxing most of the time
		System.out.println("demoSet");

		// set does NOT have a get() method
		printList(l);
	}



	public static void demoMap() {
		// the interface is map, the implementing class is HashMap
		Map<String, Integer> digitValues=new HashMap<String,Integer>();
		digitValues.put("Zero",0);
		digitValues.put("One",1);
		digitValues.put("Two",2);

		System.out.println(digitValues.get("One"));
	}


	public static <T> String listToString(List<T> l, String separator) {
		if(l.isEmpty())
			return "";

		String ans=l.get(0).toString();

		for(int i=1; i<l.size(); ++i)
			ans+=separator+l.get(i).toString();

		return ans;
	}

	public static <T> void printList(Collection<T> array)  {
		for(T element : array) {
			System.out.println(element);
		}
	}

	public static <K,V> Map<K,V> calculateFrequencies(List<K> l) { return null;}

	public static void main(String args[]) {
		demoArrayList();

		System.out.println(NumberTranslator.unitsToLetters(2));
//		List<Integer> l=Arrays.asList(1,2,3);
//		System.out.println(listToString(l,", "));
	}	
}
