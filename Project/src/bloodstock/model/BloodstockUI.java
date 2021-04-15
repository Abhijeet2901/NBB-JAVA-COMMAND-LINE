package bloodstock.model;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class BloodstockUI {

	public void ShowMenu() throws SQLException, ParseException
	{
		System.out.println("********************************************");
        System.out.println("A. Veiw blood stock \r\n" +  
                "B. Search blood stock\r\n" +  
                "C. Update blood stock\r\n" + 
                "D. Exit\r\n");
        
        System.out.println("********************************************");
        System.out.println("Enter the Choice");
        Scanner sc1=new Scanner(System.in);
        String choice3=sc1.nextLine();
        System.out.println("********************************************");
        BloodGroupDAO bdao=new BloodGroupDAOImpl();
        switch(choice3)
        {
        case "A": System.out.println("View blood stock");
                  System.out.println("=================");
                  bdao.read();
                  System.out.println("\n\n");
     	        break;
        
        case "B": System.out.println("Enter blood group here");
                  System.out.println("=======================");
                  String blgrp=sc1.nextLine();
                  bdao.read(blgrp);
                  System.out.println("\n\n");
     	   break;
        
        case "C": bloodstockUpdateUI(sc1, bdao);
     	   break;
        
        case "D": System.out.println("THANK YOU FOR VISIT!");
                  return;
     	   
        }
	}

	private void bloodstockUpdateUI(Scanner sc1, BloodGroupDAO bdao) throws NumberFormatException, SQLException {
		          System.out.println("Enter blood group here");
                  System.out.println("=======================");
                  String bldgrp=sc1.nextLine();
                  System.out.println("Enter the number of units to be added");
                  System.out.println("======================================");
                  String unit=sc1.nextLine();
                  int unit1=Integer.parseInt(unit);
                  
                  BloodGroup bgrp=new BloodGroup(bldgrp,unit1);
                  
                  bdao.update(bgrp);
                  System.out.println("Blood stock has been updated successfully");
                  System.out.println("\n\n");
	}
	
}
