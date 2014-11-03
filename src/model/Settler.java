package model;

public abstract class Settler implements IUser {
	public abstract void pay();
	public abstract int getMyRoom();
	public abstract String getMyDormitory();
	public abstract int getTypeOfRoom();
}
