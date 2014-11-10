package model;

import java.util.Date;

public class Living {
	private Date dateTo;
	private Date dateFrom;
	private Double price;
	private Integer room;
	private Settler settler;
	
	
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Integer getRoom() {
		return room;
	}
	public void setRoom(Integer room) {
		this.room = room;
	}
	public Settler getSettler() {
		return settler;
	}
	public void setSettler(Settler settler) {
		this.settler = settler;
	}
	public Double getPrice() {
		return price;
	}
}
