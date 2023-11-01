package collectionCodes.iteratorEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LetsVisitEachElements {

	public static void main(String[] args) {

		List<String> crunchifyList = new ArrayList<String>();

		crunchifyList.add("Fb");
		crunchifyList.add("insta");
		crunchifyList.add("wp");

		System.out.println(crunchifyList);

		// simple For loop
		System.out.println(" 1. Simple For loop Example....");
		for (int i = 0; i < crunchifyList.size(); i++) {
			System.out.print(crunchifyList.get(i) + " , ");
		}

		// New Enhanced For loop
		System.out.println("\n==============> 2. New Enhanced For loop Example..");
		for (String temp : crunchifyList) {
			System.out.print(temp +" , ");
		}

		
		// Iterator - Returns an iterator over the elements in this list in proper sequence.
        System.out.println("\n==============> 3. Iterator Example...");
		Iterator<String> crunchifyIterator = crunchifyList.iterator();
        while (crunchifyIterator.hasNext()) {
            System.out.println(crunchifyIterator.next());
        }
        
     // ListIterator - traverse a list of elements in either forward or backward order
        // An iterator for lists that allows the programmer to traverse the list in either direction, modify the list during iteration,
        // and obtain the iterator's current position in the list.
        System.out.println("\n==============> 4. ListIterator Example...");
        ListIterator<String> crunchifyListIterator = crunchifyList.listIterator();
        while (crunchifyListIterator.hasNext()) {
            System.out.println(crunchifyListIterator.next());
        }
        
        // while loop
        System.out.println("\n==============> 5. While Loop Example....");
        int i = 0;
        while (i < crunchifyList.size()) {
            System.out.println(crunchifyList.get(i));
            i++;
        }
        
        // Iterable.forEach() util: Returns a sequential Stream with this collection as its source
        System.out.println("\n==============> 6. Iterable.forEach() Example....");
        crunchifyList.forEach((temp) -> {
            System.out.println(temp);
        });
        
        // collection Stream.forEach() util: Returns a sequential Stream with this collection as its source
        System.out.println("\n==============> 7. Stream.forEach() Example....");
        crunchifyList.stream().forEach((crunchifyTemp) -> System.out.println(crunchifyTemp));
    }

}
