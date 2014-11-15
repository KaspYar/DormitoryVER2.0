package model;

public abstract class Settler implements IUser {
	protected Profile profile;
	
	protected int idRoom;
	
	public abstract void pay();
	public abstract int getMyRoom();
	public abstract String getMyDormitory();
	public abstract int getTypeOfRoom();
	public Profile getProfile(){
		return profile;
	}
	
}
