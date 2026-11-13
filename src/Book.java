public class Book {

    private int bookId;
    private String title;
    private String author;
    private boolean isIssued;
    private static int nextBookId=101;

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public Book (String title, String author){
        this.title=title;
        this.author=author;
        this.bookId=nextBookId++;
    }
    @Override
    public String toString(){
       return "Book Id: "+bookId+"\n"+"Title: "+title+"\n"+
               "Author: "+author+"\n"+"Book_Status: "+(isIssued ? "Issued": "Available");
    }
    public boolean issueBook(){
       if(!isIssued){
          return isIssued = true ;
       }
       return false ;
    }
    public boolean returnBook(){
       if(isIssued){
           isIssued = false ;
           return true ;
       }
       return false;
    }
}
