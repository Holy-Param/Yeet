//Design a class to overload a function check( ) as follows
//1)void check(String str, char ch)- to find and print the frequency of a character in a string. 
// 2)void check(String sl)- to display only vowels from string s1,after converting it to lower case. 
import java.util.*;
public class q8
{
    void check(String str,char ch)
    {
        int a=0;
     for(int i = 0; i <str.length(); i++)
    {  
     char p=str.charAt(i);
     if( p==ch)
     {
     a++;
     }
    }
    System.out.print("The letter "+ch+" is repeated "+a+" times.");
 }
 void check(String sl)
 {
     int a=0;
     for(int i = 1; i <sl.length(); i++)
    {  
     char p=sl.charAt(i);
     if( p=='a')
     {
     System.out.println(Character.toLowerCase(p));
     }
    }   
 }
 public static void main()
 {
  q8 sc=new q8();
  sc.check("success",'s');
  


 }
}