package oopslab4;
class Book //class
{
    String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    int bookId;
    String authorName;
    String session;
    
    
    Book(String name, int bookId, String authorName, String session) //constructor having 4 parameter
    {
        this.name = name;
        this.bookId = bookId;
        this.authorName = authorName;
        this.session = session;        
    }
    
    Book(String name, String authorName, String session)//constructor having 3 parameter
    {
        this.name = name;
        this.authorName = authorName;
        this.session = session;        
    }
}

public class BookRecord //main class
{
    private void detailsOfBook(Book book) //private method
    {
        System.out.println("Name of Book= "+ book.getName());
        System.out.println("Id of Book= "+ book.getBookId());
        System.out.println("Auther Name of Book= "+ book.getAuthorName());
        System.out.println("Session of Book= "+ book.getSession());
    }
    
    public static void main (String arg[]) //main block
    {
       // Creating object and providing some values by using parameterized constructor
        Book bookOne = new Book("OBJECT ORIENTED PROGRAMMING", 1001, "O.K", "2022");
        Book bookTwo = new Book("APPLIED STATICS", 1003, "K.G", "2016");
        
        Book bookThree = new Book("INTRO TO AI", "Q.U", "2019");
        
        BookRecord bookRecord = new BookRecord();
        bookRecord.detailsOfBook(bookOne);
        bookRecord.detailsOfBook(bookTwo);
        bookRecord.detailsOfBook(bookThree);
    }    
}