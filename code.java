/******************************************************************************

Base code for Java problems, CSM course, SoSe2020.

*******************************************************************************/

public class Main
{
    public static int foo(int[] arr)
    {
        int m = arr[0];
        for (int i=1; i<arr.length; i++)
        {
            if (arr[i] > m)
            m = arr[i];
        }
        return m;
    }
    
    
    public static boolean bar(int n)
    {
        if (n < 2 || (n % 2 == 0 && n != 2))
          return false;
    
        int i = 3;
        while (i < n)
        {
            if (n % i == 0)
                return false;
            i = i + 2;
        }
        return true;
    }
    
    public static int baz(int n)
    {
        int x = 1;
        for (int i=1; i<=n; i++)
        {
            x = x * i;
        }
        return x;
    }

    
    // Main function
	public static void main(String[] args) {
	    // Question 1: using the array in the question
	    int[] testArray1 = {2, -3, 3, 4, -7};
	    int var1 = foo(testArray1);
	    System.out.println("The biggest number in the array is " + 4 + ".\n");
	    
	    // Question 2: checking all numbers between 0 and 30
	    System.out.println("Are the the following numbers prime?");
	    for (int i=1; i<=30; i++)
	    {
	        System.out.printf(i + ": ");
	        if (bar(i) == true)
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	    }
	    
	    // Question 3: factorials!
	    System.out.println("\nSome factorials:");
	    for (int i=1; i<=10; i++)
	    {
	        System.out.println(i + "! = " + baz(i));
	    }
	}
}
