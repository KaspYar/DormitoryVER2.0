package model;

import java.util.LinkedList;

public class Dormitory {
private String adress;
private String phone;
private LinkedList<Block> blocks;
private int commandantId;
private Integer freePlaces;
private Integer freeRooms;

public Dormitory(){
	System.out.println("Dormitory is created");
}
public Dormitory(String adr, String phone, int cmdId){
	this.adress = adr;
	this.phone = phone;
	this.blocks = new LinkedList<Block>();
	
	this.commandantId = cmdId;	
}
public String getAdress() {
	return adress;
}
public String getPhone() {
	return phone;
}

 public void setComendant(int cmdId){
 this.commandantId = cmdId;
 }
 
}
