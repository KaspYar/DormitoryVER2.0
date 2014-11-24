package model;

public class Commandant implements IUser{
	protected Profile profile;
	protected int idDormitory;
	
	public Commandant(){
		System.out.println("commandant created");
	}
	
	public Commandant(Profile p, int idD){
		this.profile = p;
		this.idDormitory = idD;
	}
	
	public Profile getProfile(){
		return profile;
	}
	public int getIdDormitory(){
		return idDormitory;
	}
}
