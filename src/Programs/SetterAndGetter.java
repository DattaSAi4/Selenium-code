package Programs;

import com.graphbuilder.struc.LinkedList;
import com.graphbuilder.struc.LinkedList.Node;

public class SetterAndGetter {
	
	int a;
	int b;
	String s1 = new String();
	LinkedList s2 = new LinkedList();
	
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}
	
	public void set()
	{
		s2.addToHead(10);
	}
	
	public Node get()
	{
		return s2.getHead();
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public static void main(String[] args) {
		
		     SetterAndGetter s1 = new SetterAndGetter();
		     s1.setA(20);
		     s1.setB(23);
		    System.out.println(s1.getA());
		    System.out.println(s1.getB());
		    s1.set();
		  System.out.println(s1.get());
		 
		 
		
	}

}
