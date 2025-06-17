import java.text.DecimalFormat;

public class Bowler extends Cricketer{
    private int totalWkts;
    private int ballsBowled;
    private int runsConceded;

    public Bowler(){

    }

    public Bowler(String name, int age, String team, int matches, int totalWkts, int ballsBowled, int runsConceded){
        super(name,age,team,matches);
        setTotalWkts(totalWkts);
        setBallsBowled(ballsBowled);
        setRunsConceded(runsConceded);
    }

    public void setTotalWkts(int totalWkts){
        if(totalWkts >= 0){
            this.totalWkts = totalWkts;
        }
        else{
            System.out.println("Invalid Wickets!");
        }
    }
    public void setBallsBowled(int ballsBowled){
        if(ballsBowled >= 0){
            this.ballsBowled = ballsBowled;
        }
        else{
            System.out.println("Invalid Numbers Of Balls Bowled!");
        }
    }
    public void setRunsConceded(int runsConceded){
        if(runsConceded >= 0){
            this.runsConceded = runsConceded;
        }
        else{
            System.out.println("Invalid Number Of Runs Conceded!");
        }
    }

    public int getTotalWkts(){
        return totalWkts;
    }
    public int getBallsBowled(){
        return ballsBowled;
    }
    public int getRunsConceded(){
        return runsConceded;
    }

    public double avgWkt(){
        double avgW =(double) getTotalWkts() / getMatches();
        return avgW;
    }

    public double economyRate(){
        double economy =(double) (getRunsConceded()*6)/getBallsBowled();
        return economy;
    }

    public void displayDetails(){
        System.out.println("*****Bowler Details*****");
        super.diplayDetails();
        DecimalFormat format = new DecimalFormat("#.00");
        System.out.println("Total Wickets Taken: " + totalWkts);
        System.out.println("Balls Bowled: " + ballsBowled);
        System.out.println("Runs Conceded: " + runsConceded);
        System.out.println("Bowling average: " + format.format(avgWkt()));
        System.out.println("Economy Rate: " + format.format(economyRate()));
    }
}
