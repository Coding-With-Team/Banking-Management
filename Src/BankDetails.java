package HomeWork.Bankingproject;

import java.util.Scanner;

public class BankDetails extends CustomerDetails {
  static  Long acc;
  static  String ifsc;
    void bankDataShow(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Bank Name:- ");
        h1=sc.next();
        if (h.equals(h1)){
            System.out.println("Enter Account Number:- ");
           acc=sc.nextLong();
            System.out.println("Enter IFSC code:- ");
            ifsc=sc.next();
        }else {
            System.out.println("Pls Enter Correct Bank Details");
        }
    }
}



