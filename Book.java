package com.ac.bean;

import java.io.Serializable;

public class Book implements Serializable {
	
	private int bookId;
	private String booktitle;
	private float bookprice;
	private String bookgrade;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public float getBookprice() {
		return bookprice;
	}
	public void setBookprice(float bookprice) {
		this.bookprice = bookprice;
	}
	public String getBookgrade() {
		return bookgrade;
	}
	public void setBookgrade(String bookgrade) {
		this.bookgrade = bookgrade;
	}
	
	

	
	

}
