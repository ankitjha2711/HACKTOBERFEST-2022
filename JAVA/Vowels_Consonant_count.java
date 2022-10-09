import java.util.Scanner;
import java.util.*;
public class Disp1109consvow
{
    public void Displaycon(String str)
    {
        String s=str.toUpperCase();
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            char e=s.charAt(i);
            if(e != 'A' && e != 'E' && e !='I' && e !='O' && e !='U')
            {
                System.out.print(str.charAt(i)+" ");
            }
        }
    }
    public void Displayvow(String str)
    {
        String s=str.toUpperCase();
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            char e=s.charAt(i);
            if(e == 'A' || e == 'E' || e =='I' || e =='O' || e =='U')
            {
                System.out.print(str.charAt(i)+" ");
            }
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String a=sc.nextLine();
        System.out.print("Consonants are: ");
        Disp1109consvow obj=new Disp1109consvow();
        obj.Displaycon(a);
        System.out.print("\nVowels are: ");
        obj.Displayvow(a);
    }
}

