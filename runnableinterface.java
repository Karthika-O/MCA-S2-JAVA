/* 
Define 2 classes; one for generating Fibonacci numbers and other for displaying even numbers in a given range.
Implement using threads (Runnable Interface)
*/

import java.util.Scanner;
public class runnableinterface
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the lower limit of range");
    int x = sc.nextInt();
    System.out.println("Enter the Upper limit of range");
    int y = sc.nextInt();
    Runnable r = new fibannoci(x,y);
    Thread obj1 = new Thread(r);
    obj1.start();
    Runnable p = new even(x,y);
    Thread obj2 = new Thread(p);
    obj2.start();
    }
}
class fibannoci implements  Runnable
{
    int n1;
    int n2;
    int num =0;
    int x = 0;
    int y = 1;
    fibannoci(int l,int u)
     {
        n1 = l;
        n2 = u;
    }
    public void run() 
     {
        System.out.println("fibannoci = "+0);
        System.out.println("fibannoci = "+1);
        while (num < n2-1) 
          {
            num = x + y;
            if ((num >= n1)&&(num<=n2)) 
            {
                System.out.println("fibannoci = "+num);
            }
            x = y;
            y = num;
        }

    }
}
class even implements Runnable
  {
        int n1;
        int n2;
        even(int x, int y)
        {
            n1 = x;
            n2 = y;
        }
       public void run()
       {
        for(int i= n1; i<=n2; i++)
        {
            if(i%2==0)
            {
                System.out.println("even ="+i);
            }
        }
       }

}
