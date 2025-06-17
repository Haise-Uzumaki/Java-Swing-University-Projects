public class Student {
    private String name;
    private int id;
    private double cgpa;

    Student(){
        
    }

    public Student(String name, int id, double cgpa) {
        setName(name);
        setID(id);
        setCgpa(cgpa);
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void  setID(int id){
        this.id = id;
    }

    public void setCgpa(double cgpa){
        if(cgpa >= 0 && cgpa <= 4){
            this.cgpa = cgpa;
        }
        else{
            System.out.println("Invalid Cgpa! Assign Valid Information.");
        }
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public  double getCgpa(){
        return cgpa;
    }

    public  void checkScholarship(){
        if(cgpa >= 3.75){
            System.out.println("The student is a scholarship student.");
        }
        else{
            System.out.println("The Student Is not eligible for Schoalrship");
        }
    }

    public void display(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Id: " + id);
        System.out.println("CGPA: " + cgpa);
        checkScholarship();
    }

}
