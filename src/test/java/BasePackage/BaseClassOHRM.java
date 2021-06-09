package BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.timeutil;

public class BaseClassOHRM {
	//Step1
	public static Properties po=new Properties(); //static so can be used any where 
  public static  WebDriver driver;
    
    
    public BaseClassOHRM() {  // constructor to read properties of config class
    	
    	
    	try {
    		FileInputStream file=new FileInputStream("C:\\Users\\Mr Avi\\eclipse-workspace\\ecom1\\src\\test\\java\\enviornmentvariables\\Config.properties");
            po.load(file);
    		}
    	catch (FileNotFoundException a) {
    		a.printStackTrace();}
    		catch(IOException i) {
    			i.printStackTrace();
    		}
    	}
    public static void initiate() {
   String Browsername= 	po.getProperty("browser"); // will read property of browser and store in given variable
    	if (Browsername.equals("Chrome")) {
    		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");     // should open chrome if browser= chrome in config
    		driver=new ChromeDriver();
    	}
    	else if (Browsername.equals("Firefox")) { // should open firefox browser
    		System.setProperty("webdriver.geckodriver.driver", "geckodriver.exe");
    		driver=new FirefoxDriver();
    	
    		}
    	
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(timeutil.timpage, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(timeutil.impl, TimeUnit.SECONDS);
    }
    public static void login() {
    	driver.get(po.getProperty("loginurl"));
    }
    	public static void breakdown() {
    		driver.close();
    	}
    }

