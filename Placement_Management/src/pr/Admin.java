package pr;
import java.util.*;
public class Admin {
// log in
	// add the company -> job role,location,CTC,criteria
	//view the list of companies
	//delete the company
	//set the criteria
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Admin> companies = new ArrayList<>();
	private  String companyname;
	private  String jobrole;
	private  String ctc;
	private  String criteria;
	private  String location;
	public Admin(String companyname,String jobrole,String ctc,String criteria,String location) {
		this.companyname=companyname;
		this.jobrole=jobrole;
		this.ctc=ctc;
		this.criteria=criteria;
		this.location=location;
	}
	public String getname() {
		return companyname;
	}
	public String getrole() {
		return jobrole;
	}
	public String getctc() {
		return ctc;
	}
	public String getCriteria() {
		return criteria;
	}
	public String getLocation() {
		return location;
	}
	public void setcompanyName(String companyname) {
		this.companyname=companyname;
	}
	public void setjobrole(String jobrole) {
		this.jobrole=jobrole;
	}
	public void setctc(String ctc) {
		this.ctc=ctc;
	}
	public void setCriteria(String criteria) {
		this.criteria=criteria;
	}
	public void setLocation(String location) {
		this.location=location;
	}
   public  void addCompany() {
		System.out.println("--------------  Add Company Details ----------------");
		sc.nextLine();
		System.out.println("Enter the Comapny Name : ");
		companyname = sc.nextLine();
		System.out.println("Enter the Job Role : ");
		jobrole = sc.nextLine();
		System.out.println("Enter the CTC Offered by Company : ");
		ctc = sc.nextLine();
		System.out.println("Enter the Eligeible Criteria : ");
		criteria = sc.nextLine();
		System.out.println("Enter the Location : ");
		location = sc.nextLine();
		Admin admin =  new Admin(companyname,jobrole,ctc,criteria,location);
		companies.add(admin);
		for(Admin ad:Admin.companies) {
			System.out.println(ad+" ");
		}
		System.out.println(" Company Details has been added Successfully !! ");
	}
   public static void displaycompany() {
	   System.out.println("---------------------------------------- Company Details -----------------------------------------");
		System.out.printf("%-20s %-20s %-20s %-20s %-20s%n","Company Name", "Job role", "CTC", "Criteria","Location");
		System.out.println("-------------------------------------------------------------------------------------------------");
	    for (Admin admin : companies) {
	        System.out.printf("%-20s %-20s %-20s %-20s %-20s%n",admin.getname(), admin.getrole(), admin.getctc(), admin.getCriteria(),admin.getLocation());
	    }
	    System.out.println("-----------------------------------------------------------------------------------------------------");
   }
   public void modifyCompanyName(String c) {
	   boolean found=false;
	   for(Admin admin:companies) {
		   if(admin.getname()!=null && admin.getname().equalsIgnoreCase(c)) {
			   found=true;
			   sc.nextLine();
			   System.out.println("Enter the new name of Company : ");
			   String newname=sc.nextLine();
			   admin.setcompanyName(newname);
			   System.out.println("**********Modification SuccessFull********");
		   }
	   }
	   if(found==false) {
		   System.out.println("Company with given name not found ");
	   }
   }
   public void modifyJobRole(String c) {
	   boolean found=false;
	   for(Admin admin:companies) {
		   if(admin.getname()!=null && admin.getname().equalsIgnoreCase(c)) {
			   found=true;
			   sc.nextLine();
			   System.out.println("Enter the new name of Company : ");
			   String m=sc.nextLine();
			   admin.setjobrole(m);
			   System.out.println("**********Modification SuccessFull********");
		   }
	   }
	   if(found==false) {
		   System.out.println("Company with given name not found ");
	   }
   }
   public void modifyctc(String c) {
	   boolean found=false;
	   for(Admin admin:companies) {
		   if(admin.getname()!=null && admin.getname().equalsIgnoreCase(c)) {
			   found=true;
			   sc.nextLine();
			   System.out.println("Enter the new CTC of Company : ");
			   String m=sc.nextLine();
			   admin.setctc(m);
			   System.out.println("**********Modification SuccessFull********");
		   }
	   }
	   if(found==false) {
		   System.out.println("Company with given name not found ");
	   }
   }
   public void modifycriteria(String c) {
	   boolean found=false;
	   for(Admin admin:companies) {
		   if(admin.getname()!=null && admin.getname().equalsIgnoreCase(c)) {
			   found=true;
			   sc.nextLine();
			   System.out.println("Enter the new Crietria of Company : ");
			   String m=sc.nextLine();
			   admin.setCriteria(m);
			   System.out.println("**********Modification SuccessFull********");
		   }
	   }
	   if(found==false) {
		   System.out.println("Company with given name not found ");
	   }
   }
   public void modifylocation(String c) {
	   boolean found=false;
	   for(Admin admin:companies) {
		   if(admin.getname()!=null && admin.getname().equalsIgnoreCase(c)) {
			   found=true;
			   sc.nextLine();
			   System.out.println("Enter the new Location of Company : ");
			   String m=sc.nextLine();
			   admin.setLocation(m);
			   System.out.println("**********Modification SuccessFull********");
		   }
	   }
	   if(found==false) {
		   System.out.println("Company with given name not found ");
	   }
   }
   public  void modify() {
	   Admin admin= new Admin(null,null,null,null,null);
	   sc.nextLine();
	   System.out.println("Which company you want to modify: ");
	   String c = sc.nextLine();
	   outer:
	   while(true) {
		   System.out.println("Which part do you want to modify: ");
		   System.out.println("1.company name\n2.Job Role\n3.CTC\n4.Criteria\n5.Location\n6.quit\n");
		   int ch= sc.nextInt();
		   switch(ch) {
		   case 1:
			   admin.modifyCompanyName(c);
			   break;
		   case 2:
			   admin.modifyJobRole(c);
			   break;
		   case 3:
			   admin.modifyctc(c);
			   break;
		   case 4:
			   admin.modifycriteria(c);
			   break;
		   case 5:
			   admin.modifylocation(c);
		   case 6:
			   break outer;
		   }
	   }
   }
	public  void admin() {
		System.out.println("\n----------------------------- Admin Portal ------------------------------------\n");
		outer:
		while(true) {
			System.out.println("1.Add the Company details\n2.Display Comapny details\n3.Modify the Company details\n4.quit\n");
			int ch=sc.nextInt();
			switch(ch) {
			case 1 :
				addCompany();
				break;
			case 2 :
				displaycompany();
				break;
			case 3:
				modify();
				break;
			case 4:	
				break outer;
			}
		}
		
	}
	public static boolean isEmpty() {
		// TODO Auto-generated method stub
		if(companies.isEmpty()) {
			return true;
		}
		return false;
	}
	
}
