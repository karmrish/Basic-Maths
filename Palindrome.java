import java.util.Scanner;
class Palindrome
{
    static void palin(int n)
   { int rev=0;
    int dup=n;
    while(n>0)
    {int ld=n%10;
         rev=rev*10+ld;
        n=n/10;
       
    }
    if(dup==rev)
       System.out.println("True");
    else
        System.out.println("False"); }
public static void main(String args[])
{Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
  palin(n);
    sc.close();
}}