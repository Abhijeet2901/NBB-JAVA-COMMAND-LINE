package donors.model;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DonorsUI {

	public void ShowMenu() throws SQLException, ParseException
	{
		  System.out.println("********************************************");
          System.out.println("A. Veiw Doner \r\n" +  
                      "B. Add Doner\r\n" +  
                      "C. Update Doner\r\n" + 
                      "D. Delete Doner\r\n" + 
                      "E. Search Doner\r\n" + 
                      "F. Exit to Main menu");

System.out.println("********************************************");
          System.out.println("Enter the Choice");
          Scanner sc1=new Scanner(System.in);
          Scanner sc2=new Scanner(System.in);
          String choice1=sc1.nextLine();
          System.out.println("********************************************");
          DonorDAO ddao=new DonorDAOImpl();
         
          switch(choice1)
          {
          case "A":
                   ddao.read();
                   
                   return;
      
          case "B":addDonorUI(sc1, ddao);
              break;   
          case "C": updateDonor(sc1,sc2, ddao);
                    
              break;   
          case "D": deleteDonorUI(sc1, ddao);
              break; 
          case "E": System.out.println("Enter Donor's ID: ");
                    int did=sc1.nextInt();
                    ddao.read(did);
                    System.out.println("\n\n");
                  
              break;  
          case "F": System.out.println("THANK YOU FOR VISIT!");
                    System.out.println("\n\n");
                    return; 
	}
          

}

	private void deleteDonorUI(Scanner sc1, DonorDAO ddao) throws SQLException {
		System.out.println("Enter Donor's Id: ");
                    int id=sc1.nextInt();
                    ddao.delete(id);
                    System.out.println("Record deleted successfully");
                    System.out.println("============================");
                    System.out.println("\n\n");
	}

	private void updateDonor(Scanner sc1, Scanner sc2, DonorDAO ddao) throws NumberFormatException, ParseException, SQLException {
		
		System.out.println("Enter Donor's ID: ");
                    System.out.println("==================");
                    String uid=sc1.nextLine();
                    int duid=Integer.parseInt(uid);
                    Donors donor=ddao.read(duid);
                    System.out.println("Enter First Name");
                    System.out.println("================");
                    String firstname1=sc1.nextLine();
                    if(!firstname1.equals(""))
                    donor.setFirstname(firstname1);
                    System.out.println("Enter Last Name");
                    System.out.println("===============");
                    String lastname1=sc1.nextLine();
                    if(!lastname1.equals(""))
                    donor.setLastname(lastname1);
                    System.out.println("Enter Age");
                    System.out.println("=========");
                    String age_u=sc1.nextLine();
                    if(!age_u.equals(""))
                    {
                    int age2=Integer.parseInt(age_u);
                    donor.setAge(age2);
                    }
                    
                    System.out.println("Enter Gender");
                    System.out.println("============");
                    String gender1=sc1.nextLine();
                    if(!gender1.equals(""))
                    donor.setGender(gender1);
                    System.out.println("Enter Date of birth in 'DD-MMM-YYYY' format");
                    System.out.println("===========================================");
                    String dateofbirth_u=sc1.nextLine();
                    if(!dateofbirth_u.equals(""))
                    {
                    SimpleDateFormat sdfu=new SimpleDateFormat("dd-MMM-yyyy");
                    Date dateofbirth2=sdfu.parse(dateofbirth_u);
                    donor.setDob(dateofbirth2);
                    }
                    System.out.println("Enter Height in 'CM'");
                    System.out.println("====================");
                    String height_u=sc1.nextLine();
                    if(!height_u.equals(""))
                    {
                    int height2=Integer.parseInt(height_u);
                    donor.setHeight(height2);
                    }
                    System.out.println("Enter weight in 'KG'");
                    System.out.println("====================");
                    String weight_u=sc1.nextLine();
                    if(!weight_u.equals(""))
                    {
                    int weight2=Integer.parseInt(weight_u);
                    donor.setWeight(weight2);
                    }
                    System.out.println("Enter email id");
                    System.out.println("==============");
                    String mailid1=sc1.nextLine();
                    if(!mailid1.equals(""))
                    	donor.setMailid(mailid1);
                    System.out.println("Enter Contact number");
                    System.out.println("====================");
                    String phnno1=sc1.nextLine();
                    if(!phnno1.equals(""))
                    	donor.setPhone(phnno1);
                    System.out.println("Enter Address");
                    System.out.println("=============");
                    String address1=sc1.nextLine();
                    if(!address1.equals(""))
                    	donor.setAddress(address1);
                    System.out.println("Enter your Blood group");
                    System.out.println("=======================");
                    String bldgrp1=sc1.nextLine();
                    if(!bldgrp1.equals(""))
                    	donor.setBloodgrp(bldgrp1);
                    System.out.println("Dononted Blood since last year? (give your response in form of 'Y' for yes & 'N' for no)");
                    System.out.println("========================================================================================");
                    String flag1=sc1.nextLine();
                    if(!flag1.equals(""))
                    	donor.setFlag(flag1);
                    System.out.println("Enter your Last Blood donation Date in 'DD-MMM-YYYY' format");
                    System.out.println("===========================================================");
                    String lastblooddonation_u=sc1.nextLine();
                    if(!lastblooddonation_u.equals(""))
                    {
                    SimpleDateFormat sdfu1=new SimpleDateFormat("dd-MMM-yyyy");
                    Date lastblooddonation2=sdfu1.parse(lastblooddonation_u);
                    donor.setLastblooddonation(lastblooddonation2);
                    }
                    
//                    Donors donoru=new Donors(duid,firstname1,lastname1,age2,gender1,dateofbirth2,height2,weight2,mailid1,phnno1,address1,bldgrp1,flag1,lastblooddonation2);
                    ddao.update(donor);
                    System.out.println("Donor updated successfully");
                    System.out.println("\n\n");
	}

	private void addDonorUI(Scanner sc1, DonorDAO ddao) throws NumberFormatException, ParseException, SQLException {
		
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
                   System.out.println("Enter Date of Birth in 'DD-MMM-YYYY' format");
                   System.out.println("============================================");
                   String dateofbirth=sc1.nextLine();
                   SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
                   Date dateofbirth1=sdf.parse(dateofbirth);
                   System.out.println("Enter Height in 'CM'");
                   System.out.println("=====================");
                   String height=sc1.nextLine();
                   int height1=Integer.parseInt(height);
                   System.out.println("Enter weight in 'KG'");
                   System.out.println("=====================");
                   String weight=sc1.nextLine();
                   int weight1=Integer.parseInt(weight);
                   System.out.println("Enter email id");
                   System.out.println("===============");
                   String mailid=sc1.nextLine();
                   System.out.println("Enter Contact number");
                   System.out.println("=====================");
                   String phnno=sc1.nextLine();
                   System.out.println("Enter Address");
                   System.out.println("==============");
                   String address=sc1.nextLine();
                   System.out.println("Enter your Blood group");
                   System.out.println("========================");
                   String bldgrp=sc1.nextLine();
                   System.out.println("Dononted Blood since last year? (give your response in form of 'Y' for yes & 'N' for no)");
                   System.out.println("=========================================================================================");
                   String flag=sc1.nextLine();
                   System.out.println("Enter your Last Blood donation Date in 'DD-MMM-YYYY' format");
                   System.out.println("============================================================");
                   String lastblooddonation=sc1.nextLine();
                   SimpleDateFormat sdf1=new SimpleDateFormat("dd-MMM-yyyy");
                   Date lastblooddonation1=sdf1.parse(lastblooddonation);
                   
                   
                   Donors donor=new Donors(firstname,lastname,age1,gender,dateofbirth1,height1,weight1,mailid,phnno,address,bldgrp,flag,lastblooddonation1);
                   ddao.create(donor);
                   System.out.println("Donor Registered successfully");
                   System.out.println("\n\n");
	}
}
