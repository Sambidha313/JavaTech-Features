package co.java.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandlingDemo {

	public static void main(String[] args) throws IOException // For suppressing we can use "throws" followed by the
																// typeof Exception,but it will not handle the error
	{

		int i, j = 1, k = 0;
		// int a[] = new int[4];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Getting the input from user

		i = 8;

		j = 2;
		try {

			// for(int c=0;c<=4;c++)
			// {
			// a[c]=c+1;
			// }
			// for(int value :a)
			// {
			// System.out.println(value); //Here you get ArrayIndexOutOfBoundException
			// because
			// u have array size 4 but u are going beyond that
			// }
			System.out.println("Enter a number");

			j = Integer.parseInt(br.readLine()); // Storing in j
			// k = i / j;
			k = i + j;
			if (k <= 10) {
				throw new ArithmeticException();
			}
			System.out.println("Output is :" + k);

		}

		// catch (ArithmeticException e) {
		// System.out.println("Cannot Divide by Zero" + e); // Handled using try and
		// catch block
		// }
		catch (ArithmeticException e) {
			System.out.println("Minimum value for the output is 10");
		}

		catch (IOException e) {
			System.out.println("Some IO Error");
		}

		// catch(ArrayIndexOutOfBoundsException e)
		// {
		// System.out.println("Maximum number of value is 4");
		// }
		catch (Exception e) {
			System.out.println("Unknown Exception");
		} finally {
			System.out.println("BYE");
		}

		System.out.println(k); // ArithmaticException
	}

}



//1. Arithmatic Exception
//2. ArrayIndexOutOfBoundException
//3. Multiple Catch block and one try block
//4. If u dont know the type of Exception,Always write your main exception at the last.
//5. Taking input from the class using BufferedReader for IOE Exception
//6. Use of finally Keyword
//7. Use of throws keyword
//8. Use of throw keyword

//Remember we cannot have same catch block Exception repeatedly
// like 
//catch(ArithmeticException e)
//       {
//        some code
//        }







