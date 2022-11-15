package HomeWork.Bankingproject;

import java.util.Scanner;

public class AdminLogin extends UserLogin {
    Scanner sc = new Scanner(System.in);

    void EditCustomerDetails() {
        BankDetails bank = new BankDetails();
        System.out.println("Enter Customer Id :- ");
        id = sc.nextInt();
        System.out.println("Enter Customer Name :- ");
        name = sc.next();
        System.out.println("Enter Customer Emai Id :- ");
        email = sc.next();
        System.out.println("Enter Customer Mobile Number :- ");
        phno = sc.nextLong();
        System.out.println("Enter Customer Adress :- ");
        adress = sc.next();
        System.out.println("Enter Customer Addhar number :- ");
        addhar = sc.nextLong();
        System.out.println("Enter Customer Pan Card number :- ");
        pan = sc.next();
        System.out.println("Enter Customer Gender :- ");
        gender = sc.next();
    }

    void ViewCustomerDetails() {
        System.out.println("Customer Id:- " + id);
        System.out.println("Customer Name:- " + name);
        System.out.println("Customer Email Id:- " + email);
        System.out.println("Customer Mobile Number:- " + phno);
        System.out.println("Customer Adress:- " + adress);
        System.out.println("Customer Gender:- " + gender);
        System.out.println("Customer Addhar Card Number:- " + addhar);
        System.out.println("Customer Pan Card number:- " + pan);

    }

    void ViewUserLoginData() {

        user.UserLoginData();
    }

    void ViewCustomerLoginData() {
        customer.CustomerLoginData();
    }

    void Allocated() {
        BankDetails b=new BankDetails();
        b.bankDataShow();
    }

}
