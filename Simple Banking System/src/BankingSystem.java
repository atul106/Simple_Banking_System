import java.sql.SQLOutput;
import java.util.Scanner;
public class BankingSystem {
    public static void main(String[] args) {
        System.out.println("Welcome To our Bank");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number");
         String  accountNumber = sc.next();

        if (accountNumber.length() < 10) {
            System.out.println("You have entered a wrong account number.");
            return; // Exit the program if the account number is less than 10 digits
        }
         else{
            System.out.println("What Services Are you looking for ? \n");
        }


        // Services Provided by the Bank

        System.out.println("1: Check Account Balance");
        System.out.println("2: Cash Deposit");
        System.out.println("3: Cash Withdraw");
        System.out.println("4: Feedback for us");

        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your Account Balance is :  ");
                break;
            case 2:
                System.out.println("Enter the Amount you want to deposit");
                int amount = sc.nextInt();
                System.out.println("You have deposited the amount"  +  amount);
                break;
            case 3:
                System.out.println("Enter the amount you want to withdraw");
                int withdraw_amount = sc.nextInt();
                System.out.println("You withdraw the amount" + withdraw_amount);
                break;
            case 4:
                System.out.println("Share Your Feedback with us : ");
                String feedback = sc.nextLine();
                 feedback = "";
                while (feedback.isEmpty()) {
                    feedback = sc.nextLine();
                    if (feedback.isEmpty()) {
                        System.out.println("Please provide your feedback.");
                    }
                }
                System.out.println("Thanks for Sharing Feedback");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        }





    }

