package Week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		Library stories = new  Library();
        String bookTitle  = stories.addBook("Room19");
		System.out.println("bookTitle :" +bookTitle  );
		stories.issueBook();

	}

}
