public class Main {
    public static void main(String[] args) {
        Employee E1 = new Employee("Vengence" , 007 , 80000);

        Employee E2 = new Employee();
        
        System.out.println("**********Employee 1 Details**********");
        E1.display();
        E1.yearlySalary();
        E1.yearlySalaryWithBonus();

        System.out.println("**********Employee 2 Details**********");
        E2.setName("Patrick");
        E2.setID(229);
        E2.setMonthlySalary(90000);
        E2.display();
        E2.yearlySalary();
        E2.yearlySalaryWithBonus();

    }
}
