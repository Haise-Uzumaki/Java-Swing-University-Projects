class TextBook extends Book implements BookOperations {
    private int standard;

    public TextBook() {}
    
    public TextBook(String isbn, String bookTitle, String authorName, double price, 
        int availableQuantity, int standard) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.standard = standard;
    }

    public void setStandard(int standard) { this.standard = standard; }
    public int getStandard() { return standard; }

    @Override
    public void showDetails() {
        System.out.println("TextBook Details:");
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getBookTitle());
        System.out.println("Author: " + getAuthorName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getAvailableQuantity());
        System.out.println("Standard: " + standard);
        System.out.println();
    }

    @Override
    public void addQuantity(int amount) {
        setAvailableQuantity(getAvailableQuantity() + amount);
        System.out.println(amount + " copies added to " + getBookTitle());
    }

    @Override
    public void sellQuantity(int amount) {
        if (getAvailableQuantity() >= amount) {
            setAvailableQuantity(getAvailableQuantity() - amount);
            System.out.println(amount + " copies sold of " + getBookTitle());
        } else {
            System.out.println("Insufficient quantity of " + getBookTitle());
        }
    }
}
