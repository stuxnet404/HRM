package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePackage.BaseClassOHRM;
import POM.POMLOGIN;
import POM.POMPERSONALDETAILS;

public class PersonalDetails extends BaseClassOHRM {
     POMPERSONALDETAILS PD;
     POMLOGIN LG;
     public PersonalDetails() {
    	 super();
     }
     @BeforeMethod
     public void init() {
    	 initiate();
    	 login();
    	 LG=new POMLOGIN();
    	 PD=new POMPERSONALDETAILS();
    	 LG.inputUsr(po.getProperty("username"));
    	 LG.inputPassword(po.getProperty("password"));
    	 LG.submit();
    	 String actual=driver.getCurrentUrl();
    	 String expected = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
    	 Assert.assertEquals(actual, expected); 
    	 }
		 @Test 
		 public void TC1(){ PD.Mydetails();PD.Personaldetails();PD.Edit();
			  PD.Fname("Tester");PD.Mname("is");PD.Lname("TESTING");PD.EID("123456");PD.
			  DLCN("MJ1245678910");
			  PD.SSN("747474");PD.Other("Healthcard 123456789");PD.LEXPM("2022-12-21");PD.
			  dcal(); PD.SINN("456789123");
			  PD.Male();PD.Nationality("Canadian");PD.MarrigeS("Single");PD.DOBM(
			  "1995-01-21");PD.bcal(); PD.NickN("NICK");PD.MService("Never");PD.Edit();
			  PD.AddATCH();PD.
			  Choose("C:\\Users\\Mr Avi\\eclipse-workspace\\total\\src\\total1\\Fname.png")
			  ;PD.Cmnt("TRy it");PD.Upld(); }
			 
    
		
		  @AfterMethod 
		  public void close() { breakdown(); }
		 
      }

