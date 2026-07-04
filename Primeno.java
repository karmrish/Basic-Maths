import java.util.Scanner;
class Primeno
{static void prime(int n)
    {int co=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                co++;
    }
    if(co==2)
    System.out.println("True");
        else
           System.out.println("False"); 
    }
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prime(n);
        sc.close();
    }
}
