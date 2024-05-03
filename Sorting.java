/* Question 6.
Program to sort strings
*/

import java.util.*;
class Sorting 
{
    String str;
    public void get_string() 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string value: ");
        this.str = s.nextLine();
    }
    public void sort_print() 
    {
        char charArray[] = str.toCharArray();
        Arrays.sort(charArray);
        String sortedString = "";
        for (int i = 0; i < charArray.length; i++) 
        {
            sortedString += charArray[i];
            if (i != charArray.length - 1) 
            {
                sortedString += " ";
            }
        }
        System.out.println("Sorted String is "+sortedString);
    }
    public static void main(String args[]) 
    {
        Sorting s = new Sorting();
        s.get_string();
        s.sort_print();
    }
}
