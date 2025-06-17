public class StoryBook extends Book implements BookOperations{
    
    private String category;

    public StoryBook() {}
    
    public StoryBook(String isbn, String bookTitle, String authorName, double price, 
        int availableQuantity, String category) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.category = category;
    }

    public void setCategory(String category) { this.category = category; }
    public String getCategory() { return category; }

    @Override
    public void showDetails() {
        System.out.println("StoryBook Details:");
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getBookTitle());
        System.out.println("Author: " + getAuthorName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getAvailableQuantity());
        System.out.println("Category: " + category);
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
