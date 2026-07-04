import java.util.Scanner;
class Count
{
   static int count(int n) 
   {
    int co=0;
    while(n>0)
    {co=co+1;
        n/=10;
    }
    return co;
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(count(n));
    sc.close();
}
}

