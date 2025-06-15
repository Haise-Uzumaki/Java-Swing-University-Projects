import java.util.Scanner;

public class Quiz {
    
    public static void main(String[] args){

                //JAVA QUIZ GAME

        String[] questions = {"What is the main function of a router?" ,
                              "Which part of the computer is considered the brain?", "What year was Facebook Launched?",
                              "Who is known as the father of computer?",
                              "What was the first programming language?"};

        String[][] options = {{"1.Storing files","2.Encrypting Data","3.Directing interenet Traffic","Managing Password"},
                            {"1.CPU","2.Hard Drive","3.Ram","4.GPU"},
                            {"1.2000","2.2004","3.2006","4.2008"},
                            {"1.Steve Jobs","2.Bill Gates","3.Alan Turing","4.Charles Babbage"},
                            {"1.COBOL","2.C","3.Fortran","4.Assemble"},
                            };

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

                System.out.println("******************************");
                System.out.println("Welcome to the Java Quiz Game!");
                System.out.println("******************************");
                
                    
                for(int i=0; i < questions.length; i++){
                    System.out.println(questions[i]);

                    for(String option : options[i]){
                        System.out.println(option);
                    }

                    System.out.print("Enter Your Guess: ");
                    guess = scanner.nextInt();

                    if(guess == answers[i]){
                        
                        System.out.println("**********Correct Answer**********");
                        score++;
                    }
                    else {
                        
                        System.out.println("**********Wrong**********");
                    }
                }
        
                System.out.println("Your Score is: " +score+ "Out of " +questions.length);
        
        
        
        scanner.close();
    }

}
