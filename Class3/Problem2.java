class Library{
    String libraryName;

    void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
    void displayLibraryName(){
        System.out.println("Library Name : " + libraryName );
    }

}

class Section extends Library{
    String sectionName;

    void setSectionName(String sectionName) {
        this.sectionName=sectionName;
    }
    void displaySectionName() {
        System.out.println("Section Name : " + sectionName );
    }
}
class Book extends Section{
    String BookTitle;
    String authorName;

    void setBookDetails(String BookTitle, String authorName) {
        this.BookTitle=BookTitle;
        this.authorName=authorName;
    }
    void displayBookDetails() {
        System.out.println(" Book Title : " + BookTitle );
        System.out.println(" Author Name : " + authorName );

    }
}

public class Problem2 {
    public static void main(String[] args) {
        Book b = new Book();

        b.setLibraryName("Central Library");
        b.setSectionName("Computer Science ");
        b.setBookDetails("Data Structures","Mark Allen");

        b.displayLibraryName();
        b.displaySectionName();
        b.displayBookDetails();
    }
    
}
