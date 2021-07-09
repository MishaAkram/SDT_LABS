package lab4_q2;

import java.util.ArrayList;
import java.util.List;

public class Fiction implements BookGenre {
	private List<Book> books = new ArrayList<>();
	public void setBook() {
		books.add(new Book("'Circle' " ,"Fiction"));
		books.add(new Book("'The AlChemist' ","Fiction"));
		books.add(new Book("'Home going at the Road' ","Fiction"));
	}

	@Override
	public void getBookList() {
		// TODO Auto-generated method stub
		for (Book i:books) {
			System.out.println(i.getName() + i.getGenre() );
		}

	}

}
