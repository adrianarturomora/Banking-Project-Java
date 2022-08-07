import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        bank_Options();
    }

    public static void bank_Options()
    {
        Scanner scanner = new Scanner(System.in);
        int user_Input;

        System.out.println("Welcome to Adrian's Bank! Please select of the options below: ");
        System.out.println("1. Account Opening");
        System.out.println("2. Withdrawal");
        System.out.println("3. Deposit");
        System.out.println("4. Check Balance");
        System.out.println("5. Delete Account");
        System.out.println("6. Update Account");

        System.out.println("Welcome to Adrian's Bank! Please select of the options listed above: ");
        user_Input = scanner.nextInt();
    }

    public static void user_Option_Selection(int user_Input, Scanner scanner)
    {
    if(user_Input == 1)
    {
        String first_Name;
        String last_Name;
        String username;
        String Password;
        String email_Address;

        System.out.println("First Name: ");
        first_Name = scanner.nextLine();
        System.out.println("Last Name: ");

        System.out.println("Username: ");

        System.out.println("Password: ");

        System.out.println("Email Address: ");

        System.out.println("Phone Number: ");

        System.out.println("Initial Deposit: ");

    }
    }
}

