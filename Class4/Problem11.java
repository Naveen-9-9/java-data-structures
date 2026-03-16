class Book {
    private String title;
    private String author;
    private String isbn;
    private int totalCopies;
    private int copiesIssued;

    Book(String title, String author, String isbn, int totalCopies, int copiesIssued) {
        super();
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.totalCopies = totalCopies;
        this.copiesIssued=copiesIssued;
    }

    public String getTitle() {
        return title;
    }

    public void setTite() {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor() {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn() {
        this.isbn = isbn;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies() {
        this.totalCopies = totalCopies;
    }

    public int getCopiesIssued() {
        return copiesIssued;
    }

    public void setCopiesIssued() {
        this.copiesIssued = copiesIssued;
    }

    public void issueBook(int count) {
        if (copiesIssued+count <= totalCopies) 
            {
               copiesIssued += count;
            }
    }

    public void returnBook(int count) 
    {
        if (copiesIssued >= count) {
            copiesIssued -= count;
        }
    }

    public void displayBookInfo() {
        System.out.println("title :" + title);
        System.out.println("author :" + author);
        System.out.println("isbn :" + isbn);
        System.out.println("totalCopies :" + totalCopies);
        System.out.println("copiesIssued :" + copiesIssued);

    }
}

public class Problem11 {
    public static void main(String[] args) {
        Book b = new Book("Java", "bunny ", "ISBN1234", 10, 3);
        b.issueBook(2);
        b.returnBook(1);
        b.displayBookInfo();
    }
}
