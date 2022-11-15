package HomeWork.Bankingproject;

import java.util.Scanner;

class Login {
    static String id;
    static String pwd ;

    static  void AdminLoginInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Admin Login Id:- ");
        id=sc.next();
        System.out.print("Enter Admin Login Password:- ");
        pwd=sc.next();
    }

    static void AdminLoginData() {

        System.out.println("Admin id: " + id);
        System.out.println("Admin pwd: " + pwd);
    }
}

class user {
    static String id ;
    static String pwd;

    static  void UserLoginInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter User Login Id:- ");
        id=sc.next();
        System.out.print("Enter User Login Password:- ");
        pwd=sc.next();
    }

    static void UserLoginData() {
        System.out.println("User Login id: " + id);
        System.out.println("User Login pwd: " + pwd);

    }
}

class customer {
    static String id ;
    static String pwd ;

    static  void CustomerLoginInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Customer Login Id:- ");
        id=sc.next();
        System.out.print("Enter Customer Login Password:- ");
        pwd=sc.next();
    }
    static void CustomerLoginData() {

        System.out.println("Customer Login id: " + id);
        System.out.println("Customer Login pwd: " + pwd);
    }
}
