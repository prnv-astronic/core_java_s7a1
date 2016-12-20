package Core_javas7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class str_test {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner scan=new Scanner(System.in);// scanner class object

		String test_str1=new String("\"STRING1:\"");// creating string using string class
		String test_str2=new String("\"STRING2:\"");//
		System.out.println(test_str1.concat(test_str2));// creating 1 string..
		
		test_str2=(String.valueOf(scan.nextInt()));			// Accepting new integer value 
		test_str1.concat(test_str2);						// printing accepting integer to string value
		System.out.println(test_str1.concat(test_str2));	// Joining two strings
	

	}

}
