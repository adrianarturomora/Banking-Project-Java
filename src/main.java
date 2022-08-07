import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {


        bank_Options();
        user_Option_Selection(int user_Input, Scanner scanner);
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
        user_Option_Selection(user_Input, scanner);
    }

    public static void user_Option_Selection(int user_Input, Scanner scanner)
    {
        if(user_Input == 1)
        {
           // String first_Name;
            String last_Name;
            String username;
            String Password;
            String email_Address;

            System.out.println("First Name: ");
            String first_Name = scanner.nextLine();

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
                writer.write(first_Name);
                writer.newLine();
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
/*
            System.out.println("Last Name: ");

            System.out.println("Username: ");

            System.out.println("Password: ");

            System.out.println("Email Address: ");

            System.out.println("Phone Number: ");

            System.out.println("Initial Deposit: ");
*/
        }else
            System.exit(0);
    }


}

