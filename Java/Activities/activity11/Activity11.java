package activity11;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Black");
		hm.put(2, "Yellow");
		hm.put(3, "Blue");
		hm.put(4, "Pink");
		hm.put(5, "Brown");
		
		//print all hashmp
		System.out.println("Original HashMap :"+hm);
      //remove 1 color
		hm.remove(3);
		//print map after removal
		System.out.println("HashMap after removalof element :"+hm);
		
		//validate if blue is removed or not
		
		if(hm.containsValue("Blue"))
		{System.out.println("Blue is not removed");}
		else {
			System.out.println("Blue has been removed from Hashmap");
		}
		
		// final size of a Hashmap
		System.out.println("Final size of Map is:"+hm.size());

	}

}
