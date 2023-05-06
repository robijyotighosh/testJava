package dateClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class Student {
	List<Student> a1=new ArrayList<>();
	private int roll;  
	private String name,birthdate;
	public Student(int roll, String name, String birthdate) {
		super();
		this.roll = roll;
		this.name = name;
		this.birthdate = birthdate;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void agecalculation(String birthdate) throws ParseException
	{
	java.util.Date sysDate=new java.util.Date();  
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
	Date birthdate1 = sdf.parse(birthdate);
	long diff=sysDate.getTime()-birthdate1.getTime();
	//System.out.println(diff);
	int sec=(int) (diff/1000);
	int day=(int) (sec/86400); 
	int age=(int) (day/365);
	System.out.println("Age is"+age);
	}
	
	  void input(int no) throws ParseException{
		for(int i=0;i<no;i++)
		{		Student st1=null;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the roll no");
				roll=sc.nextInt();
				System.out.println("Enter the Student's Name");
				name=sc.next();
				System.out.println("Enter the Student's DOB");
				birthdate=sc.next();
//				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
//				Date birthdate1 = sdf.parse(birthdate,format);
				DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate date = LocalDate.parse(birthdate,format);
				st1 = new Student(roll,name,birthdate);
				st1.agecalculation(birthdate);
				a1.add(st1);
				
		}
}
}
