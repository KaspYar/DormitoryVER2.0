package model;

public class Request {
	String status = "Unpayed";
	public Request(){
		System.out.println("Request created");
	}
	public String getStatus(){
		return status;
	}
	public void setStatus(String str){
		status = str;
	}
}
