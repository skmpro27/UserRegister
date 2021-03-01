
import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration {

	private boolean check;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String password;

	Scanner sc = new Scanner(System.in);

	//UC1
	public void checkFirstName() {
		System.out.print("\nEnter First Name(starts with capital letter and write minimum 3 letter): ");
		firstName = sc.nextLine();
		check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstName).matches();
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
                check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(lastName).matches();
                if (!check) {
                        System.out.print("Invalid last name");
                        checkLastName();
                }
                else
                        System.out.print("Last name is valid");
        }

	//UC3
        public void checkEmail() {
                System.out.print("\nEnter Email ID(Eg. abc.xyz@bl.co.in): ");
                email = sc.nextLine();
                check = Pattern.compile("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$").matcher(email).matches();
                if (!check) {
                        System.out.print("Invalid Email ID");
                        checkEmail();
                }
                else
                        System.out.print("Email ID is valid");
        }

	//UC4
        public void checkPhoneNumber() {
                System.out.print("\nEnter Phone Number(Eg. 91 9944778822): ");
                phoneNumber = sc.nextLine();
                check = Pattern.compile("^[0-9]{1,3} [0-9]{10}$").matcher(phoneNumber).matches();
                if (!check) {
                        System.out.print("Invalid Phone Number");
                        checkPhoneNumber();
                }
                else
                        System.out.print("Phone Number is valid");
        }

	//UC5 and UC6
        public void checkPassword() {
                System.out.print("\nEnter Password(8 to 10 character): ");
                password = sc.nextLine();
                check = Pattern.compile("(?=.*[A-Z]).{8,10}").matcher(password).matches();
                if (!check) {
                        System.out.print("Invalid Password");
                        checkPassword();
                }
                else
                        System.out.print("Password is valid");
        }

	//main
	public static void main(String args[]) {
		UserRegistration user = new UserRegistration();

		user.checkFirstName();
		user.checkLastName();
		user.checkEmail();
		user.checkPhoneNumber();

		user.checkPassword();
	}
}
