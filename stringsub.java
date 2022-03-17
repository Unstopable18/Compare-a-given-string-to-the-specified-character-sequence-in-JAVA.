import java.util.Scanner;
public class stringsub 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);   
        System.out.println("\n**********************************************\n"); 
        System.out.println("Enter Deafult String: ");
        String str1= sc.nextLine();   
        System.out.println("Enter Specified character sequence: ");
        String str2= sc.nextLine(); 
        System.out.println("***************************************************\n");  
        System.out.println("The Default String contains the Specified character sequence.\n \t***It is True or False.*** ");
        System.out.println(str1.contains(str2));
        int i = str1.indexOf(str2);
        System.out.println("And the Specified character sequence is found at "+i+" Position.");   
        System.out.println("***************************************************\n"); 
    }
}
