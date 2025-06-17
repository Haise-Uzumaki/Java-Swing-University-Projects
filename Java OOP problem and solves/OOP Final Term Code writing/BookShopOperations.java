public interface BookShopOperations {
    boolean insertBook(Book b);
    boolean removeBook(Book b);
    void showAllBook();
    Book searchBook(String isbn);
}
