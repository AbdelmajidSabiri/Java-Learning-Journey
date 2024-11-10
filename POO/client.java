package POO;

public class client {
	
	protected int age;
	String name;
	
	public client(String name,int a) {
		this.age = a;
		//OR this(19); ==> appelle une autre contructeur Client2(int age) 
		this.name = "Zakaria";
	}
	
	
	void sePresenter() {
		System.out.println("Je m'appelle "+name+" age de "+age);
	}
	
	void modifieChapms(int a , String n) {
		age = a;
		name = n;
	}
	
}


