package POM;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import BasePackage.BaseClassOHRM;

public class POMPERSONALDETAILS extends BaseClassOHRM{
   @FindBy(id="menu_pim_viewMyDetails")WebElement MyDetails;
   @FindBy(linkText="Personal Details")WebElement PersonalDetails;
   @FindBy(id="btnSave") WebElement EditSave;
   @FindBy(id="personal_txtEmpFirstName") WebElement FirstName;
   @FindBy(css="#personal_txtEmpMiddleName")WebElement MiddleName;
   @FindBy(id="personal_txtEmpLastName")WebElement LastName;
   @FindBy(name="personal[txtEmployeeId]")WebElement EmpID;
   @FindBy(id="personal_txtLicenNo")WebElement DriverLN;
   @FindBy(id="personal_txtNICNo")WebElement SSN;
   @FindBy(id="personal_txtOtherID")WebElement OtherID;
   @FindBy(id="personal_txtLicExpDate")WebElement DLNEXP;// can input date in yyyy-mm-dd format 
   @FindBy(css="#frmEmpPersonalDetails > fieldset > ol:nth-child(2) > li:nth-child(4) > img")WebElement DCal;//d lic calender
   @FindBy(css="#ui-datepicker-div > div > div > select.ui-datepicker-month")WebElement DRMonth;// driver license calendar drop down month
   @FindBy(css="#ui-datepicker-div > div > div > select.ui-datepicker-year")WebElement  DRYear;//driver license calendar drop down year
   @FindBy(css="#ui-datepicker-div > table > tbody > tr:nth-child(1) > td:nth-child(2)")WebElement DRDate;//driver license calendar drop down year
   @FindBy(id="personal_txtSINNo")WebElement SIN;
   @FindBy(id="personal_optGender_1")WebElement GenderM;
   @FindBy(id="personal_optGender_2")WebElement GenderF;
   @FindBy(id="personal_cmbNation")WebElement Country;
   @FindBy(id="personal_txtEmpNickName")WebElement NName;
   @FindBy(id="personal_txtMilitarySer")WebElement Military;
   @FindBy(id="personal_cmbMarital")WebElement MaritalStatus;
   @FindBy(id="personal_DOB") WebElement DOB; // can input date in yyyy-mm-dd format clear 
   @FindBy(css="#ui-datepicker-div > div > div > select.ui-datepicker-month")WebElement DOBMonth;
   @FindBy(css="#ui-datepicker-div > div > div > select.ui-datepicker-year")WebElement DOBYear;
   @FindBy(css="#ui-datepicker-div > table > tbody > tr:nth-child(1) > td:nth-child(3)")WebElement DOBDay;
   @FindBy(css="#frmEmpPersonalDetails > fieldset > ol:nth-child(3) > li:nth-child(4) > img") WebElement BCal;//bday cal
   @FindBy(id="personal_chkSmokeFlag")WebElement Smoke;//if someone wants to smoke
   @FindBy(id="btnAddAttachment")WebElement AddAttachement;
   @FindBy(name="ufile") WebElement ChooseFile;
   @FindBy(id="txtAttDesc") WebElement Comment;
   @FindBy(name="btnSaveAttachment") WebElement Upload;
   
   
	public POMPERSONALDETAILS() {PageFactory.initElements(driver, this);}
	
	public void Mydetails() {MyDetails.click();}
	public void Personaldetails() {PersonalDetails.click();}
	public void Edit() {EditSave.click();}
	public void Fname(String F) {FirstName.clear();     FirstName.sendKeys(F);}
	public void Mname(String M) {MiddleName.clear();    MiddleName.sendKeys(M);}
	public void Lname(String L) {LastName.clear();      LastName.sendKeys(L);}
	public void EID(String E) {EmpID.clear();           EmpID.sendKeys(E);}
	public void DLCN(String D) {DriverLN.clear();       DriverLN.sendKeys(D);}
	public void SSN(String S) {SSN.clear();             SSN.sendKeys(S);	}
	public void Other(String O) {OtherID.clear(); OtherID.sendKeys(O);}
	public void LEXPM(String LE) {DLNEXP.clear(); DLNEXP.sendKeys(LE);}//Use yyyy-dd-mm format 
	public void LEXPD(String M, String D, String Y) {DLNEXP.clear(); DLNEXP.click();
	Select LM=new Select(DRMonth);LM.selectByValue(M);
	Select LY=new Select(DRYear);LY.selectByValue(Y);
	Select LD=new Select(DRDate);LD.selectByValue(D);
	}
	public void SINN(String SI) {SIN.clear();           SIN.sendKeys(SI);}
	public void Male() {GenderM.click();}
	public void Female() {GenderF.click();}
	public void Nationality(String NAT) {Select CO=new Select(Country); CO.selectByVisibleText(NAT);}
	public void NickN(String NN) {NName.clear(); NName.sendKeys(NN);	}
	public void MService(String MS) {Military.clear(); Military.sendKeys(MS);}
	public void MarrigeS(String MR) {Select MRT=new Select(MaritalStatus); MRT.selectByValue(MR);} // Single,Married or other
	public void DOBM(String DO) {DOB.clear(); DOB.sendKeys(DO);}// use yyyy-dd-mm format
	public void DOBD(String MO, String DA, String YE) {DOB.clear(); DOB.click();
	Select DM=new Select(DOBMonth); DM.selectByValue(MO);
	Select DY=new Select(DOBYear); DY.selectByValue(YE);
	Select DD=new Select (DOBDay);DD.selectByValue(DA);}
	public void Smoke() {Smoke.click();}
	public void AddATCH() {AddAttachement.click();}
	public void Choose(String C) {ChooseFile.sendKeys(C);} // pass the path to upload file 
	public void Cmnt(String cmt) {Comment.clear(); Comment.sendKeys(cmt);}
	public void Upld() {Upload.click();}
	public void alert() {
		Alert alrt=driver.switchTo().alert();
		alrt.accept();
	}
	public void dcal() {
		DCal.click();
	}
    public void bcal() {
    	BCal.click();
    }
}
