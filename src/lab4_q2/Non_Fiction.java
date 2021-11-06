package lab4_q2;

import java.util.ArrayList;
import java.util.List;

public class Non_Fiction implements BookGenre {

	private List<Book> books = new ArrayList<>();
	public void setBook() {
		books.add(new Book("'Cold Blood' ","Non Fiction"));
		books.add(new Book("'Into Thin Air' ","Non Fiction"));
		books.add(new Book("'Say Nothing' ","Non Fiction"));
	}

	@Override
	public void getBookList() {
		// TODO Auto-generated method stub
		for (Book i:books) {
			System.out.println(i.getName() + i.getGenre() );
		}

	}

}
