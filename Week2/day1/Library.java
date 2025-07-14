package Week2.day1;

public class Library {

	public static void main(String[] args) {
        Library stories = new  Library();
        String bookTitle  =stories.addBook("Room19");
		System.out.println("bookTitle :" +bookTitle  );
		stories.issueBook();
	}

	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

}
