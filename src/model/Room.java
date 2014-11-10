package model;

import java.util.LinkedList;

public class Room {
private LinkedList<Student> inhabitans;
private int roomNumber;
private TypeOfRoom capacity;
private int free;
private String genderType;
private String attribute;


public void getInhabitans(){
	return inhabitans;
}
public void addStudent(Student){
	//
}

public void evictStudent(){
	//
}

public Integer getInhabitantBySurname(){
	//
}
public void getFree(){
	return free;
}
public void getCapacity(){
	return capacity;
}
public void getGender(){
	return this.genderType;
}
public void setGender(int gnd){
	this.genderType =  gnd;
}




