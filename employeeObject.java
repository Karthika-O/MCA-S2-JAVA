/* Question 8.
Create a class Employee having attributes eNo,eName,eSalary. Read N employ information and search for an employee given eNo, using the concept of Array of objects.
*/

import java.util.*;  
class employeeObject
{
    int eNo;
    String eName;
    int eSalary;

    public void read()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter ID : "); 
        eNo = sc.nextInt();
        System.out.print("Enter Name : "); 
        eName = sc.next();
        System.out.print("Enter monthly salary : "); 
        eSalary = sc.nextInt();
    }

    public void display(){
        System.out.println("Name : "+ eName );
    }
    public static void main(String []args)
    { 
        Scanner sc= new Scanner(System.in);
        int i,n;
        int No;
        System.out.println("Enter the number of objects to be created");
        n=sc.nextInt();
        employeeObject emp[] = new employeeObject[n];
        for(i=0;i<n;i++)
        {
            emp[i] = new employeeObject();
            emp[i].read();
        }
        System.out.println("Search"); 
        System.out.print("Enter ID : "); 
        No =sc.nextInt();
            for(i=0;i<n;i++)
            {
                if(emp[i].eNo == No)
                {
                    emp[i].display();
                    break;
                }
                else
                {
                    System.out.println("Employee ID mismatch");
                    break;
                }
            }
    }
}
