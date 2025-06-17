public class Start {
    public static void main(String[] args) {
        BookShop shop = new BookShop("AIUB Book Store");

       
        StoryBook sb1 = new StoryBook("ISBN001", "The Hobbit", "J.R.R. Tolkien", 29.99, 10, "Fantasy");
        StoryBook sb2 = new StoryBook("ISBN002", "Harry Potter", "J.K. Rowling", 39.99, 15, "Fantasy");
        StoryBook sb3 = new StoryBook("ISBN003", "The Alchemist", "Paulo Coelho", 24.99, 8, "Fiction");
        StoryBook sb4 = new StoryBook("ISBN004", "1984", "George Orwell", 19.99, 12, "Dystopian");
        StoryBook sb5 = new StoryBook("ISBN005", "Pride and Prejudice", "Jane Austen", 14.99, 20, "Romance");

        TextBook tb1 = new TextBook("ISBN006", "Calculus", "James Stewart", 89.99, 5, 12);
        TextBook tb2 = new TextBook("ISBN007", "Physics", "David Halliday", 79.99, 7, 11);
        TextBook tb3 = new TextBook("ISBN008", "Chemistry", "Raymond Chang", 69.99, 6, 10);
        TextBook tb4 = new TextBook("ISBN009", "Biology", "Neil Campbell", 99.99, 4, 12);
        TextBook tb5 = new TextBook("ISBN010", "Java Programming", "Herbert Schildt", 59.99, 8, 11);

   
        System.out.println("Inserting books...");
        shop.insertBook(sb1);
        shop.insertBook(sb2);
        shop.insertBook(sb3);
        shop.insertBook(sb4);
        shop.insertBook(sb5);
        shop.insertBook(tb1);
        shop.insertBook(tb2);
        shop.insertBook(tb3);
        shop.insertBook(tb4);
        shop.insertBook(tb5);

        
        shop.showAllBooks();

        
        sb1.addQuantity(5);
        sb1.showDetails();
        sb1.sellQuantity(3);
        sb1.showDetails();

        tb1.addQuantity(10);
        tb1.showDetails();
        tb1.sellQuantity(7);
        tb1.showDetails();

        
        System.out.println("\nSearching for book with ISBN001...");
        Book foundBook = shop.searchBook("ISBN001");
        if (foundBook != null) {
            foundBook.showDetails();
        } else {
            System.out.println("Book not found!");
        }

        
        System.out.println("\nRemoving book with ISBN001...");
        shop.removeBook(sb1);
        shop.showAllBooks();
    }
}