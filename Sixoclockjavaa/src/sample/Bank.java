package sample;

public class Bank extends Hdfc{
public void savings() {
	System.out.println(8000);
}
public void salary() {
	System.out.println(1000000);

}
	public static void main(String[]args) {
		Bank obj = new Bank();
		
        obj.savings();
		obj.salary();
		
	}
}
