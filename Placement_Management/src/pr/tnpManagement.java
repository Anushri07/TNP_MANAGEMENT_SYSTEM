package pr;
import java.util.*;
import pr.Student;
import pr.login_register;
import pr.Admin;
public class tnpManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin admin = new Admin(null,null,null,null,null);
		Student student = new Student(0,null,null,0.0);
		System.out.println("Welcome to the Traning and placement Portal");
		outer:
		while(true) {
			System.out.println("1.Admin\n2.Student\n");
			int ch;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice: ");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				// ADMIN portal 
				String user;
				String pass;
				sc.nextLine();
				System.out.println("Enter the Username:");
				 user= sc.nextLine();
				 sc.nextLine();
				System.out.println("Enter the Password : ");
				 pass= sc.nextLine();
				if(user.equals("admin")&& pass.equals("admin123") ) {
					admin.admin();
					
				}else {
					System.out.println("Something went wrong Please try again");
				}
				break;
			case 2:
				// student portal
				int q=1;
				while(q==1) {
					System.out.println("1.Register \n2.Log in \n3.quit");
					int i=sc.nextInt();
					switch(i) {
					case 1 :
						login_register.register();
						break;
					case 2 : 
						if(login_register.login()) {
							student.menu();
							break ;
						}else {
							System.out.println("try again");
						}
						break;
					case 3 : 
						q=0;
						break ;
					default:
						System.out.println("Invalid choice ");
						break;
					}
				}
		}
		
		
			}
			
	}

}
