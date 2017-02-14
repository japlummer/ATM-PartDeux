package com.theironyard.novauc;

import com.sun.jdi.IntegerType;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

import static java.lang.System.in;

/**
 * Created by JacobP on 2/11/17.
 */
public class Customer {

    String user;
    String account;
    String transaction;
    ArrayList<String> types = new ArrayList<>();
    String name;
    Double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    //    public void findType(String type) {
//        System.out.println("Please choose a transaction  " + type + "! select account? [Y/N]");
//
//        String answer = Main.scanner.nextLine();
//
//        if (answer.equalsIgnoreCase("y")) {
//            types.add(type);
//            System.out.println("Transaction complete!");


    public void chooseName() {
        System.out.println(" What is your name?");
        Scanner scanner = new Scanner(in);
        String name = scanner.nextLine();
        Main.customer.setName(name);

        if (Main.people.containsKey(name)) {
            System.out.println("Your balance is: " + Main.people.get(name));
            Main.customer.setBalance(Main.people.get(name));
        } else {
            System.out.println("No User found.");
            System.out.println("Would you like to create an account? [Y/N]");
            String answer = Main.scanner.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                // prompt for amount to deposit
                // store a variable to represents the deposit amount
                // use name variable and deposit amount variable to "create" new account
                System.out.println("How much do you want to deposit? ");
                String deposit = scanner.nextLine();
                Double amount = Double.valueOf(deposit);
                Main.customer.setBalance(amount);
                Main.people.put(name, amount);
                System.out.println("You created a checking account!");
            }
        }
    }


//  //  public void chooseAccount() throws Exception {
//        System.out.println("What type of account[checking/savings]");
//        account = Main.scanner.nextLine();
//        if (account.equalsIgnoreCase("checking")) {
//            System.out.println("you selected a checking account!");
//        } else if (account.equalsIgnoreCase("savings")) {
//            System.out.println("you selected a checking account!");
//        } else {
//            throw new Exception("Invalid selection.");
//        }
    // }


    public void chooseTransaction() throws Exception {
        // change to prompt for all options
        System.out.println("Please make a selection: 1. Check Balance 2. Withdrawal 3. Deposit 4. Remove 5. Cancel");
        transaction = Main.scanner.nextLine();
        Integer account = Integer.valueOf(transaction);

        switch (account) {
            case 1:
                // code for check balance
                System.out.println("Available balance is: " + Main.people.get(Main.customer.getName()));
                break;

            case 2:

                System.out.println("Select an amount to withdraw");
                String withdraw = Main.scanner.nextLine();
                double withdrawAmount = Double.valueOf(withdraw);

                if (withdrawAmount > Main.customer.getBalance()) {
                    throw new Exception("Insufficient Funds.");
                } else {
                    balance = Main.customer.getBalance() - withdrawAmount;
                    System.out.println("Take your money. Your new balance is " + balance);
                    Main.people.put(Main.customer.getName(), balance);


                }

                    break;
                    case 3:
                        System.out.println("Select an amount to deposit");
                        String deposit = Main.scanner.nextLine();
                        double depositAmount = Double.valueOf(deposit);
                        balance = balance + depositAmount;
                  //      if (withdrawAmount > balance) {
                   //         throw new Exception("Insufficient Funds.");
                  //      } else {
                            System.out.println("Take your money. Your new balance is " + balance);
                        Main.people.put(Main.customer.getName(), balance);
                        break;

                    case 4:
                        System.out.println("Your account will be removed.");
                       Main.people.remove(name);
  //                     went to hashmap containing user to be removed. remove called for the key in the hashmap that we want to remove.

//                            }

                        break;

                    case 5:
                        System.out.println("Thank you your transaction is finished.");



//    public static String nextLine() {
//        String number = Main.scanner.nextLine();
//
//        switch (number) {
//
//            case "/transaction":
//                for (String type : Main.customer.types) {
//                    System.out.println(type);
//
//                }
//                break;
//
//            case "/exit":
//                System.exit(0);
//                break;
//
//            default:
//                System.out.println("Command not found!");
//                break;

//        }
//
//        number = Main.scanner.nextLine();
//
//
//        return number;
                }


    }
}















        // setup switch to allow customer to use options
//        if (transaction.equalsIgnoreCase("Remove")) {
//            System.out.println("Deleting account ...");
//        } else if (transaction.equalsIgnoreCase("Exit")) {
//            System.out.println("Thank you and come again!");
//        } else {
//            throw new Exception("Invalid transaction");
//        }




