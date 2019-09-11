package org.company;

public class CompanyInformatio {
	public void CompanyInformatio() {
		System.out.println("def.emponyInformation");

	}
	//data Type
	public void CompanyInformatio(int a) {
System.out.println(a);	
}
	public void CompanyInformatio(String a) {
		System.out.println(a);
	}
	//dataType Count
	public void CompanyInformatio( String a,String b) {
System.out.println(a+b);
	}
	public void CompanyInformatio(int a,String b) {
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		
		CompanyInformatio p = new CompanyInformatio();
		p.CompanyInformatio(1234567890);
		p.CompanyInformatio("reddy");
		p.CompanyInformatio("manasa","kesamreddy");
		p.CompanyInformatio(12345,"manasa");
		
		
	}

}
