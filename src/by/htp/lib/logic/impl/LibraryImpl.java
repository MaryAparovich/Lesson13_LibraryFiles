package by.htp.lib.logic.impl;

import by.htp.lib.bean.Catalog;
import by.htp.lib.logic.LibraryService;

public class LibraryImpl implements LibraryService {

	@Override
	public Catalog getMainCatalog() {
		Catalog catalog = new Catalog();
		return catalog;
	}

}
