package model;

public class ProfileCommandant extends Profile{
	public ProfileCommandant(){
		System.out.println("Commandant Profile created!");
	}
	public ProfileCommandant(String ln, String fn, String fan, String ssn){
		this.lastname = ln;
		this.fathername = fan;
		this.firstname = fn;
		this.ssn = ssn;
	}

}
