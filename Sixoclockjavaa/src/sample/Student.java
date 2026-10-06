package sample;

public class Student {
	public void stud(String name) {
		System.out.println(name);
	}
	public void stud(int age) {
		System.out.println(age);
	}
	public void stud(boolean isactive) {
		System.out.println(isactive);
	}
	

	public static void main(String[]args) {
		Student obj = new Student();
		obj.stud("yakiya");
		obj.stud("21");
		obj.stud("false");


	}
}
