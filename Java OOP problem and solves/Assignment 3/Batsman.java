
import java.text.DecimalFormat;


public class Batsman extends Cricketer {
    private int totalRuns;
    private int innings;
    private int notOuts;

    Batsman(){

    }

    public Batsman(String name, int age, String team, int matches, int totalRuns, int innings, int notOuts){
        super(name,age,team,matches);
        setTotalRuns(totalRuns);
        setInnings(innings);
        setNotOuts(notOuts);
    }

    public void setTotalRuns(int totalRuns){
        if(totalRuns >= 0){
            this.totalRuns = totalRuns;
        }
        else{
            System.out.println("Invalid Number Entered!");
        }
    }
    public void setInnings(int innings){
        if(innings >= 0){
            this.innings = innings;
        }
        else{
            System.out.println("Invalid Innings!");
        }
    }
    public void setNotOuts(int notOuts){
        if(notOuts >= 0){
            this.notOuts = notOuts;
        }
        else{
            System.out.println("Invalid Number!");
        }
    }

    public int getTotalRuns(){
        return totalRuns;
    }
    public int getInnings(){
        return innings;
    }
    public int getNotOuts(){
        return notOuts;
    }


    public double avgRun(){
        
        double avg =(double) getTotalRuns() / (getInnings()- getNotOuts());
        return avg;
    }

    public void displayDetails(){
        System.out.println("******Batsman Details******");
        super.diplayDetails();
        System.out.println("Player's Total Run: " + totalRuns);
        System.out.println("Innings Played: " + innings);
        System.out.println("Not Out Innings: " + notOuts);
        DecimalFormat format = new DecimalFormat("#.00");
        System.out.println("Average Run: " + format.format(avgRun()));
    }
    
}
