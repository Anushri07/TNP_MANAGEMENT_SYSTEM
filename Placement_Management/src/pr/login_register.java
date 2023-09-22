package pr;

import java.util.*;
public class login_register {
	//hashMap of USERNAME and password
	  private static HashMap<String , String> m = new HashMap<>();
	 
	//hashMap of email and phone no
	private static HashMap<String , String> m2 = new HashMap<>();
	public static Scanner sc = new Scanner(System.in);
	public static void register() {
		
		String username;
		String password,email;
		String phone;
		System.out.println("-------Registeration---------");
		System.out.println("Enter the email id : ");
		email = sc.nextLine();
		System.out.println("Enter the Username:");
		username = sc.nextLine();
		System.out.println("Enter the Password : ");
		password = sc.nextLine();
		System.out.println("Enter the Phone number : ");
		phone=sc.nextLine();
		m.put(username,password);
		m2.put(email,phone);
		System.out.println("Registration Successfull !!");
		System.out.println("Please log in to continue...");
		
	}
	public static boolean  login()
	{
		String username;
		String password;
		 m.put("anushri","anu");
		System.out.println("Enter the Username:");
		username= sc.nextLine();
		System.out.println("Enter the Password : ");
		password = sc.nextLine();
		if(login_register.isLoggedIn(username,password)) {
			return true;
		}
		return false;
	}
	public static boolean isLoggedIn(String username,String password) {
		if(m.containsKey(username)) {
			String StoredPassword = m.get(username);
			if(password.equals(StoredPassword)) {
				System.out.println("Logged in Successfull :)");
				return true;
			}
		}else {
			System.out.println("Username not found :( ");
		}
		return false;
	}
	
}
