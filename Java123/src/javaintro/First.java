package javaintro;

public class First {
	public void staff(int age) {
		System.out.println(age);
	}
		public void staff(String name) {
			System.out.println(name);
	}
		
public void staff(short salary) {
	System.out.println(salary);
}
public static void main (String [] args) {
	First obj =new First();
			obj.staff(21);
			obj.staff("Deepak");
			obj.staff(100000000);
}
}
