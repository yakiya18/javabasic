package sample;
import java.util.Arrays; 
import java.util.Scanner;
import java.util.Vector;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet; 
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class Main {
	String name;
	int age;
	
	Main(String n, int a){
    name = n;
    age = a;
	}

	public static void main(String[]args) {
		Main s = new Main("yakiya", 20);
		System.out.println(s.name);
		System.out.println(s.age);

		

//byte age = 20;
//int num = 1234567890;
//long adharno=12345678765432l;
//float height = 77.8967f;
//double weight =78.6984;
//char initial ='S';
//Boolean isactive = true;
//short salary = 30000;
//
//System.out.println(age);
//System.out.println(num);
//System.out.println(adharno);
//System.out.println(height);
//System.out.println(weight);
//System.out.println(initial);
//System.out.println(isactive);
//System.out.println(salary);
//
//String name = "yakiya";
//System.out.println(name);
//
//String[] colors = {"pink", "yellow", "blue"};
//System.out.println(Arrays.toString(colors));
//System.out.println(colors[0]);
//
//int a = 90;
//int b = 80;
//System.out.println(a + b);
//System.out.println(a - b);
//System.out.println(a * b);
//System.out.println(a / b);
//System.out.println(a % b);
//int c = 8;
//c++;
//System.out.println(c);
//
//int d = 7;
//d--;
//System.out.println(d);
//
//int m = 90;
//m+= 90;
//System.out.println(m);
//int y = 90;
//y-= 90;
//System.out.println(y);
//int z = 90;
//z*= 90;
//System.out.println(z);
//int w = 90;
//w/= 90;
//System.out.println(w  );
//int e = 90;
//e%= 90;
//System.out.println(e);
//
//int n = 90;
//int j = 80;
//System.out.println(n < j);
//System.out.println(n > j);
//System.out.println(n<=j);
//System.out.println(n>=j);
//System.out.println(n==j);
//System.out.println(n!=j);
//System.out.println((n!=j)&&(n==j));
//System.out.println((n!=j)||(n==j));
//System.out.println(!(n!=j)||(n==j));
//System.out.println(c);
//
//LocalDate dt = LocalDate.now();
//System.out.println(dt);
//
//LocalTime tt = LocalTime.now();
//System.out.println(tt);
//
//LocalDateTime ddtt = LocalDateTime.now();
//System.out.println(ddtt.getDayOfMonth());
//System.out.println(ddtt.getHour());
//System.out.println(ddtt.getDayOfYear());
//System.out.println(ddtt.getSecond());
//System.out.println(ddtt.getYear());
//
//System.out.println(Math.abs(-90));
//System.out.println(Math.max(90 , 20));
//System.out.println(Math.min(90 , 20));
//System.out.println(Math.round(98.78));
//System.out.println(Math.random());
//System.out.println(Math.ceil(98.78));
//System.out.println(Math.floor(98.78));
//System.out.println(Math.PI);
//System.out.println(Math.sqrt(64));
//
//System.out.println(Math.round(Math.random()*10000));

//int a = 0;
//
//while(a<=50) {
//	System.out.println(a);
//	a++;
//}

//do {
//	System.out.println(a);
//    a++;
//}while(a<=50);

//for(int i=0; i<=50; i++) {
//	if(i%2==0) {
//		System.out.println(i);
//	}
////}
//int sum = 0;
//for(int i= 1; i<=10; i++) {
//	sum = sum + i;
//
//}
//System.out.println(sum);


//	Vector<String> obj = new Vector();
//	obj.add("test");
//	obj.add("test1");
//	obj.add("test1");
//	obj.add("test2");
//	obj.add("test3");
//	System.out.println(obj);
//	System.out.println(obj.get(1));
//	System.out.println(obj.size());
	
//		HashMap<String,String> obj = new HashMap<String,String> ();
//		obj.put("india", "delhi");
//		obj.put("japan", "tokyo");
//		obj.put("uk", "london" );
//		obj.put("england", "london");
//		obj.replace("england", "london", "londonuk");
//		System.out.println(obj);
		
//		LinkedHashMap<String,String> obj = new LinkedHashMap<String,String> ();
//		obj.put("india", "delhi");
//		obj.put("japan", "tokyo");
//		obj.put("uk", "london" );
//		obj.put("england", "london");
//		obj.replace("england", "london", "londonuk");
//		System.out.println(obj);
		
//		TreeMap<String,String> obj = new TreeMap<String,String> ();
//		obj.put("india", "delhi");
//		obj.put("japan", "tokyo");
//		obj.put("uk", "london" );
//		obj.put("england", "london");
//		obj.replace("england", "london", "londonuk");
//		System.out.println(obj);
		
//		for (int i = 1; i<=5; i++) {
//			for(int j = 1; j<=j; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		String [] color = {"red","yellow","blue","pink"};
//		System.out.println(Arrays.toString(color));
//		System.out.println(color[3]);
//		
//		
//		
// String s = "yakiya";
// System.out.println(s.length());
// String a = "yakiya";
// String b = "khan";
// System.out.println(a.concat(b));
// String up = "yakiya";
// System.out.println(up.toUpperCase());
// String low = "yakiya";
// System.out.println(low.toLowerCase());
// String m = "yakiya";
// System.out.println(m.charAt(0));
// 
// Scanner sc = new Scanner(System.in);
// System.out.println("enter the first number");
// int num1 = sc.nextInt();
// 
// System.out.println("enter the second number");
// int num2 = sc.nextInt();
// 
// System.out.println("choose the operator (+ , - , * , /)");
// char op = sc.next().charAt(0);
// 
// switch(op) {
// case '+':
//	 System.out.println("Result : " + (num1 + num2 ));
//	 break;
// case '-':
//	 System.out.println("Result : " + (num1 - num2 ));
//	 break; 
// case '*':
//	 System.out.println("Result : " + (num1 * num2 ));
//	 break;
// case '/':
//	 System.out.println("Result : " + (num1 / num2 ));
//	 break;
// case '%':
//	 System.out.println("Result : " + (num1 % num2 ));
//	 break;
//default :
//	System.out.println("error");		 
//	
//}
// 
// StringBuffer obj = new StringBuffer("Hello");
//	obj.append("world");
//	System.out.println(obj);
//	
//	StringBuffer obj1 = new StringBuffer("Hlo");
//	obj1.insert(1, "el");
//	System.out.println(obj1);
//	
//	StringBuffer obj2 = new StringBuffer("Heeello");
//	obj2.delete(1 , 3);
//	System.out.println(obj2);
//	
//	StringBuffer obj3 = new StringBuffer("olleh");
//	obj3.reverse();
//	System.out.println(obj3);
		
		
	
	
 




















	
}
}
