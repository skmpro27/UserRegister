
import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration {

	private boolean check;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String password;

	private static final String PATTERN_FOR_NAME = "[A-Z]{1}[a-z]{2,}";
	private static final String PATTERN_FOR_EMAIL = "^[a-zA-z0-9’*+/=?`{|}~^-]{1,}(?:\\.[a-zA-Z0-9’*+/=?`{|}~^-]+)*@[a-zA-Z0-9]{1,}(?:\\.[a-zA-Z,]{2,6})?(?:\\.[a-zA-Z,]{2,6})?$";
	private static final String PATTERN_FOR_PHONE_NUMBER = "^[0-9]{1,3} [0-9]{10}$";
	private static final String PATTERN_FOR_PASSWORD = "^(?=.*[A-Z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,12}";

	Scanner sc = new Scanner(System.in);

	public static String[] validId = {"abc@yahoo.com", "abc-100@yahoo.com,", "abc.100@yahoo.com", "abc111@abc.com,", "abc-100@abc.net,",
				"abc.100@abc.com.au", "abc@1.com,", "abc@gmail.com.com", "abc+100@gmail.com"};

	public static String[] invalidId = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
				"abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
	//UC1
	public void checkFirstName() {
		System.out.print("\nEnter First Name(starts with capital letter and write minimum 3 letter): ");
		firstName = sc.nextLine();
		check = Pattern.compile(PATTERN_FOR_NAME).matcher(firstName).matches();
		if (!check) {
			System.out.print("Invalid first name");
			checkFirstName();
		}
		else
			System.out.print("First name is valid");
	}


        //UC2
        public void checkLastName() {
                System.out.print("\nEnter Last Name(starts with capital letter and write minimum 3 letter): ");
                lastName = sc.nextLine();
                check = Pattern.compile(PATTERN_FOR_NAME).matcher(lastName).matches();
                if (!check) {
                        System.out.print("Invalid last name");
                        checkLastName();
                }
                else
                        System.out.print("Last name is valid");
        }

	//UC3
	public void checkEmail() {
		System.out.print("\nEnter First Name(starts with capital letter and write minimum 3 letter): ");
		email = sc.nextLine();
		check = Pattern.compile(PATTERN_FOR_NAME).matcher(email).matches();
		if (!check) {
			System.out.print("Invalid first name");
			checkFirstName();
		}
		else
			System.out.print("First name is valid");
	}



	//UC4
        public void checkPhoneNumber() {
                System.out.print("\nEnter Phone Number(Eg. 91 9944778822): ");
                phoneNumber = sc.nextLine();
                check = Pattern.compile(PATTERN_FOR_PHONE_NUMBER).matcher(phoneNumber).matches();
                if (!check) {
                        System.out.print("Invalid Phone Number");
                        checkPhoneNumber();
                }
                else
                        System.out.print("Phone Number is valid");
        }

	//UC5, UC6, UC7 and UC8
        public void checkPassword() {
                System.out.print("\nEnter Password(8 to 12 character): ");
                password = sc.nextLine();
                check = Pattern.compile(PATTERN_FOR_PASSWORD).matcher(password).matches();
                if (check)
                       	System.out.print("valid Password");
                else {
                        System.out.print("Invalid Password");
			checkPassword();
		}
        }

	//UC9
        public void checkEmailStrings() {

		for (int i = 0; i < validId.length; i++) {
			System.out.println(validId[i]);
                	check = Pattern.compile(PATTERN_FOR_EMAIL).matcher(validId[i]).matches();
               		if (!check) {
                        	System.out.println("Invalid Email ID");
                	}
                	else
                        	System.out.println("Email ID is valid");
        	}
		System.out.println();
		for (int i = 0; i < invalidId.length; i++) {
			System.out.println(invalidId[i]);
                	check = Pattern.compile(PATTERN_FOR_EMAIL).matcher(invalidId[i]).matches();
               		if (!check) {
                        	System.out.println("Invalid Email ID");
                	}
                	else
                        	System.out.println("Email ID is valid");
        	}
	}

	//main
	public static void main(String args[]) {
		UserRegistration user = new UserRegistration();

//		user.checkFirstName();
//		user.checkLastName();
//		user.checkEmail();
//		user.checkPhoneNumber();
//		user.checkPassword();
		user.checkEmailStrings();

	}
}

