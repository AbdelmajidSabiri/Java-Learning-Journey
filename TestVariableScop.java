
public class TestVariableScop {

	public static void main(String[] args) {

		int i = 0;
		while(i<10) {
			int d = 5;
			System.out.println(i);
			System.out.println(d);
			i++;
		}
		
	}

}
