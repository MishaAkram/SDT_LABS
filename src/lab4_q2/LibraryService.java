package lab4_q2;

public class LibraryService {
	public void fictionBookBorrow() {
		BookGenre borrow = new Fiction();
		borrow.setBook();
		borrow.getBookList();
	}
	public void nonfictionBookBorrow() {
		BookGenre borrow = new Non_Fiction();
		borrow.setBook();
		borrow.getBookList();
	}
	public void technologyBookBorrow() {
		BookGenre borrow = new Technology();
		borrow.setBook();
		borrow.getBookList();
	}

}
