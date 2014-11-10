package model;

import java.util.ArrayList;

public class Block {
private String blockId;
private Student master;
private ArrayList<Room> rooms;
private Integer freeRooms;
private Integer freeSpace;
public Block(String id){
	this.blockId = id;
	this.rooms = new ArrayList<Room>(4); 
}
public void changeMaster(Student mstr){
	this.master = mstr;
	return;
}
public Student getMaster() {
	return master;
}
public void setMaster(Student master) {
	this.master = master;
}
public String getBlockId() {
	return blockId;
}
public ArrayList<Room> getRooms() {
	return rooms;
}
public Integer getFreeRooms() {
	return freeRooms;
}
public Integer getFreeSpace() {
	return freeSpace;
}
}
