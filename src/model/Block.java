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
}
