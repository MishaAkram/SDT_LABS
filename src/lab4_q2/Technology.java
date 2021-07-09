package lab4_q2;

import java.util.ArrayList;
import java.util.List;

public class Technology implements BookGenre{
	private List<Book> books = new ArrayList<>();
	public void setBook() {
		books.add(new Book("'The Inovators' ","Technology"));
		books.add(new Book("'Steve Job' ","Technology"));
		books.add(new Book("'The Inevitable' ","Technology"));
	}

	@Override
	public void getBookList() {
		// TODO Auto-generated method stub
		for (Book i:books) {
			System.out.println(i.getName() + i.getGenre() );
		}

	}

}
