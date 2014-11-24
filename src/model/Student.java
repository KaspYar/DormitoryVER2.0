package model;

public class Student extends Settler{
	public Student(){
		System.out.println("student created!");
	}
	public Student(ProfileStudent pf, int idRoom){
		this.profile = pf;
		this.idRoom = idRoom;
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMyRoom() {
		return idRoom;
	}

	@Override
	public String getMyDormitory() {
		return null;
	}

	@Override
	public int getTypeOfRoom() {
		// TODO Auto-generated method stub
		return 0;
	}

}
