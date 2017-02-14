package com.theironyard.novauc;
import java.util.Scanner;

import java.util.HashMap;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Customer customer = new Customer();
    public static HashMap<String, Double> people = new HashMap<String, Double>();


    public static void main(String[] args) throws Exception {
        // write your code here



            people.put("Rodney", 1200.00);
            people.put("Bradley", 1500.00);
            people.put("George", 2750.50);
            people.put("William", 2200.12);
            people.put("Ronald", 3515.25);
            people.put("Hallie", 5500.00);

        boolean run = true;
        while (run) {

            System.out.print("Hello,");

            customer.chooseName();
            //   customer.chooseAccount();
            customer.chooseTransaction();

//
//        customer.findType("1. Display Balance");
//        customer.findType("2. Withdrawal");
//        customer.findType("3. Deposit");
//        customer.findType("4. Remove Account");
//        customer.findType("5. Cancel");

  //          String line = scanner.nextLine();

            {


            }


//
//        public static String nextLine(){
//        String line = scanner.nextLine();
//
//        while(line.startsWith("/")) {
//
//            switch() {
//
//                case "/transaction":
//                    for (String type: customer.types) {
//                        System.out.println(type);
//
//                    }
//                    break;
//
//                case "/exit":
//                    System.exit(0);
//                    break;
//
//                default:
//                    System.out.println("Command not found!");
//                    break;
//
//            }
//
//            line = scanner.nextLine();
//
//        }
//        return line;
//
//    }


            //      System.out.println("Is Jacob a user " +isfalse);
//
            //      boolean containsKey;
            //      while(people.hasNext() && valueSetIterator.hasNext()){
            //            String key = keySetIterator.next();
            //  if(mArrayList.contains(key)){
            //      System.out.println("Yes! its a " + key);
            //  }

            //  System.out.println("Welcome, Customer.");
            //  out.println(" What is your name?");

            //  Scanner scanner = new Scanner(in);


            //  String people = scanner.nextLine();


//                 Object customersBal = people.get("people" + people);
            //              System.out.println(customersBal);


            //      System.out.println("Here is you balance: " + people);

            //  }
            //  System.out.println("What would you like to do? 1. Display Balance 2. Withdrawal 3. Cancel");
            //  String transaction = scanner.nextLine();


        }
    }

}






