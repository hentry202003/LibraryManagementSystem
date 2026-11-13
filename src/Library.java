import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title,String author){
        Book book = new Book(title,author);
        books.add(book);
        System.out.println("\n"+book.getTitle() +" book added successfully");
        System.out.println("\n"+book);
    }
    public void removeBook(String title){
        if(books.isEmpty()){
            System.out.println("Library is Empty");
            return;
        }
        boolean found = false;
        for(int i =0;i<books.size();i++){

            if(books.get(i).getTitle().equalsIgnoreCase(title)){
                found = true;
                System.out.println(books.get(i).getTitle()+" book removed successfully");
                books.remove(books.get(i));
                break;
            }

        }
        if(!found){
            System.out.println("Matched Book doesn't Exist");
        }
    }
    public void displayAllBooks(){
        if(books.isEmpty()){
            System.out.println("Library is Empty");
            return;
        }
        for(Book book :books){
            System.out.println("\n"+book);
        }
    }
    public void searchBookByTitle(String title){
        if(books.isEmpty()){
            System.out.println("Library is Empty");
            return;
        }
        boolean found = false;
        for(int i=0;i<books.size();i++){

            if(books.get(i).getTitle().equalsIgnoreCase(title)){
                found = true;
                System.out.println(books.get(i));
                break;
            }
        }
        if(!found){
            System.out.println("Matched Book doesn't Exist");
        }
    }
    public void issueBook(String title , int bookId){
        if(books.isEmpty()){
            System.out.println("Library is Empty");
            return;
        }
        boolean found = false;
        for(int i=0;i<books.size();i++){

            if(books.get(i).getTitle().equalsIgnoreCase(title)||books.get(i).getBookId()==bookId){

                found = true;

                if (books.get(i).issueBook()) {
                    System.out.println("Book issued successfully");
                }
                else {
                    System.out.println("Book is already issued");
                }
                break;
            }
        }
        if(!found){
            System.out.println("Matched Book doesn't Exist");
        }
    }
    public void returnBook(String title,int bookId){
        if(books.isEmpty()){
            System.out.println("Library is Empty");
            return;
        }
        boolean found = false;
        for(int i=0;i<books.size();i++){

            if(books.get(i).getTitle().equalsIgnoreCase(title)||books.get(i).getBookId()==bookId){

                found = true;

                if (books.get(i).returnBook()) {
                    System.out.println("Book returned successfully");
                }
                else {
                    System.out.println("Book is already available");
                }
                break;
            }
        }
        if(!found){
            System.out.println("Matched Book doesn't Exist");
        }
    }
}
