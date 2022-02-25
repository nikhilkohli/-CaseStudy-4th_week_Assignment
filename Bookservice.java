package com.ac.service;

import com.ac.Dao.Bookdao;
import com.ac.bean.Book;

public class Bookservice {
	
	
	public int addBookService(int bookId,String booktitle, float bookprice)
	{
		String bookgrade="";
		 if(bookprice <= 300)
		 {
			 bookgrade = "C";
		 }
		 else if(bookprice <= 600)
		 {
			 bookgrade = "B";
		 }
		 else
		 {
			 bookgrade = "A";
		 }
		
		 Bookdao pDAO = new Bookdao(); 
		 Book book = new Book(); 
		
		 
		 book.setBookId(bookId);
		 book.setBooktitle(booktitle);
		 book.setBookprice(bookprice);
		 book.setBookgrade(bookgrade);
		 
		 int updateResult = 0;
		 try
		 {
			 updateResult = pDAO.addBook(book); 
			 return updateResult; 
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.toString());
			 return 0;
		 }
		 
	}

}
