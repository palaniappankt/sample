package collectionsTest;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList<String> a = new ArrayList<String>();//Generic datatype
				ArrayList a = new ArrayList();//Non-Generics datatype
				a.add("Test1"); //0th Index
				a.add("Test2");//1
				a.add("Test3");//2
				a.add("Test4");//3
				System.out.println(a.size()); //to find the size
				//System.out.println(a.get(3));
				
				for(int i=0;i<a.size();i++)
				{
					System.out.println(a.get(i));
					
				}
				a.remove(0); //to remove the index created
				System.out.println(a.size());
				for(int i=0;i<a.size();i++)
				{
					System.out.println(a.get(i));
					
				}
				
		
	}

}
