package pr;
import pr.Admin;
import java.util.*;
public class application {
	
	public static ArrayList<application> list = new ArrayList<>();
	private   String name;
	private  String email;
	private   String branch;
	private   double cgpa;
	private  String e;
	Admin admin = new Admin(null,null,null,null,null);
	application(String name,String email,String branch,double cgpa,String e){
		this.name=name;
		this.email=email;
		this.branch=branch;
		this.cgpa=cgpa;
		this.e=e;
	}
	public static Scanner sc = new Scanner(System.in);
public void apply() {
	if(Student.isEmpty()) {
		System.out.println("No Students details are availabele to Apply ");
	}
	if(Admin.isEmpty()) {
		System.out.println("No Companies are available to Apply ");
	}
	System.out.println("Enter the Name of the Company you want to Apply to : ");
	String companyName=sc.nextLine();
	Admin applyingCompany=null;
	for(Admin company:Admin.companies) {
		 if (company.getname() != null && company.getname().equalsIgnoreCase(companyName)) {
		        applyingCompany = company;
			break;
		}
	}
	if(applyingCompany==null) {
		System.out.println("Company Not Found with the given name ");
		return ;
	}
	System.out.println("-------------------Application Form----------------------");
	System.out.println("Enter the name of the Student : ");
	 name = sc.nextLine();
	Student applyingStudent = null;
	for(Student student:Student.students) {
		if(student.getname().equalsIgnoreCase(name)) {
			applyingStudent=student;
			break;
		}
	}
	if(applyingStudent==null) {
		System.out.println("Student Not Found in the Profile with the given name ");
		return;
	}
	System.out.println("Enter the Email ID of the Student : ");
	 email = sc.nextLine();
	System.out.println("Enter the Branch of the Student : ");
	 branch = sc.nextLine();
	System.out.println("Enter the CGPA of the Student : ");
	 cgpa = sc.nextDouble();
	 sc.nextLine();
	 System.out.println("Enter your personal Email ID : ");
	 e = sc.nextLine();
	 application ap = new application(name,email,branch,cgpa,e);
	 list.add(ap);
	 System.out.println("Registration SuccessFull :)");
}

}
