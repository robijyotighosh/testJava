package dateClass;

import java.text.ParseException;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) throws ParseException{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employee whose details you want to add=");
		int no=sc.nextInt();
		Student st =new Student();
		st.input(no);
	}

}
