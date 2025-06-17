public class Cricketer{
    private String name;
    private int age;
    private String team;
    private int matches;

    Cricketer(){

    }

    public Cricketer(String name, int age, String team, int matches){
        setName(name);
        setAge(age);
        setTeam(team);
        setMatches(matches);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
        else{
            System.out.println("Invalid Age!");
        }
    }
    public void setTeam(String team){
        this.team = team;
    }
    public void setMatches(int matches){
        if(matches >= 0){
            this.matches = matches;
        }
        else{
            System.out.println("Invalid Match Count!");
        }
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getTeam(){
        return team;
    }
    public int getMatches(){
        return matches;
    }


    public void diplayDetails(){
        
        System.out.println("Player Name: " + name);
        System.out.println("Player Age: " + age);
        System.out.println("Player's Team Name: " + team);
        System.out.println("Played Matches: " + matches);
    }
}