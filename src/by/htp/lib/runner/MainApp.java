package by.htp.lib.runner;

import by.htp.lib.bean.Book;
import by.htp.lib.bean.Catalog;
import by.htp.lib.logic.LibraryService;
import by.htp.lib.logic.impl.CityLibraryServiceimpl;

public class MainApp {

	public static void main(String[] args) {

		LibraryService service = new CityLibraryServiceimpl();
		Catalog booksCatalog = service.getMainCatalog();
		viewCatalog(booksCatalog);
	}
	
	private static void viewCatalog(Catalog catalog){
		for(Book book: catalog.getBooks()){
			System.out.println(book);
		}
	}
}
