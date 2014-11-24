package model;

public class ProfileStudent extends Profile{
	public ProfileStudent(){
		System.out.println("Student profile crated!");
	}
	public ProfileStudent(String ln, String fn, String fan, String ssn){
		this.lastname = ln;
		this.fathername = fan;
		this.firstname = fn;
		this.ssn = ssn;
	}

}
