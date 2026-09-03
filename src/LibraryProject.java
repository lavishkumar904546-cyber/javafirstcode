class library {
    String[] books;
    int no_of_books = 0;

    library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addbook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + "has been add");
    }

    void showbooks() {
        System.out.println("Available book");
        for (String book : this.books) {
            System.out.println("*" + book);
        }
    }
}
public class LibraryProject {
    public static void main(String[] args) {
        library centralibrary = new library();
        centralibrary.addbook("think add ");

    }
}
