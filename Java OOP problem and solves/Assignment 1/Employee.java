 public class Employee {
    private String name;
    private int id;
    private double monthlySalary;

    Employee(){
        System.out.println("Empty Constructor Called!");
    }

    public Employee(String name, int id, double monthlySalary) {
           this.name = name;
           this.id = id;
           this.monthlySalary = monthlySalary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setID(int id){
        this.id = id;
    }

    public void setMonthlySalary(double monthlySalary){
        if(monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
        else{
            System.out.println("Invalid Salary!");
        }
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

    public double getMonthlySalary(){
        return monthlySalary;
    }

    public void display(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee's MonthlySalary: " + monthlySalary);
    }

    public void yearlySalary(){
        double YS = monthlySalary * 12;
        System.out.println("Employee's Yearly Salary: " + YS);
    }

    public void yearlySalaryWithBonus(){
        double yearlySalary = monthlySalary * 12;
        double totalBonus = 2 * (0.3 * monthlySalary);
        double YSWB = yearlySalary + totalBonus;
        System.out.println("Employee's Yearly Salary With Bonus: " + YSWB);
    }



}