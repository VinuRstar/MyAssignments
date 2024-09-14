package week1.day4;

public class Library {
	
	public void addBook() {
		
		System.out.println("Book added successfully");
		
	}
	
	public void issueBook() {
		
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {

		Library libraryManagement = new Library();
		libraryManagement.addBook();
		libraryManagement.issueBook();
	}

}
