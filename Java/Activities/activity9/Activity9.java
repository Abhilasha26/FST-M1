package activity9;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		ArrayList<String> arrList=new ArrayList<String>();
		//add objects to default index
		arrList.add("Mike");
		arrList.add("Rachel");
		arrList.add("Harvey");
		//add objects to specific index
		arrList.add(3,"Jesica");
		arrList.add(2,"Jaden");
		
		System.out.println("Print all the objects:");
		for (String a:arrList)
		{
			System.out.println(a);
		}
		
		System.out.println("3rd element is :"+arrList.get(2));
		System.out.println("Is Rachel added? :"+arrList.contains("Rache"));
		System.out.println("Size of arraylist is :"+arrList.size());;
		
		//remove object from list
		arrList.remove("Jaden");
		
		// find the final size of an array list
		System.out.println("Final Size of arraylist is :"+arrList.size());;

	}

}
