package TestPackage;

import java.util.ArrayList;
import java.util.Collections;

public class FirstTest {

	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(5);
		arrayList.add(4);
		arrayList.add(6);
		arrayList.add(5);
		
		Collections.sort(arrayList);
		
		for(Integer i:arrayList) {
			System.out.println(i);
			
		}

	}

}
