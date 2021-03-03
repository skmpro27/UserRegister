

import java.util.regex.*;
import java.util.Scanner;

public class UserRegistration {

        private static boolean check;
        private static String firstName;
        private static String lastName;
        private static String email;
        private static String phoneNumber;
        private static String password;


        private static final String PATTERN_FOR_NAME = "[A-Z]{1}[a-z]{2,}";
        private static final String PATTERN_FOR_EMAIL = "^[a-zA-z0-9’*+/=?`{|}~^-]{1,}(?:\\.[a-zA-Z0-9’*+/=?`{|}~^-]+)*@[a-zA-Z0-9]{1,}(?:\\.[a-zA-Z,]{2,6})?(?:\\.[a-zA-Z,]{2,6})?$";
        private static final String PATTERN_FOR_PHONE_NUMBER = "^[0-9]{1,3} [0-9]{10}$";
        private static final String PATTERN_FOR_PASSWORD = "^(?=.*[A-Z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,12}";

        public static String[] validId = {"abc@yahoo.com", "abc-100@yahoo.com,", "abc.100@yahoo.com", "abc111@abc.com,", "abc-100@abc.net,",
                                "abc.100@abc.com.au", "abc@1.com,", "abc@gmail.com.com", "abc+100@gmail.com"};

        public static String[] invalidId = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
                                "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};

        private static Scanner sc = new Scanner(System.in);

        //UC1
        public static void checkValid(String str, String pattern) {
                System.out.print("Enter " + str);
                String temp = str;
                str = sc.next();
                check = Pattern.compile(pattern).matcher(str).matches();
                if (!check) {
                        System.out.println(str + " is Invalid input");
                        str = temp;
                        checkValid(str, pattern);
                }
                else
                        System.out.println(str + " is Valid input");
        }

        //UC9
        public static void checkEmailArray() {

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

        public static void choiceCheck() {

                String choice;
                System.out.println("\n1.First Name");
                System.out.println("2.Last Name");
                System.out.println("3.Email");
                System.out.println("4.Phone Number");
                System.out.println("5.Password");
                System.out.println("6.Array of Emails");
                System.out.println("7.Exit");

                System.out.print("Enter your choice: ");
                choice = sc.next();

                switch(choice) {
                        case "1":
                                firstName = "First Name(starts with capital letter and write minimum 3 letter): ";
                                checkValid(firstName, PATTERN_FOR_NAME);
                                break;

                        case "2":
                                lastName = "Last Name(starts with capital letter and write minimum 3 letter): ";
                                checkValid(lastName, PATTERN_FOR_NAME);
                                break;

                        case "3":
                                email = "Email ID(Eg. abc.xyz@bl.co.in): ";
                                checkValid(email, PATTERN_FOR_EMAIL);
                                break;

                        case "4":
                                phoneNumber = "Phone Number(Eg. 91 9944778822): ";
                                checkValid(phoneNumber, PATTERN_FOR_PHONE_NUMBER);
                                break;

                        case "5":
                                password = "Password(8-12 characters)";
                                checkValid(firstName, PATTERN_FOR_NAME);
                                break;

                        case "6":
                                checkEmailArray();
                                break;

                        case "7":
                                System.exit(0);

                        default:
                                System.out.println("Invalid Input try again");
                }
                choiceCheck();
        }

        //main
        public static void main(String args[]) {
                choiceCheck();
        }
}
