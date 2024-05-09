import java.io.*;
import java.util.Scanner;

public class filewrite 
{
    public static void main(String[] args) 
    {
        String fileName = "sample.txt";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of lines to write: ");
        int n= s.nextInt();
        s.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 1; i <= n; i++) 
            {
                String line;
                System.out.print("Enter the line to write: ");
                line=s.nextLine();
                writer.write(line);
                writer.newLine(); 
            }
            System.out.println("Text has been written to the file.");
        } 
        catch (IOException e) 
        {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) 
        {
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } 
        catch (IOException e) 
        {
            System.err.println("Error reading from file: " + e.getMessage());
        }
       
    }
}


