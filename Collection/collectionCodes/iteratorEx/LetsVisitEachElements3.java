package collectionCodes.iteratorEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LetsVisitEachElements3 {

	public static void main(String[] args) {

		List<String> crunchifyList = new ArrayList<String>();

		crunchifyList.add("Fb");
		crunchifyList.add("insta");
		crunchifyList.add("wp");

		System.out.println(crunchifyList);

		
		Iterator<String> crunchifyIterator = crunchifyList.iterator();
        while (crunchifyIterator.hasNext()) {
            System.out.println(crunchifyIterator.next());
            
            //java.util.ConcurrentModificationException
            
            //crunchifyList.add("hello");
           // crunchifyList.remove(2);
            //crunchifyList.;
        }
        
     }

}
