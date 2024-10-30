package Package;

public class TestJavaClass {

	public static void main(String[] args) {

		CarClass myCar1 = new CarClass();
		CarClass myCar2 = new CarClass();

		System.out.println(myCar1.make);
		System.out.println(myCar1.model);

		myCar1.drive();
		myCar1.brake();
	}

}
