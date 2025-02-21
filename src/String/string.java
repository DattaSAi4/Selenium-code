//-->string is non primitivate datatype which  contains sequence of charcters .
// and it is a class in java unique  because of unique behaviour we used to called literal

/*methods:touppercase()
          tolowercase()
          trim()---------->remove space 
          tochararray()
          length()
          indexof()--------it will give the index of character for that string 
          lastindexof()
          substring()
          split()
          charAT()------------>if we given the index?it will give the character of that index
          replace("o","z")---->in the place of "O" the "Z" will be display 
          replaceAll()
          valueof()--------> Integer.value()
          isEmpty()--- --------->if length is Zero returns true 
          isBLank()-----------> if it is bank it returns true
         
        */
package String;

public class string {
	
	public static void main(String[] args) {
		    
		
		String s1 = "vinay";
		System.out.println("The Length of the String:"+s1.length());//length
		
		String s2 ="Datta Sai Vinay";
		System.out.println("The Word in the given String: "+s2.split(" ").length);
		
		
		
		
		
	}
	

}
