package com.ac.Ui;

import java.util.Scanner;

import com.ac.service.Bookservice;

public class Bookui {

	public static void main(String[] args) 
	{	int bookId=0;
		String booktitle="";
		float bookprice=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Book Id");
			bookId = s.nextInt();
			System.out.println("Enter Book Titile");
			booktitle = s.next();	
			System.out.println("Enter Book price");
			bookprice = s.nextFloat();
			Bookservice bookService = new Bookservice(); 
			   int updateCount = bookService.addBookService(bookId, booktitle, bookprice);
	  
			System.out.println("inserted "+updateCount+" record   Success");
			
	} 
}
