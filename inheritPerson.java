/* Question 10.
Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor to initialize the data members and another class ‘Employee’ that inherits the properties of class Person and also contains its own data members like Empid, Company_name, Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits the properties of class Employee and contains its own data members like Subject, Department, Teacherid and also contain constructors and methods to display the data members. Use array of objects to display details of N teachers.
*/

import java.util.Scanner;
class Person 
{
    String Name;
    String Gender;
    String Address;
    int Age;

    public Person(String name, String gender, String address, int age) 
{
        this.Name = name;
        this.Gender = gender;
        this.Address = address;
        this.Age = age;
    }
}

class Employee extends Person 
{
    int Empid;
    String Company_name;
    String Qualification;
    double Salary;

    public Employee(String name, String gender, String address, int age, int empid, String company_name, String qualification, double salary) 
{
        super(name, gender, address, age);
        this.Empid = empid;
        this.Company_name = company_name;
        this.Qualification = qualification;
        this.Salary = salary;
    }
}

class Teacher extends Employee 
{
    String Subject;
    String Department;
    int Teacherid;

    public Teacher(String name, String gender, String address, int age, int empid, String company_name, String qualification, double salary, String subject, String department, int teacherid) 
{
        super(name, gender, address, age, empid, company_name, qualification, salary);
        this.Subject = subject;
        this.Department = department;
        this.Teacherid = teacherid;
    }

    public void displayDetails() 
{
        System.out.println("Name: " + Name);
        System.out.println("Gender: " + Gender);
        System.out.println("Address: " + Address);
        System.out.println("Age: " + Age);
        System.out.println("Employee ID: " + Empid);
        System.out.println("Company Name: " + Company_name);
        System.out.println("Qualification: " + Qualification);
        System.out.println("Salary: " + Salary);
        System.out.println("Subject: " + Subject);
        System.out.println("Department: " + Department);
        System.out.println("Teacher ID: " + Teacherid);
        System.out.println();
    }
}

public class inheritPerson
{
    public static void main(String args[])
      {
        Scanner s= new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = s.nextInt();
        scanner.nextLine();
        
        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) 
          {
            System.out.println("Enter details for teacher " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = s.nextLine();
            System.out.print("Gender: ");
            String gender = s.nextLine();
            System.out.print("Address: ");
            String address = s.nextLine();
            System.out.print("Age: ");
            int age = s.nextInt();
            System.out.print("Employee ID: ");
            int empid = s.nextInt();
            s.nextLine();
            System.out.print("Company Name: ");
            String company_name = s.nextLine();
            System.out.print("Qualification: ");
            String qualification = s.nextLine();
            System.out.print("Salary: ");
            double salary = s.nextDouble();
            s.nextLine();
            System.out.print("Subject: ");
            String subject = s.nextLine();
            System.out.print("Department: ");
            String department = s.nextLine();
            System.out.print("Teacher ID: ");
            int teacherid = s.nextInt();
            s.nextLine();

            teachers[i] = new Teacher(name, gender, address, age, empid, company_name, qualification, salary, subject, department, teacherid);
        }

        System.out.println("\nDetails of Teachers:");
        for (Teacher teacher : teachers) {
            teacher.displayDetails();
        }
    }
}