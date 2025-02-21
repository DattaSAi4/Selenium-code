package Com.Javatopics.interfac;

public class TCs implements Company1 {

	
	public void idcard() {
		System.out.println("Tcs should wear id card");
		
	}

	
	public void formaldress() {
		System.out.println("Tcs employess should wear formaldress");
	}

	
	public void nopendrives() {
		System.out.println("Tcs employess should no bring pendrives to office ");
		
	}
	
	public static void main(String[] args) {
		
		       Mphasis s1 = new Mphasis();
		       s1.idcard();
		       s1.formaldress();
		       s1.nopendrives();
		     TCs s2 = new TCs();
		     s2.idcard();
		     s2.formaldress();
		     s2.nopendrives();
		     
	}

}
