package BookShop;


public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String author, String title, double price) {
        this.setAuthor(author);
        this.setTitle(title);
        this.setPrice(price);
    }

    private String getTitle() {
        return this.title;
    }

    private void setTitle(String title) {
        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid");
        }
        this.title = title;
    }

    private String getAuthor() {
        return this.author;
    }

    private void setAuthor(String author) {
        String[] tokens = author.trim().split("\\s+");
        if (tokens.length > 1) {
            if (Character.isDigit(tokens[1].charAt(0))) {
                throw new IllegalArgumentException("Author not valid!");
            }
        }
        this.author = author;
    }

    protected double getPrice() {
        return this.price;
    }

    private void setPrice(double price) {
        if (price == 0 || price < 0) {
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Type: " + this.getClass().getSimpleName() +
                System.lineSeparator() +
                "Title: " + this.getTitle() +
                System.lineSeparator() +
                "Author: " + this.getAuthor() +
                System.lineSeparator() +
                "Price: " + this.getPrice() +
                System.lineSeparator();
    }
}