/* Question 7.
Program to perform String manipulations
*/

public class String_m 
{
    String str;
    String_m(String s)
    {
        this.str=s;
    }
    void manipulations()
    {
        String value=this.str;
        System.out.println("String Length is : "+value.length());
        System.out.println("String concatenation : "+value.concat(" concatenated"));
        System.out.println("Index of character 's' : "+value.indexOf('s'));
        System.out.println("Character at position 5 : "+value.charAt(5));
        System.out.println("Compare to 'home next' : "+value.compareTo("home next"));
        System.out.println("Contains Sequence 'ome' : "+value.contains("ome"));
        System.out.println("Ends with character 't' : "+value.endsWith("t"));
        System.out.println("Replace 'text' with 'words' : "+value.replace("text", "words"));
        System.out.println("Convert to Lowercase : "+value.toLowerCase());
        System.out.println("Convert to Uppercase : "+value.toUpperCase());
    }
    public static void main(String arg[])
    {
        String_m s=new String_m("some text");
        s.manipulations();
    }
}
