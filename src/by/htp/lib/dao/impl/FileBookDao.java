package by.htp.lib.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import by.htp.lib.bean.Author;
import by.htp.lib.bean.Book;
import by.htp.lib.dao.BookDao;

public class FileBookDao implements BookDao {
	private static final String FILE_PATH = "resourses/file.txt";

	@Override
	public Book[] readAll() {

		Book[] books = new Book[5];
		books[0] = new Book();
		books[1] = new Book();
		books[2] = new Book();
		books[3] = new Book();
		books[4] = new Book();

		String str;
		try (BufferedReader file = new BufferedReader(new FileReader(FILE_PATH))) {
			str = null;
			int i = 0;
			while ((str = file.readLine()) != null && (i < books.length)) {
				String[] bookStr = str.split(", ");
				books[i].setId(Integer.valueOf(bookStr[0]));
				books[i].setTitle(bookStr[1]);
				books[i].setYear(Integer.valueOf(bookStr[2]));
				Author author = new Author();
				author.setName(bookStr[3]);
				author.setSurname(bookStr[4]);
				books[i].setAuthor(author);
				i++;
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		return books;
	}
}
