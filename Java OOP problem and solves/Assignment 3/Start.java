public class Start {
    public static void main(String[] args) {
        //Batsman b1 = new Batsman("Haise", 21, "Japan", 12, 780, 10, 8);
        Batsman b1 = new Batsman();
        b1.setName("Haise");
        b1.setAge(21);
        b1.setTeam("Japan");
        b1.setMatches(12);
        b1.setTotalRuns(780);
        b1.setInnings(10);
        b1.setNotOuts(8);
        b1.displayDetails();

        Batsman b2 = new Batsman("Aizen", 25, "Japan", 15, 1090, 14, 6);
        b2.displayDetails();

        //Bowler bo1 = new Bowler("Gojo", 22, "Germany", 25, 34, 689, 180);
        Bowler bo1 = new Bowler();
        bo1.setName("Gojo");
        bo1.setAge(21);
        bo1.setTeam("Germany");
        bo1.setMatches(25);
        bo1.setTotalWkts(34);
        bo1.setBallsBowled(689);
        bo1.setRunsConceded(180);
        bo1.displayDetails();

        Bowler bo2 = new Bowler("Sukuna", 22, "Germany", 30, 45, 790, 250);
        bo2.displayDetails();
        
        

        
        
    }
}
