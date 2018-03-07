package by.htp.lib.logic.impl;

import by.htp.lib.bean.Book;
import by.htp.lib.bean.Catalog;
import by.htp.lib.dao.BookDao;
import by.htp.lib.dao.impl.FileBookDao;
import by.htp.lib.logic.LibraryService;

public class CityLibraryServiceimpl implements LibraryService{

	private BookDao dao = new FileBookDao();

	@Override
	public Catalog getMainCatalog() {
		Catalog catalog = new Catalog();
		
		Book[] books = dao.readAll();
		catalog.setBooks(books);
		catalog.setTitle("HTP_TAT7");
		return catalog;
	}
	 
}
