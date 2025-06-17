class BookShop extends Book implements BookShopOperations {
    private String name;
    private Book[] listOfBooks;
    private int bookCount;

    public BookShop() {
        listOfBooks = new Book[100];
        bookCount = 0;
    }

    public BookShop(String name) {
        this.name = name;
        listOfBooks = new Book[100];
        bookCount = 0;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    @Override
    public boolean insertBook(Book b) {
        if (bookCount < listOfBooks.length) {
            listOfBooks[bookCount] = b;
            bookCount++;
            return true;
        }
        return false;
    }

    @Override
    public boolean removeBook(Book b) {
        for (int i = 0; i < bookCount; i++) {
            if (listOfBooks[i] == b) {
                listOfBooks[i] = listOfBooks[bookCount - 1];
                listOfBooks[bookCount - 1] = null;
                bookCount--;
                return true;
            }
        }
        return false;
    }

    public void showAllBooks() {
        System.out.println("\nBooks in " + name + ":");
        for (int i = 0; i < bookCount; i++) {
            listOfBooks[i].showDetails();
        }
    }

    @Override
    public Book searchBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (listOfBooks[i].getIsbn().equals(isbn)) {
                return listOfBooks[i];
            }
        }
        return null;
    }

    @Override
    public void showDetails(){
        
    }

    @Override
    public void showAllBook() {
      
    }
}