

public class One{

    public static void main(String[] args){

        StoryBook sb1 = new StoryBook("12345", "Harry Potter", "J.K. Rowling", 25.99, 10, "Fantasy");

        
        StoryBook sb2 = new StoryBook("67890", "Percy Jackson", "Rick Riordan", 20.50, 5, "Mythology");

        TextBook tb1 = new TextBook("11111", "Mathematics", "John Doe", 15.99, 20, 10);
        TextBook tb2 = new TextBook("22222", "Physics", "Jane Smith", 18.50, 15, 12);

        sb1.showDetails();
        sb1.addQuantity(5);
        sb1.sellQuantity(3);
        sb1.showDetails();

        sb2.showDetails();
        sb2.sellQuantity(6);
        sb2.showDetails();

        tb1.showDetails();
        tb1.addQuantity(10);
        tb1.sellQuantity(5);
        tb1.showDetails();

        tb2.showDetails();
        tb2.sellQuantity(2);
        tb2.showDetails();

       
    }

}

