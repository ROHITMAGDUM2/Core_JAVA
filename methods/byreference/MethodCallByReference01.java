package methods.byreference;

public class MethodCallByReference01 {
		public static void m1(Data d) {

			d.a = 5000;
			d.b = 7000;

		}

		public static void main(String[] args) {

			Data d1 = new Data();
			d1.a = 200;
			d1.b = 300;
			System.out.println("Before method call :");
			d1.display();
			m1(d1);
			System.out.println("After method call :");
			d1.display();

		}

	}
	