class TextBook extends Book {
    private int standard;

    public TextBook() {}

    public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.standard = standard;
    }

    public void setStandard(int standard) { 
        this.standard = standard; 
    }

    
    public int getStandard() { 
        return standard; 
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Standard: " + standard);
    }
}