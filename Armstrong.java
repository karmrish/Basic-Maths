import java.util.Scanner;
class Armstrong
{static void arms(int n)
    {int sum=0;
        int dup=n;
        while(n>0)
        {
            int ld=n%10;
            sum=sum+(ld*ld*ld);
            n=n/10;
        }
        if(sum==dup)
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        arms(n);
        sc.close();
    }
}
