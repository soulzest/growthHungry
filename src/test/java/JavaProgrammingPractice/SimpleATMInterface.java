package JavaProgrammingPractice;

//Simple ATM Interface: Simulate an ATM interface where a user
// can check the balance, deposit, and withdraw money. This task
// introduces the concept of maintaining state and handling user choices.

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class SimpleATMInterface {
    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);
        System.out.println("Check the balance press 1, deposit press 2, withdraw press 3");
        int num = SCANNER.nextInt();
        int balance = 10000;
        int deposit, withdraw;
        if (num == 1) {
            checkTheBalance(balance);
        } else if (num == 2) {
            System.out.println("How much you want to deposit?");
            deposit = SCANNER.nextInt();
            deposit(deposit, balance);
        } else {
            System.out.println("How much you want to withdraw?");
            withdraw = SCANNER.nextInt();
            withdraw(withdraw, balance);
        }
    }

    public static void checkTheBalance(int balance) {
        System.out.println("Your balance is " + balance);
    }

    public static void deposit(int depositAmount, int balance) {
        balance = balance + depositAmount;
        System.out.println("Your new balance is " + balance);

    }

    public static void withdraw(int withdrawAmount, int balance) {
        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
            System.out.println("Your new balance is " + balance);
        } else {
            System.out.println("Your withdraw amount is more than your balance");
        }

    }
}
