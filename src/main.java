import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        bank_Options();
        user_Option_Selection();
    }

    public static void bank_Options()
    {
        System.out.println("Welcome to Adrian's Bank! Please select of the options below: ");
        System.out.println("1. Account Opening");
        System.out.println("2. Withdrawal");
        System.out.println("3. Deposit");
        System.out.println("4. Check Balance");
        System.out.println("5. Delete Account");
        System.out.println("6. Update Account");
    }

    public static void user_Option_Selection()
    {
        Scanner scanner = new Scanner(System.in);
        int user_Input;

        System.out.println("Welcome to Adrian's Bank! Please select of the options listed above: ");
        user_Input = scanner.nextInt();

        if(user_Input == 1)
        {
            Scanner scanner2 = new Scanner(System.in);

            System.out.println("First Name: ");
            String first_Name = scanner2.nextLine();

            System.out.println("Last Name: ");
            String last_Name = scanner2.nextLine();

            System.out.println("Username: ");
            String username = scanner2.nextLine();

            System.out.println("Password: ");
            String password = scanner2.nextLine();

            System.out.println("Last Name: ");
            String email_Address = scanner2.nextLine();


            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("output3.txt"));
                writer.append(first_Name + " " + last_Name + " " + username + " " + password + " " + email_Address);
                writer.newLine();
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
/*
            System.out.println("Last Name: ");

            System.out.println("Username: ");

            System.out.println("Password: ");

            System.out.println("Email Address: ");

            System.out.println("Phone Number: ");

            System.out.println("Initial Deposit: ");
*/
        }
    }



