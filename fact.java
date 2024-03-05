import java.io.*;
import java.util.*;
class fact{

       public static void main(String args[])
{
             Scanner sc=new Scanner(System.in); 
             System.out.println("enter n:");
             int n=sc.nextInt();
             String a="(0!)";
             System.out.print("(");
             for(int i=1;i<=n;i++)
     {

                 if(i<n)
{
                  System.out.print(a+"+");
}
                else{ 
                    System.out.print(a);
}

}
             System.out.println(")!");
             String p="1";

            System.out.print("(");
            for(int j=1;j<=n;j++)
{
                 if(j<n)
{

                    System.out.print(p+"+");
}

                 else {
                    System.out.print(p);

}
}

           System.out.println(")!");
           int factorial=1;

               for (int m=1;m<=n;m++) 
{
                   factorial=factorial*m;
}

          System.out.println("\n factorial of given value is:"+factorial);
}
}