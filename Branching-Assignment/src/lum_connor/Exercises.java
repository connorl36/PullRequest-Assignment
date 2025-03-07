/**
 * @author Connor Lum
 */
package lum_connor;

public class Exercises 
{
	public static int threeAndFive()
	{
		int sum = 0;
		for (int x = 0; x < 1000; x++)
		{
			if (x % 3 == 0 || x % 5 == 0)
			{
				sum += x;
			}
		}
		return sum;
	}
	
	public static int evenFibSum()
	{
		int first = 1;
		int second = 1;
		int sum = 0;
		while (first < 4000000)
		{
			if (first % 2 == 0)
			{
				sum += first;
			}
			first = first + second;
			if (second % 2 == 0)
			{
				sum += second;
			}
			second = first + second;
		}
		return sum;
	}
	
	public static int largestPrimeFactor()
	{
		long largest = 600851475143L;
		long factor = 2;
		while (factor < largest)
		{
			if (largest % factor == 0)
			{
				largest = largest/factor;
				factor = 2;
			}
			else
				factor++;
		}
		return (int)largest;
	}
}
