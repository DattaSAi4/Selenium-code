package Oops.Encapsulation;

public class OpenAccount {
   
	private int Adharnumber;
	private boolean passportphoto;
	private  int depositmoney;
	String Bank;
	
	public OpenAccount(String Bank)
	{
		if(Bank=="SBI")
		{
			System.out.println("Welcome to Sbi bank");
		}
		else
		{
		System.out.println("Sorry!In this branch you can open only Sbi account ");
		}
		
	}
	
	public int getAdharnumber() {
		return Adharnumber;
	}
	public void setAdharnumber(int adharnumber) {
		Adharnumber = adharnumber;
	}
	public boolean isPassportphoto() {
		return passportphoto;
	}
	public void setPassportphoto(boolean passportphoto) {
		this.passportphoto = passportphoto;
	}
	public int getDepositmoney() {
		return depositmoney;
	}
	public void setDepositmoney(int depositmoney) {
		this.depositmoney = depositmoney;
	}
	 
	 
	 
}
