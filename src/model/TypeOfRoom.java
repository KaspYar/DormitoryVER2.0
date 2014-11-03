package model;

public abstract class TypeOfRoom {
public abstract int getCapacity();
public abstract void setPrice(int prc);
public abstract int getPrice();
}
class Single extends TypeOfRoom{
	private int capacity;
	private int price;
	public Single(){
		capacity = 1;
		price = 400;
	}
	public int getCapacity(){
		return capacity;
	}
	public void setPrice(int prc){
		this.price = prc;
	}
	public int getPrice(){
		return this.price;
	}
}

class Doubl extends TypeOfRoom{
	private int capacity;
	private int price;
	public Doubl(){
		capacity = 2;
		price = 300;
	}
	public int getCapacity(){
		return capacity;
	}
	public void setPrice(int prc){
		this.price = prc;
	}
	public int getPrice(){
		return this.price;
	}
}

class Tripple extends TypeOfRoom{
	private int capacity;
	private int price;
	public Tripple(){
		capacity = 3;
		price = 250;
	}
	public int getCapacity(){
		return capacity;
	}
	public void setPrice(int prc){
		this.price = prc;
	}
	public int getPrice(){
		return this.price;
	}
}

class Four extends TypeOfRoom{
	private int capacity;
	private int price;
	public Four(){
		capacity = 4;
		price = 250;
	}
	public int getCapacity(){
		return capacity;
	}
	public void setPrice(int prc){
		this.price = prc;
	}
	public int getPrice(){
		return this.price;
	}
}
