package model;

public abstract class TypeOfRoom {
	protected int capacity;
	protected int price;
public abstract int getCapacity();
public abstract void setPrice(int prc);
public abstract int getPrice();
}
class Single extends TypeOfRoom{	
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
