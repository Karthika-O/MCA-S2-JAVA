import java.util.Scanner;

interface Sports 
{
    void displaySportsScore();
}

class Student 
{
    String name;
    int academicScore;

    Student(String name, int academicScore) 
    {
        this.name = name;
        this.academicScore = academicScore;
    }

    void displayAcademicScore() 
    {
        System.out.println("Academic score of " + name + ": " + academicScore);
    }
}

class Result extends Student implements Sports 
{
    int sportsScore;

    Result(String name, int academicScore, int sportsScore) 
{
        super(name, academicScore);
        this.sportsScore = sportsScore;
    }

    public void displaySportsScore()
 {
        System.out.println("Sports score: " + sportsScore);
    }

    void displayResults()
 {
        displayAcademicScore();
        displaySportsScore();
    }
}

public class ResultInterface
 {
    public static void main(String[] args) 
     {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = s.nextLine();

        System.out.print("Enter student's academic score: ");
        int academicScore = s.nextInt();

        System.out.print("Enter student's sports score: ");
        int sportsScore = s.nextInt();

        Result studentResult = new Result(name, academicScore, sportsScore);
        studentResult.displayResults();
    }
}