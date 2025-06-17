public class Teacher {
    private String name;
    private int id;
    private double salary;

    Teacher(){
        
    }

    public Teacher(String name, int id, double salary) {
        setName(name);
        setID(id);
        setSalary(salary);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setID(int id){
        this.id = id;
    }

    public void setSalary(double salary){
        if(salary > 0){
            this.salary = salary;
        }
        else {
            System.out.println("Invalid Salary!!");
        }
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public double getSalary(){
        return salary;
    }

    public void yearlySalary(){
        double YS = salary * 12;
        System.out.println("Yearly Salary: " + YS);
    }

    public void yearlySalaryWithBonus(){
        double yearlySalary = salary * 12;
        double totalBonus = 2 * (0.5 * salary);
        double YSWB = yearlySalary + totalBonus;
        System.out.println("Yearly Salary: " + yearlySalary);
        System.out.println("Yearly Salary With Bonus: " + YSWB);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: "  + id);
        System.out.println("Salary: " + salary);
        yearlySalaryWithBonus();
    }
    

}
