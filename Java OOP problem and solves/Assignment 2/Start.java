import java.util.Scanner;

public class Start {
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //student 1
        System.out.print("Enter The name of Student 1: ");
        String name = scanner.next();
        System.out.print("Enter The Id of Student 1: ");
        int id = scanner.nextInt();
        System.out.print("Enter The CGPA of Student 1: ");
        double cgpa = scanner.nextDouble();

        

        //student 2
        System.out.print("Enter The name of Student 2: ");
        String name2 = scanner.next();
        System.out.print("Enter The Id of Student 2: ");
        int id2 = scanner.nextInt();
        System.out.print("Enter The CGPA of Student 2: ");
        double cgpa2 = scanner.nextDouble();

        

        //student 3
        System.out.print("Enter The name of Student 3: ");
        String name3 = scanner.next();
        System.out.print("Enter The Id of Student 3: ");
        int id3 = scanner.nextInt();
        System.out.print("Enter The CGPA of Student 3: ");
        double cgpa3 = scanner.nextDouble();

        
        

        //student 4
        System.out.print("Enter The name of Student 4: ");
        String name4 = scanner.next();
        System.out.print("Enter The Id of Student 4: ");
        int id4 = scanner.nextInt();
        System.out.print("Enter The CGPA of Student 4: ");
        double cgpa4 = scanner.nextDouble();

        

        //student 5
        System.out.print("Enter The name of Student 5: ");
        String name5 = scanner.next();
        System.out.print("Enter The Id of Student 5: ");
        int id5 = scanner.nextInt();
        System.out.print("Enter The CGPA of Student 5: ");
        double cgpa5 = scanner.nextDouble();


        


        //teacher 1
        System.out.print("Enter The name of Teacher 1: ");
        String name6 = scanner.next();
        System.out.print("Enter The Id of Teacher 1: ");
        int id6 = scanner.nextInt();
        System.out.print("Enter The Salary of Teacher 1: ");
        double salary1 = scanner.nextDouble();

        

        //teacher 2
        System.out.print("Enter The name of Teacher 2: ");
        String name7 = scanner.next();
        System.out.print("Enter The Id of Teacher 2: ");
        int id7 = scanner.nextInt();
        System.out.print("Enter The Salary of Teacher 2: ");
        double salary2 = scanner.nextDouble();

        

        //teacher 3
        System.out.print("Enter The name of Teacher 3: ");
        String name8 = scanner.next();
        System.out.print("Enter The Id of Teacher 3: ");
        int id8 = scanner.nextInt();
        System.out.print("Enter The Salary of Teacher 3: ");
        double salary3 = scanner.nextDouble();

        

        //teacher 4
        System.out.print("Enter The name of Teacher 4: ");
        String name9 = scanner.next();
        System.out.print("Enter The Id of Teacher 4: ");
        int id9 = scanner.nextInt();
        System.out.print("Enter The Salary of Teacher 4: ");
        double salary4 = scanner.nextDouble();

        

        //teacher 5
        System.out.print("Enter The name of Teacher 5: ");
        String name10 = scanner.next();
        System.out.print("Enter The Id of Teacher 5: ");
        int id10 = scanner.nextInt();
        System.out.print("Enter The Salary of Teacher 5: ");
        double salary5 = scanner.nextDouble();



        Student student1 = new Student(name , id , cgpa);
        Student student2 = new Student(name2, id2, cgpa2);
        Student student3 = new Student(name3, id3, cgpa3);
        Student student4 = new Student(name4, id4, cgpa4);
        Student student5 = new Student(name5, id5, cgpa5);
        
        Student students[] = new Student[]{student1, student2,student3, student4, student5};

        System.out.println("*****Informations Of Students***** ");
        for(int i=0; i<students.length; i++){
            if(students[i] != null){
                System.out.println("**********");
                students[i].display();
                System.out.println("**********");
            }
            else{
                System.out.println("Student " + i + " Information Not Available");
            }
        }


        Teacher teacher1 = new Teacher(name6, id6, salary1);
        Teacher teacher2 = new Teacher(name7, id7, salary2);
        Teacher teacher3 = new Teacher(name8, id8, salary3);
        Teacher teacher4 = new Teacher(name9, id9, salary4);
        Teacher teacher5 = new Teacher(name10, id10, salary5);


        

        Teacher teachers[] = new Teacher[]{teacher1, teacher2, teacher3, teacher4, teacher5};

        System.out.println("*****Informations Of Teachers*****");
        for(int j=0; j<teachers.length; j++){
            if(teachers[j] != null){
                System.out.println("**********");
                teachers[j].display();
                System.out.println("**********");
                
            }
            else{
                System.out.println("Teacher " + j + " Information Not Available");
            }
        }
        

        scanner.close();
    }

}
