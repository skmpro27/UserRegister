
import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration {

	private boolean check;
	private String firstName;
	private String lastName;

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
                boolean check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(lastName).matches();
                if (!check) {
                        System.out.print("Invalid last name");
                        checkLastName();
                }
                else
                        System.out.print("Last name is valid");
        }

	public static void main(String args[]) {
		UserRegistration user = new UserRegistration();
		user.checkFirstName();
		user.checkLastName();
	}
}
