package activity10;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("Apple");
		hs.add("Grape");
		hs.add("Banana");
		hs.add("Chiku");
		hs.add("Orange");
		//print hashset
		System.out.println("Full hashset is :"+hs);
		//size of hashset 
		System.out.println("Size of hashset is :"+hs.size());
		//remove element
		
		hs.remove("Grape");
		//check if Grape is removed or not
		if(hs.remove("Grape"))
		{System.out.println("Grape is removed from hashset");}
		else {
			{System.out.println("Grape is not removed");}
			
		//Search for element
			System.out.println("check if Apple is present:"+hs.contains("Apple"));
		//print final hashset
			System.out.println("Final hashset is :"+hs);
		}
	}

}
