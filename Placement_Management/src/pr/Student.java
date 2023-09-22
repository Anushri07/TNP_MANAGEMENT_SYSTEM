package pr;
import java.util.*;
public class Student {

	//log in
	//student details->id,name,email,cgpa
	//view upcoming companies
	 // view company details and job role
	 // view criteria
	 //apply for the company
	private  String name;
	private  String email;
	private  int id;
	private  double cgpa;
	public static Scanner sc = new Scanner(System.in);
	protected static ArrayList<Student> students = new ArrayList<>();
	
	public Student(int id ,String name,String email,Double cgpa) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.cgpa=cgpa;
	}
	public int getid() {
		return id;
	}
	
public String getname() {
	return name;
}
public String getemail() {
	return email;
}
public double getcgpa() {
	return cgpa;
}
public void setId(int id) {
	this.id=id;
}
public void setName(String name) {
	this.name=name;
}
public void setCgpa(double cgpa) {
	this.cgpa=cgpa;
}
public void setEmail(String email) {
	this.email=email;
}
public void addStudentdetails() {
	System.out.println("------Add the Student Details------");
	System.out.println("Enter the ID : ");
	id=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the Full Name : ");
	name=sc.nextLine();
	System.out.println();
	System.out.println("Enter the Current CGPA : ");
	cgpa=sc.nextDouble();
	sc.nextLine();
	System.out.println("Enter the Email ID : ");
	email=sc.nextLine();
	Student student = new Student(id,name,email,cgpa);
	students.add(student);
	System.out.println("**********Student details added Successsfully***********");
}
public void viewStudentDetails() {
	System.out.println("\n_____________________________Student Details___________________________________\n");
	System.out.printf("%-10s %-20s %-10s %-20s%n","ID", "Name", "CGPA", "Email");
	System.out.println("______________________________________________________________________________\n");
    for (Student student : students) {
        System.out.printf("%-10s %-20s %-10.2f %-20s%n",student.getid(), student.getname(), student.getcgpa(), student.getemail());
    }
    System.out.println("__________________________________________________________________________________\n\n");
}
public static void modifyId() {
	sc.nextLine();
	System.out.println("Enter the ID of the Student to modify : ");
	int modifyId =  sc.nextInt();
	System.out.println("Enter the New ID : ");
	int newid=sc.nextInt();
	for(Student Student :students) {
        if(Student.getid()== modifyId) {
        	sc.nextLine();
			Student.setId(newid);
		}
	}
	System.out.println("*****Modifictaion Successfull******");
}
public void modifyname() {
	boolean found=false;
	System.out.println("Enter your id first : ");
	int id = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the New Name : ");
	String newname=sc.nextLine();
	for(Student student:students) {
		if(student.getid()==id) {
			student.setName(newname);
			found=true;
			break;
		}
	}
	if(found) {
		System.out.println("*****Modification SuccessFull*****");
	}else {
		System.out.println("Student with given ID Not Found");
	}
}
public void modifyCgpa() {
	boolean found=false;
	System.out.println("Enter your id first : ");
	int id = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the New CGPA : ");
	double newcgpa=sc.nextDouble();
	for(Student student:students) {
		if(student.getid()==id) {
			student.setCgpa(newcgpa);
			found=true;
			break;
		}
	}
	if(found) {
		System.out.println("****Modification SuccessFull****");
	}else {
		System.out.println("Student with given ID Not Found");
	}
}
public void modifyEmail() {
	boolean found=false;
	System.out.println("Enter your id first : ");
	int id = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the New Email : ");
	String newemail=sc.nextLine();
	for(Student student:students) {
		if(student.getid()==id) {
			student.setEmail(newemail);
			found=true;
			break;
		}
	}
	if(found) {
		System.out.println("***********Modification SuccessFull***********");
	}else {
		System.out.println("Student with given ID Not Found");
	}
}
public  void modifydetails() {
	Student student = new Student(0,null,null,0.0);
	System.out.println("Which Part do you want to Modify: ");
	outer:
	while(true) {
		System.out.println("1.Student ID\n2.Name\n3.CGPA\n4.Email ID\n5.Quit\n");
		int ch=sc.nextInt();
		//modify(field,value);
		switch(ch) {
		case 1:
			modifyId();
			break;
		case 2:
			student.modifyname();
			break;
		case 3:
			student.modifyCgpa();
			break;
		case 4:
			student.modifyEmail();
			break;
		case 5:
			break outer;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}
	
}
public  void menu() {
	Student student = new Student(0,null,null,0.0);
	application ap = new application(null,null,null,0.0,null);
	int ch;
	outer:
	while(true) {
		System.out.println("\n----------------------------------Student Portal----------------------------------\n");
		System.out.println("1.Create Profile \n2.View Profile \n3.Modify profile\n4.view company details\n5.Apply to the company\n6.quit");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Enter your choice : ");
		ch=sc.nextInt();
		switch(ch) {
		case 1 :
			student.addStudentdetails();
			break;
		case 2 :
			student.viewStudentDetails();
			break;
		case 3 :
			modifydetails();
			break;
		case 4 :
			Admin.displaycompany();
			break;
		case 5:
			ap.apply();
			break;
		case 6:
			break outer;
		}
	}
}

public static boolean isEmpty() {
	// TODO Auto-generated method stub
	if(students.isEmpty()) {
		return true;
	}
	return false;
}
}
