package Java8.lamdaexpresions;

/*interface Runnable {
	public void run();
}

*/
public class Ex02_RunnableLamda {

	public static void main(String[] args) {
		
		Runnable r= ()-> {
			System.out.println("Run");
		};
//		r.run();
		
		Thread th =new  Thread(r);
		th.run();
		
		
	}

}
