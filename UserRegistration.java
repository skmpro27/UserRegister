
import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration {

	private boolean check;
	private String firstName;

	Scanner sc = new Scanner(System.in);

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

	public static void main(String args[]) {
		UserRegistration user = new UserRegistration();
		user.checkFirstName();
	}
}
