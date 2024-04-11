import java.util.*;
public class matrix 
{
    int row;
    int column;
    int[][] array = new int[10][10];

    public void get_matrix()
    {
        int i,j;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter row size : ");
        this.row = sc.nextInt();
        System.out.print("Enter column size : "); 
        this.column = sc.nextInt();
        System.out.print("Enter matrix elements : ");
        for(i=0;i<this.row;i++)
        {
            for(j=0;j<this.column;j++)
            {
                this.array[i][j] = sc.nextInt();
            }
        }
    }

    public static matrix sum(matrix c1, matrix c2) 
    {
        int i, j;
        matrix temp = new matrix();

        if (c1.row == c2.row && c1.column == c2.column) 
        {
            temp.row =c1.row;
            temp.column = c1.column;
            for (i = 0; i < c1.row; i++) 
            {
                for (j = 0; j < c1.column; j++) 
                {
                    temp.array[i][j] =  c1.array[i][j] +  c2.array[i][j];
                }
            }
        } 
        else 
        {
            System.out.println("Addition not possible ");
        }

        return temp;
    }

    public void display_matrix()
    {
        int i,j;
        for(i=0;i<this.row;i++)
        {
            for(j=0;j<this.column;j++)
            {
                System.out.print(this.array[i][j] +" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) 
    {
        matrix first = new matrix();
        matrix second = new matrix();
        matrix temp;
        System.out.println("Enter First Matrix");
        first.get_matrix();
        System.out.println("Enter Second Matrix");
        second.get_matrix();
        temp = sum(first,second);
        //first.display_matrix();
        //second.display_matrix();
        System.out.println("-----SUM MATRIX-----");
        temp.display_matrix();
    }
}