package Book;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book firstBook = new Book("Animal Farm",2008,"Geo Milev","Ivan Vazov");
        Book secondBook = new Book("The Document in the case",2000,"Luben Karavelov");
        Book thirdBook = new Book("The document in the case",1996,"Svetlin Nakov");
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(firstBook);
        bookList.add(secondBook);
        bookList.add(thirdBook);
        bookList.sort(new BookComparator());
        for (Book book : bookList) {
            System.out.println(book.getTitle() + book.getYear());
        }
    }
}
