package model;

import java.util.LinkedList;

public class Dormitory {
private String adress;
private String phone;
private LinkedList<Block> blocks;
//private Comendant comendant;
public Dormitory(String adr, String phone/*, Comendant cmd*/){
	this.adress = adr;
	this.phone = phone;
	this.blocks = new LinkedList<Block>();
	
	//this.comendant = cmd;	
}
public String getAdress() {
	return adress;
}
public String getPhone(){
	return phone;
}
/*
 public void setComendant(Comendant cmd){
 this.comendant = cmd;
 }
 */
}
