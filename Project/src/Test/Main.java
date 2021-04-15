package Test;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

import bloodstock.model.BloodstockUI;
import donors.model.DonorsUI;
import reqblood.model.RequestBloodUI;

public class Main {

	public static void main(String[] args) throws SQLException, ParseException {

		do
		{
		System.out.println("           WELCOME TO NATIONAL BLOOD BANK");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("1. Donate the Blood\r\n" +  
                   "2. Request for Blood\r\n" +  
                   "3. Check BloodStock\r\n" + 
                   "4. Exit");
        System.out.println("********************************************");
        System.out.println("Enter the Choice");
        Scanner sc1=new Scanner(System.in);
        System.out.println("********************************************");
           String choice=sc1.nextLine();
           
           
           switch(choice) {
           case "1": 
        	         DonorsUI donorui=new DonorsUI();
        	         donorui.ShowMenu();

               
               break;
           case "2":    RequestBloodUI bloodrequest=new RequestBloodUI();
                        bloodrequest.ShowMenu();
               break;   
           case "3":   BloodstockUI bloodstock=new BloodstockUI();
                       bloodstock.ShowMenu();
               break;   
           case "4": System.out.println("=============================================================");
                     System.out.println("THANK YOU FOR CHOOSING NATIONAL BLOODBANK, VISIT AGAIN!");
                     System.out.println("==============================================================");
                     return;
           
           
           }
           }
		while(true);
	}
           }

	


