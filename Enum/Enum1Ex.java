package Enum;


	enum Days{
		
		MON,TUE,WED,THURS,FRI,SAT,SUN
	}

	enum PaymentModes{
		
		cash,upi,net,wallet,cc,dc
	}

	public class Enum1Ex {

		public static void main(String[] args) {
			
			Days d1;
			d1 = Days.WED;
			
			//System.out.println(d1);
			/*
			 * Days[] v = d1.values();
			 * 
			 * for(Days vv :v)
			 * 
			 * System.out.println(vv);
			 */
			
			PaymentModes pm=null;
			
			PaymentModes[] values = pm.values();
			
			for(PaymentModes p:values)
				System.out.println(p);

		}

	}


