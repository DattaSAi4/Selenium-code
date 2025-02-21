package Arrayonelineque;

public class Removeuncessarycharactersfromthestring {
	public static void main(String[] args) {
		
		String s1 ="<>OML:OJString";
		
		String s2=s1.replaceAll("[^a-z,0-9,A-Z]", "");
		System.out.println(s2);
		
		String s3 ="<><>Vinay";
		
		System.out.println(s3.replaceAll("[^a-z,0-9,A-Z]", ""));
	}

}
