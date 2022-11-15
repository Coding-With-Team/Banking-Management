package HomeWork.Bankingproject;

import java.util.Scanner;

public class Main {
    void mainmethod(){
        System.out.println("      ******WELCOME TO BANKING PROJECT******      ");
        Login.AdminLoginInput();
        user.UserLoginInput();
        customer.CustomerLoginInput();
        System.out.println();
        int data;
        Scanner sc = new Scanner(System.in);
        System.out.println("****BANKING PROJECT****");
        UserLogin u = new UserLogin();
        AdminLogin a = new AdminLogin();
        CustomerLogin c = new CustomerLogin();
        do {
            System.out.println("  ...Login... \n 1.Admin Login\n 2.User Login\n 3.Customer Login\n 4.Stop");
            System.out.print("Enter Ur Choice :");
            data = sc.nextInt();
            if (data == 1 || data == 2 || data == 3 || data == 4) {
                switch (data) {
                    case 1:
                        System.out.println("****Admin Login-****");
                        System.out.print("Enter Admin Id:- ");
                        String admin = sc.next();
                        System.out.print("Enter Admin Password:- ");
                        String adminpwd = sc.next();

                        if (admin.equals(Login.id) && adminpwd.equals(Login.pwd)) {

                            System.out.println("****....Admin Login Page....****\n 1.Edit Customer details\n 2.View Customer Details\n 3.View User Login Data\n 4.View Customer Login Data\n 5.Allocated Accno");
                            System.out.print("Enter Ur Choice :");
                            int data1 = sc.nextInt();
                            switch (data1) {
                                case 1:
                                    a.EditCustomerDetails();
                                    System.out.println("Data Updated Succes Fully");
                                    System.out.println("Press 1 to Return To The Admin Login ");
                                    int ch1 = sc.nextInt();
                                    if (ch1 == 1) {
                                        System.out.println("****....Admin Login Page....****\n 1.Edit Customer details\n 2.View Customer Details\n 3.View User Login Data\n 4.View Customer Login Data\n 5.Allocated Accno");
                                        System.out.print("Enter Ur Choice :");
                                        int data3 = sc.nextInt();

                                    } else {
                                        System.out.println("Pls Enter a Valid Input");
                                        return;
                                    }
                                case 2:
                                    a.ViewCustomerDetails();
                                    System.out.println("Press 1 to Return To The Admin Login ");
                                    int ch3 = sc.nextInt();
                                    if (ch3 == 1) {
                                        System.out.println("****....Admin Login Page....****\n 1.Edit Customer details\n 2.View Customer Details\n 3.View User Login Data\n 4.View Customer Login Data\n 5.Allocated Accno");
                                        System.out.print("Enter Ur Choice :");
                                        int data3 = sc.nextInt();

                                    } else {
                                        System.out.println("Pls Enter a Valid Input");
                                        return;
                                    }
                                case 3:
                                    a.ViewUserLoginData();
                                    System.out.println("Press 1 to Return To The Admin Login ");
                                    int ch4 = sc.nextInt();
                                    if (ch4 == 1) {
                                        System.out.println("****....Admin Login Page....****\n 1.Edit Customer details\n 2.View Customer Details\n 3.View User Login Data\n 4.View Customer Login Data\n 5.Allocated Accno");
                                        System.out.print("Enter Ur Choice :");
                                        int data3 = sc.nextInt();

                                    } else {
                                        System.out.println("Pls Enter a Valid Input");
                                        return;
                                    }
                                case 4:
                                    a.ViewCustomerLoginData();
                                    System.out.println("Press 1 to Return To The Admin Login ");
                                    int ch5 = sc.nextInt();
                                    if (ch5 == 1) {
                                        System.out.println("****....Admin Login Page....****\n 1.Edit Customer details\n 2.View Customer Details\n 3.View User Login Data\n 4.View Customer Login Data\n 5.Allocated Accno");
                                        System.out.print("Enter Ur Choice :");
                                        int data3 = sc.nextInt();

                                    } else {
                                        System.out.println("Pls Enter a Valid Input");
                                        return;
                                    }
                                case 5:
                                    a.Allocated();

                            }
                        } else {
                            System.out.println("Pls Enter Valid Id & Password");
                            return;
                        }
                        break;
                    case 2:
                        System.out.println("**** User Login Page - ****");
                        System.out.println("User Login-");
                        System.out.print("Enter User Id:- ");
                        String User = sc.next();
                        System.out.print("Enter User Password:- ");
                        String Userpwd = sc.next();

                        if (User.equals(user.id) && Userpwd.equals(user.pwd)) {

                            System.out.println("****....USer Login Page....****\n 1.Open Account\n2.View Customer Details");
                            System.out.print("Enter Ur Choice :");
                            int data2 = sc.nextInt();

                            switch (data2) {
                                case 1:
                                    u.OpenAccount();
                                    System.out.println("Data Added Succes Fully");
                                    System.out.println("Press 1 to Return To The User Login ");
                                    int ch2 = sc.nextInt();
                                    if (ch2 == 1) {
                                        System.out.println("****....USer Login Page....****\n 1.Open Account\n2.View Customer Details");
                                        System.out.print("Enter Ur Choice :");
                                        int data3 = sc.nextInt();

                                    } else {
                                        System.out.println("Pls Enter a Valid Input");
                                        return;
                                    }
                                case 2:
                                    u.ViewCustomerDetails();
                            }

                        } else {
                            System.out.println("Pls Enter Valid Id & Password");
                            return;
                        }
                        break;
                    case 3:
                        System.out.println("**** Customer Login Page- ****");
                        System.out.print("Enter Customer Id:- ");
                        String cid = sc.next();
                        System.out.print("Enter Customer Password:- ");
                        String cpwd = sc.next();
                        if (cid.equals(customer.id) && cpwd.equals(customer.pwd)) {
                            System.out.println("****....Customer Login Page....****\n 1.Check Account\n 2.Deposit\n 3.Withdraw\n 4.Check Balance");
                            System.out.print("Enter Ur Choice :");
                            int data4 = sc.nextInt();
                            switch (data4) {
                                case 1:
                                    c.CheckAccount();
                                    System.out.println("Press 1 to Return To The User Login ");
                                    int ch7 = sc.nextInt();
                                    if (ch7 == 1) {
                                        System.out.println("****....Customer Login Page....****\n 1.Check Account\n 2.Deposit\n 3.Withdraw\n 4.Check Balance");
                                        System.out.print("Enter Ur Choice :");
                                        int data3 = sc.nextInt();
                                    } else {
                                        System.out.println("Pls Enter a Valid Input");
                                        return;
                                    }

                                case 2:
                                    c.deposit();
                                    System.out.println(CustomerLogin.amount + " Rupess Deposit Sucessfully.....");
                                    System.out.println("Press 1 to Return To The User Login ");
                                    int ch8 = sc.nextInt();
                                    if (ch8 == 1) {
                                        System.out.println("****....Customer Login Page....****\n 1.Check Account\n 2.Deposit\n 3.Withdraw\n 4.Check Balance");
                                        System.out.println("Enter Ur Choice: " );
                                        int data3 = sc.nextInt();
                                    } else {
                                        System.out.println("Pls Enter a Valid Input");
                                        return;
                                    }
                                case 3:
                                    c.withdraw();
                                    System.out.println(CustomerLogin.amt + " Rupess Withdraw Sucessfully.....");
                                    System.out.println("Press 1 to Return To The User Login ");
                                    int ch10 = sc.nextInt();
                                    if (ch10 == 1) {
                                        System.out.println("****....Customer Login Page....****\n 1.Check Account\n 2.Deposit\n 3.Withdraw\n 4.Check Balance");
                                        System.out.print("Enter Ur Choice :");
                                        int data3 = sc.nextInt();
                                    } else {
                                        System.out.println("Pls Enter a Valid Input");
                                        return;
                                    }
                                case 4:
                                    c.CheckBalance();
                                    System.out.println("Press 1 to Return To The User Login ");
                                    System.out.print("Enter Ur Choice :");
                                    int ch11 = sc.nextInt();
                                    if (ch11 == 1) {
                                        System.out.println("****....Customer Login Page....****\n 1.Check Account\n 2.Deposit\n 3.Withdraw\n 4.Check Balance");
                                        System.out.print("Enter Ur Choice :");
                                        int data3 = sc.nextInt();
                                    } else {
                                        System.out.println("Pls Enter a Valid Input");
                                        return;
                                    }
                            }
                        } else {
                            System.out.println("Pls Enter Valid Id & Password");
                            return;
                        }
                        break;
                    case 4:
                        System.out.println("      ****Thank U Visit Again****      ");
                        return;
                }

            } else {
                System.out.println("pls enter a valid input");
                return;
            }
        } while (data != 3);
    }
}



