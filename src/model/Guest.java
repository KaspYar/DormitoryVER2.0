package model;

public class Guest extends Settler{
public Guest(){
	System.out.println("Guest created");
}

@Override
public void pay() {
	System.out.println("Guest pay");
	
}

@Override
public int getMyRoom() {
	System.out.println("Guest get Room");
	return 0;
}

@Override
public String getMyDormitory() {
	String res = "Guest Dormitory";
	return res;
}

@Override
public int getTypeOfRoom() {
	System.out.println("Guets getTypeOfRoom");
	return 0;
}
}
