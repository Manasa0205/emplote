package org.emp;

public class Employee {
private void add() {
System.out.println("manasa reddy");
}
//Data Type
public void add(int a){
	System.out.println(a);
}
public void add(String a){
System.out.println("a");	
}
//Data Type Count
public void add(String a,String b){
	System.out.println(a+b);
}
//Data Type Order
public void add(int a, String b){
	System.out.println(a+b);
}
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.add();
		e.add(127);
		e.add("reddy");
		e.add("manasa","reddy");
		e.add(125,"kesamreddy");
	}

}
