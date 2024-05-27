package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        while (true) {
            String[] input = sc.nextLine().split("\\s+");
            String command = input[0];

            if (command.equals("End")) {
                break;
            }

            switch (command) {
                case "Create":
                    BankAccount account = new BankAccount();
                    accounts.add(account);
                    System.out.println("Account ID" + account.getId() + " created");
                    break;
                case "Deposit":
                    int depositId = Integer.parseInt(input[1]);
                    double amount = Double.parseDouble(input[2]);
                    if (amount > 0 && depositId <= accounts.size()) {
                        BankAccount depositedAccount = accounts.get(depositId - 1);
                        depositedAccount.deposit(amount);
                        System.out.println("Deposited " + amount + " to ID " + depositId);
                    } else System.out.println("Account does not exist");
                    break;
                case "SetInterest":
                    double interest = Double.parseDouble(input[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case "GetInterest":
                    int interestId = Integer.parseInt(input[1]);
                    int years = Integer.parseInt(input[2]);
                    if (years > 0 && interestId <= accounts.size()) {
                        BankAccount interestAccount = accounts.get(interestId - 1);
                        double interestAmount = interestAccount.getInterest(years);
                        System.out.println("Interest for ID" + interestId + " for " + years + " years: " + interestAmount);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }

        }

    }

    public static class BankAccount {
        private int id;
        private double balance;
        private static double interestRate = 0.02;

        private static int lastId = 0;

        public BankAccount() {
            this.id = ++lastId;
            this.balance = 0;
        }

        public int getId() {
            return id;
        }

        public double getBalance() {
            return balance;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public static void setInterestRate(double interest) {
            interestRate = interest;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                this.balance += amount;
            }
        }

        public double getInterest(int years) {
            return this.balance * interestRate * years;
        }
    }
}
