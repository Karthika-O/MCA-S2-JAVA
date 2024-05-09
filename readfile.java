import java.io.*;
public class readfile 
{
    public static void main(String[] args) 
      {

        try 
            {
            FileReader r = new FileReader("file.txt");
            BufferedReader br= new BufferedReader(r);
            String line;
            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }
            br.close();
}
catch (IOException e) 
        {
            System.out.println("-----Error-----");
        }

    }

}