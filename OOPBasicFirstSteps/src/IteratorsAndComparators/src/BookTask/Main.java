package BookTask;


public class Main {
    public static void main(String[] args) {
        Book book = new Book("Animal Farm",2003,"George Owel");
        Book book1 = new Book("The document in the case",2005);
        Book book2 = new Book("The document in the case",1970,"Dorothy Sayers","Robert Eustace");

      Library<Book> bookLibrary = new Library<>(book,book1,book2);
        for (Book book3 : bookLibrary) {
            System.out.println(book3.getTitle());
        }

    }


   /* public static void printBook(List<Book> books){
        for (Book book : books) {
            System.out.println(String.format("Title - %s,Year - %s,Authors - %s",book.getTitle(),book.getYear(),book.getAuthors()));
        }
    }
    */

}
