package snippet;

import java.util.*;

public class CommonValuesFromList {

	/*
	 * List A = 1,2,3,4,5 List B 3,4,5,6,7,8 List C = 3,4,5
	 */

	public static void main(String[] args) {

		List<Integer> A = new ArrayList<Integer>();

		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);

		System.out.println(A);

		List<Integer> B = new ArrayList<Integer>();

		B.add(3);
		B.add(4);
		B.add(5);
		B.add(6);
		B.add(7);
		B.add(8);

		System.out.println(B);

		// A.retainAll(B);

		List<Integer> C = new ArrayList<Integer>();

		for (int aa : A) {
			for (int bb : B) {
				if (aa == bb) {
					C.add(aa);
				}
			}
		}

		System.out.println("List C:-" + C);

		/*
		 * HashMap <String ,Integer>map=new HashMap<String, Integer>();
		 * 
		 * map.put("X", 1); map.put("Y", 2); map.put("Z", 3); map.put("O", 4);
		 * 
		 * System.out.println(map.entrySet());
		 * 
		 * for(Object o:map.values()) { System.out.println(o); }
		 */

	}

}
