package model;

public class Worker extends Settler{
public Worker(){
	System.out.println("Worker craeted!");
}

@Override
public void pay() {
	System.out.println("Worker pay");
	
}

@Override
public int getMyRoom() {
	System.out.println("Worker get room");
	return 0;
}

@Override
public String getMyDormitory() {
	String res = "Worker Dormitory info";
	return res;
}

@Override
public int getTypeOfRoom() {
	System.out.println("Worker getTypeOfroom");
	return 0;
}
}
