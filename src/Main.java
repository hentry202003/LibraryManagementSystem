import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice = 0 ;

        while(choice!=7){

            System.out.println("\n=================================");
            System.out.println("### Library Management System ###");
            System.out.println("==================================");

            System.out.println("Select the functions below 1-7");
            System.out.println("1.Add Book");
            System.out.println("2.Remove Book");
            System.out.println("3.Display All Books");
            System.out.println("4.Search Books By Title");
            System.out.println("5.Issue Book");
            System.out.println("6.Return Book");
            System.out.println("7.Exit");
            System.out.println("\nSelect Your Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){

                case 1:
                    System.out.print("Enter the Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter the Author name: ");
                    String author = sc.nextLine();
                    library.addBook(title,author);
                    break;
                case 2:
                    System.out.print("Enter the Book Title: ");
                    title = sc.nextLine();
                    library.removeBook(title);
                    break;
                case 3:
                    library.displayAllBooks();
                    break;
                case 4:
                    System.out.print("Enter the Book Title: ");
                    title = sc.nextLine();
                    library.searchBookByTitle(title);
                    break;
                case 5:
                    System.out.println("Select: 1 OR 2");
                    System.out.println("1.Enter book title");
                    System.out.println("2.Enter book id");
                    int option = sc.nextInt();
                    String bookTitle = "";
                    int bookId = 0;
                        sc.nextLine();
                    if(option==1){
                        System.out.println("1.Enter book title");
                        bookTitle = sc.nextLine();
                    }
                    else if(option==2){
                        System.out.println("2.Enter book id");
                        bookId = sc.nextInt();
                        sc.nextLine();
                    }
                    else{
                        System.out.println("select 1 OR 2 Only");
                        continue;
                    }
                    library.issueBook(bookTitle,bookId);
                    break;
                case 6:
                    System.out.println("Select: 1 OR 2");
                    System.out.println("1.Enter the book title");
                    System.out.println("2.Enter the book id");
                    option = sc.nextInt();
                    bookTitle = "";
                    bookId = 0;
                    sc.nextLine();
                    if(option==1){
                        System.out.println("1.Enter book title");
                        bookTitle = sc.nextLine();
                    }
                    else if(option==2){
                        System.out.println("2.Enter book id");
                        bookId = sc.nextInt();
                        sc.nextLine();
                    }
                    else{
                        System.out.println("select 1 OR 2 Only");
                        continue;
                    }
                    library.returnBook(bookTitle,bookId);
                    break;
                case 7:
                    System.out.println("Thank You!!!");
                    break;
                default:
                    System.out.println("Select the choice between 1-7");
            }
        }
        sc.close();
    }
}
