
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int low,high;
		Scanner sc=new Scanner(System.in);
		low=sc.nextInt();
		high=sc.nextInt();

        while (low < high)
        {
            boolean flag = false;

            for(int i =2; i <=low/2; ++i)
            {
               
                if(low % i == 0) 
                {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(low+" ");

            low++;
        }
	}
}
