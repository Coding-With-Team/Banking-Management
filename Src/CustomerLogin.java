package HomeWork.Bankingproject;

import java.util.Scanner;

public class CustomerLogin {

    Scanner sc = new Scanner(System.in);
    double balance=5000 ;
    static double amt;
    static double amount;

    void CheckAccount() {

        System.out.println("Enter Customer id:- ");
        int ch = sc.nextInt();

        if (ch == CustomerDetails.id) {
            System.out.println("Customer Id:- " + CustomerDetails.id);
            System.out.println("Customer Name:- " + CustomerDetails.name);
            System.out.println("Customer Email Id:- " + CustomerDetails.email);
            System.out.println("Customer Mobile Number:- " + CustomerDetails.phno);
            System.out.println("Customer Adress:- " + CustomerDetails.adress);
            System.out.println("Customer Gender:- " + CustomerDetails.gender);
            System.out.println("Customer Addhar Card Number:- " + CustomerDetails.addhar);
            System.out.println("Customer Pan Card number:- " + CustomerDetails.pan);
            System.out.println("Customer Bank name:- " + CustomerDetails.h);
            System.out.println("Customer bank Account Number : " + BankDetails.acc);
            System.out.println("Customer IFSC code:- " + BankDetails.ifsc);
            System.out.println("Avilable Balance:-" + balance);
        }
    }
    void deposit() {

        System.out.println("Enter Account Number:- ");
        int ac = sc.nextInt();
        if (ac == BankDetails.acc) {
            System.out.println("Enter amount u want to deposit :");
            amount = sc.nextDouble();
            balance = balance + amount;
            System.out.println("Avilable Balance:-"+balance);
        }

    }

    void withdraw() {
        System.out.println("Enter Account Number:- ");
        int ac1 = sc.nextInt();
        if (ac1 == BankDetails.acc) {
            System.out.println("Enter amount u want to withdraw");
            amt = sc.nextDouble();
            if (balance >= amt) {
                balance = balance - amt;
            } else {
                System.out.println("Less Balance..Transaction Failed..");
            }
            System.out.println("Avilable Balance:-"+balance);
        }

    }
    void CheckBalance() {
        System.out.println("Enter Account Number:- ");
        int ac2 = sc.nextInt();
        if (ac2 == BankDetails.acc) {
            System.out.println("Customer id:- " + CustomerDetails.id);
            System.out.println("Customer Name:- " + CustomerDetails.name);
            System.out.println("Customer Bank name:- " + CustomerDetails.h);
            System.out.println("Account number:- " + BankDetails.acc);
            System.out.println("IFSC Code:- " + BankDetails.ifsc);
            System.out.println("Avilable Balance:-" + balance);
        }
    }
}