package collectionCodes.iteratorEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LetsVisitEachElements2 {

	public static void main(String[] args) {

		List<String> crunchifyList = new ArrayList<String>();

		crunchifyList.add("Fb");
		crunchifyList.add("insta");
		crunchifyList.add("wp");

		System.out.println(crunchifyList);

		
		
		System.out.println("\n ListIterator Forword Example...");
        ListIterator<String> litr = crunchifyList.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }
        
     System.out.println("\n ListIterator Backword Example...");
   while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
        
       }

}
