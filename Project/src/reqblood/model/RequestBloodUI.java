package reqblood.model;

import java.sql.SQLException;
import java.util.Scanner;

public class RequestBloodUI {
	
	
	public void ShowMenu() throws SQLException
	{
	
	System.out.println("********************************************");
    System.out.println("A. Veiw Request \r\n" +  
            "B. Request for blood\r\n" +  
            "C. Update details of request for blood\r\n" + 
            "D. Cancel blood request\r\n" + 
            "E. Search blood request\r\n" + 
            "F. Exit to Main menu");

System.out.println("********************************************");
System.out.println("Enter the Choice");
Scanner sc1=new Scanner(System.in);
Scanner sc2=new Scanner(System.in);
String choice2=sc1.nextLine();
System.out.println("********************************************");
UserRegDAO udao=new UserRegDAOImpl();
switch(choice2)
{
case "A": System.out.println("View the rquests for blood");
          System.out.println("============================");
          udao.read();
          System.out.println("============================");
          System.out.println("\n\n");
	   break;

case "B":  addRequestUI(sc1, udao);


	   break;

case "C": updateRequestUI(sc1,sc2, udao);
	   break;

case "D": deleteRequestUI(sc1, udao);
	   break;

case "E": System.out.println("Enter request id here");
          System.out.println("======================");
          String sreqid=sc1.nextLine();
          udao.read(sreqid);
       
          System.out.println("\n\n");
	   break;

case "F":  System.out.println("THANK YOU FOR VISIT!"); 
	          return;
}

}

	private void deleteRequestUI(Scanner sc1, UserRegDAO udao) throws SQLException {
		          System.out.println("Enter request id here");
		          System.out.println("======================");
		          String dreqid=sc1.nextLine();
		          udao.delete(dreqid);
		          System.out.println("Your request for blood has been cancelled");
		          System.out.println("\n\n");
	}

	private void updateRequestUI(Scanner sc1, Scanner sc2, UserRegDAO udao) throws NumberFormatException, SQLException {
//		UserReg user=new UserReg();	//MISTAKE
//		udao=new UserRegDAOImpl();
		          System.out.println("Enter ID here");
		          System.out.println("==============");
			         String reqid=sc1.nextLine(); 
			         //check if reqid isnot ignored by user
			        UserReg user=udao.read(reqid);		//obtain existing record and update selectively
			         System.out.println("Enter First Name");
			         System.out.println("=================");
			         String firstname_req=sc1.nextLine();
			         if(!firstname_req.equals(""))
			         {
//			        	 firstname_req=sc1.nextLine();
			        	 user.setFirstName(firstname_req);
			         }
			         System.out.println("Enter Last Name");
			         System.out.println("================");
			         String lastname_req=sc1.nextLine();
			         if(!lastname_req.equals(""))
			         {
//			        	 lastname_req=sc1.nextLine();
			        	 user.setLastName(lastname_req);
			         }
			         System.out.println("Enter Age");
			         System.out.println("==========");
//			         int age_req=sc2.nextInt();
//			         String age2=String.valueOf(age_req);
			         String age_req=sc1.nextLine();
			         if(!age_req.equals(""))
			         {
//			        	 age_req=sc2.nextInt();
			        	 int age3=Integer.parseInt(age_req);
			        	 user.setAge(age3);
			         }
			        	 
			         
			         System.out.println("Enter Gender");
			         System.out.println("=============");
			         String gender_req=sc1.nextLine();
			         
                     if(!gender_req.equals(""))
                     {
//                    	 gender_req=sc1.nextLine();
                    	 user.setGender(gender_req);
                     }
//                     if(!gender_req.equals(""))
//                     {
//                    	
//                     }
			         System.out.println("Enter email id");
			         System.out.println("===============");
			         String mailid_req=sc1.nextLine();
			         if(!mailid_req.equals(""))
			         {
//			        	 mailid_req=sc1.nextLine();
			        	 user.setEmail(mailid_req);
			         }
                    	 
			         System.out.println("Enter Contact number");
			         System.out.println("=====================");
			         String phnno_req=sc1.nextLine();
			         if(!phnno_req.equals(""))
			         {
//			        	 phnno_req=sc1.nextLine();
                    	 user.setContactNumber(phnno_req);
			         }
			         System.out.println("Enter Address");
			         System.out.println("==============");
			         String address_req=sc1.nextLine();
			         if(!address_req.equals(""))
			         {
//			        	 address_req=sc1.nextLine();
                    	 user.setAddress(address_req);
			         }
			         System.out.println("Enter blood group");
			         System.out.println("==================");
			         String bldgrp_req=sc1.nextLine();
			         if(!bldgrp_req.equals(""))
			         {
//			        	 bldgrp_req=sc1.nextLine();
                    	 user.setBloodgroup(bldgrp_req);
			         }
			         System.out.println("Enter the number of blood requirement");
			         System.out.println("======================================");
			         String unit_req=sc1.nextLine();
			        
			         if(!unit_req.equals(""))
			         {
//			        	 unit_req=sc2.nextInt();
			        	 int units=Integer.parseInt(unit_req);
			           user.setUnit(units);
			         }
//			         UserReg user1=new UserReg(reqid,firstname_req,lastname_req,age_req,gender_req,mailid_req,phnno_req,address_req,bldgrp_req,unit_req);
			         udao.update(user);
			         System.out.println("Request details have been successfully updated");
			         System.out.println("\n\n");
	}

	private void addRequestUI(Scanner sc1, UserRegDAO udao) throws NumberFormatException, SQLException {
		
		System.out.println("Enter First Name");
		System.out.println("=================");
		String firstname=sc1.nextLine();
		System.out.println("Enter Last Name");
		System.out.println("================");
		String lastname=sc1.nextLine();
		System.out.println("Enter Age");
		System.out.println("==========");
		String age=sc1.nextLine();
		int age1=Integer.parseInt(age);
		System.out.println("Enter Gender");
		System.out.println("=============");
		String gender=sc1.nextLine();
		System.out.println("Enter email id");
		System.out.println("===============");
		String mailid=sc1.nextLine();
		System.out.println("Enter Contact number");
		System.out.println("=====================");
		String phnno=sc1.nextLine();
		System.out.println("Enter Address");
		System.out.println("==============");
		String address=sc1.nextLine();
		System.out.println("Enter blood group");
		System.out.println("==================");
		String bldgrp=sc1.nextLine();
		System.out.println("Enter the number of blood requirement");
		System.out.println("======================================");
		String unit=sc1.nextLine();
		int unit1=Integer.parseInt(unit);
		
		UserReg user=new UserReg(firstname,lastname,age1,gender,mailid,phnno,address,bldgrp,unit1);
		udao.create(user);
		System.out.println("Your request has been registered successfully");
		  System.out.println("\n\n");
	}
}
