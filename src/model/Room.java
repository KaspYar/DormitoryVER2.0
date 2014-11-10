package model;

import java.util.LinkedList;

public class Room {
private LinkedList<Student> inhabitans;
private int roomNumber;
private TypeOfRoom capacity;
private int free;
private String genderType;



public void addStudent(Student st){
	//
}

public void evictStudent(){
	//
}

public int getFree() {
	return free;
}


public LinkedList<Student> getInhabitans() {
	return inhabitans;
}

public int getRoomNumber() {
	return roomNumber;
}

public TypeOfRoom getCapacity() {
	return capacity;
}

public String getGenderType() {
	setFree(10);
	return genderType;
}

}




