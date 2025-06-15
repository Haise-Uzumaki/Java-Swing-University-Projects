class Student {
    private String id;
    private String name;
    private double cgpa;

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getCgpa(){
        return cgpa;
    }

    public static void main(String[] args) {
        
        Student student1 = new Student();

        student1.setId("24-59246-3");
        student1.setName("Haise Uzumaki");
        student1.setCgpa(2.99);

        System.out.println("******Student Details******");
        System.out.println("ID: " + student1.getId());
        System.out.println("Name: " + student1.getName());
        System.out.println("Student's Cgpa: " + student1.getCgpa());
    }
}
