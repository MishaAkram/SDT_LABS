package lab4_q2;

public class BookGenreClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryService libraryService=new LibraryService();
		libraryService.fictionBookBorrow();
		System.out.println();
		libraryService.nonfictionBookBorrow();
		System.out.println();
		libraryService.technologyBookBorrow();

	}

}
