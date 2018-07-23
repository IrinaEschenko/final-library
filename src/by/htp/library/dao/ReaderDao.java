package by.htp.library.dao;

import java.util.List;

import by.htp.library.entity.Book;

import by.htp.library.entity.Reader;

interface ReaderDao {
	public boolean authorize(Reader reader) ;
	
   List <Book> seeCatalog();
   Book read(int id) ;
	   
   }

