package stepDefinations;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hackthone.hackthone5.Login;

import resources.base;

public class stepDefination extends base {
	private static Logger log = LogManager.getLogger(base.class.getName());

	@Before
	public void setUP() {
		System.out.println("launch chrome");
	}

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		driver = intializeDriver();
		log.info("browser launch");
	}

	@And("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		String url = sheet.getRow(1).getCell(6).getStringCellValue();
		driver.get(url);

	}

	/*
	 * Script Description : Register new user 'Application Automated : opencart
	 * 'Author : Priyanka 'Date Created : 19/04/2021
	 */
	@Then("^click signin$")
	public void click_signin() throws Throwable {
		Login login = new Login(driver);
		Actions act = new Actions(driver);
		act.moveToElement(login.getaccount()).build().perform();
		login.getaccount().click();
		// 1.Test case

		login.getregister().click();
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		String fname = sheet.getRow(1).getCell(0).getStringCellValue();
		login.getfname().sendKeys(fname);

		String lname = sheet.getRow(1).getCell(1).getStringCellValue();
		login.getlname().sendKeys(lname);
		String email = sheet.getRow(1).getCell(2).getStringCellValue();
		login.getemil().sendKeys(email);
		// int tele=(int)sheet.getRow(1).getCell(3).getNumericCellValue();
		// l.getnumber().sendKeys(tele);
		login.getnumber().sendKeys("1236547890");
		String pass = sheet.getRow(1).getCell(4).getStringCellValue();
		login.getpass().sendKeys(pass);
		String confirmpass = sheet.getRow(1).getCell(5).getStringCellValue();
		login.getconfpass().sendKeys(confirmpass);

		login.getradio().click();
		login.getchk().click();
		login.getcontionue().click();
		login.getcontbtn().click();
		driver.close();

	}

	/*
	 * Script Description : Register new user and skip telephone number filed
	 * and catupre error message 'Application Automated : opencart 'Author :
	 * Priyanka 'Date Created : 19/04/2021
	 */
	@Then("^capture sscreenshot$")
	public void capture_sscreenshot() throws Throwable {
		Login login = new Login(driver);
		Actions act = new Actions(driver);
		act.moveToElement(login.getaccount()).build().perform();
		login.getaccount().click();
		// 1.Test case

		login.getregister().click();
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		String fname = sheet.getRow(2).getCell(0).getStringCellValue();
		login.getfname().sendKeys(fname);

		String lname = sheet.getRow(2).getCell(1).getStringCellValue();
		login.getlname().sendKeys(lname);
		String email = sheet.getRow(2).getCell(2).getStringCellValue();
		login.getemil().sendKeys(email);
		// int tele=(int)sheet.getRow(1).getCell(3).getNumericCellValue();
		// l.getnumber().sendKeys(tele);
		// login.getnumber().sendKeys("123654890");
		String pass = sheet.getRow(2).getCell(4).getStringCellValue();
		login.getpass().sendKeys(pass);
		String confirmpass = sheet.getRow(2).getCell(5).getStringCellValue();
		login.getconfpass().sendKeys(confirmpass);

		login.getradio().click();
		login.getchk().click();
		login.getcontionue().click();
		login.getcontbtn().click();

		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src1, new File("C:\\Users\\vighnharta\\Desktop\\hackthone-5\\reports\\snap.png"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.close();

	}

	/*
	 * Script Description : Login user and log page tilte 'Application Automated
	 * : opencart 'Author : Priyanka 'Date Created : 19/04/2021
	 */

	@Then("^click login button$")
	public void click_login_button() throws Throwable {
		Login login = new Login(driver);
		Actions act = new Actions(driver);
		act.moveToElement(login.getaccount()).build().perform();
		login.getaccount().click();
		login.getlogin().click();
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		String email = sheet.getRow(1).getCell(2).getStringCellValue();
		login.getemil().sendKeys(email);
		String pass = sheet.getRow(1).getCell(4).getStringCellValue();
		login.getpass().sendKeys(pass);
		login.getloginbtn().click();
		String title = driver.getTitle();
		System.out.println(title);
		log.info("Title of we page" + title);
		driver.close();
	}

	/*
	 * Script Description : check User is able to add item to cart 'Application
	 * Automated : opencart 'Author : Priyanka 'Date Created : 19/04/2021
	 */
	@Then("^Add to cart$")
	public void add_to_cart() throws Throwable {
		Login login = new Login(driver);
		Actions act = new Actions(driver);
		act.moveToElement(login.getaccount()).build().perform();
		login.getaccount().click();
		login.getlogin().click();
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		String email = sheet.getRow(1).getCell(2).getStringCellValue();
		login.getemil().sendKeys(email);
		String pass = sheet.getRow(1).getCell(4).getStringCellValue();
		login.getpass().sendKeys(pass);
		login.getloginbtn().click();
		act.moveToElement(login.getdekstops()).build().perform();
		login.getdekstops().click();
		login.getmac1().click();
		login.getimac().click();
		login.getaddtocart().click();

		String msg = login.getsuccessmsg().getText();
		log.info(msg);
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src1, new File("C:\\Users\\vighnharta\\Desktop\\hackthone-5\\reports\\snap1.png"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.close();
	}

	/*
	 * Script Description : checkout with guest user 'Application Automated :
	 * opencart 'Author : aarthi 'Date Created : 19/04/2021
	 */

	@Then("^checkout with guest user$")
	public void checkout_with_guest_user() throws Throwable {
		Login login = new Login(driver);
		Actions act = new Actions(driver);
		login.getlaptops().click();
		login.getmore().click();
		login.gethp().click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		login.getdate().sendKeys("2021-05-05");
		login.getaddtocart2().click();
		login.getbasket().click();

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1000)");
		login.getcheckout2().click();
		Thread.sleep(3000);
		login.getradio3().click();
		login.getcontinue3().click();

		login.getfname2().sendKeys("priyanka");
		login.getlname2().sendKeys("sonawane");
		login.getemail2().sendKeys("priyanka@gmail.com");
		login.gettelephone2().sendKeys("1236447950");
		login.getaddress().sendKeys("shirpur");
		login.getcity().sendKeys("dhule");
		login.getpostal().sendKeys("425405");
		Select select = new Select(login.getcountry());
		select.selectByVisibleText("India");

		Select select2 = new Select(login.getstate());
		select2.selectByVisibleText("Maharashtra");
		login.getcont4().click();

		login.getdelevery().sendKeys("hello");
		login.getcont5().click();

		Thread.sleep(3000);
		login.getterms().click();
		login.getcont6().click();
		Thread.sleep(3000);
		login.getconfrimorder().click();

		File src2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src2, new File("C:\\Users\\vighnharta\\Desktop\\hackthone-5\\reports\\snap2.png"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.close();
	}
	/*
	 * Script Description : Verify the user is able to edit the existing login
	 * account 'Application Automated : opencart 'Author : Aarthi 'Date Created
	 * : 19/04/2021
	 */

	@Then("^update user profile$")
	public void update_user_profile() throws Throwable {
		Login login = new Login(driver);
		Actions act = new Actions(driver);
		act.moveToElement(login.getaccount()).build().perform();
		login.getaccount().click();
		login.getlogin().click();
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		String email = sheet.getRow(3).getCell(0).getStringCellValue();
		login.getemil().sendKeys(email);
		String pass = sheet.getRow(3).getCell(1).getStringCellValue();
		login.getpass().sendKeys(pass);
		login.getloginbtn().click();

		Thread.sleep(3000);
		// edit
		driver.findElement(By.xpath("//*[@id='column-right']/div/a[2]")).click();
		// continue
		driver.findElement(By.xpath("//*[@id='content']/form/div/div[2]/input")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		// logout
		driver.findElement(By.xpath("//*[@id='column-right']/div/a[13]")).click();
		// continue
		driver.findElement(By.xpath("//*[@id='content']/div/div/a")).click();
	}

	/*
	 * Script Description : Verify the User is able to upload a file and add the item to the cart, if the user is not able to upload a file then it should show an error message and the user is unable to add the item to the cart.
	 * account 'Application Automated : opencart 'Author : Aarthi 'Date Created
	 * : 19/04/2021
	 */

	@Then("^upload file$")
	public void upload_file() throws Throwable {
		Login log = new Login(driver);

		Actions act = new Actions(driver);
		act.moveToElement(log.getcomponent()).build().perform();
		log.getcomponent().click();
		log.getmonitors().click();
		log.getapple().click();
		Thread.sleep(3000);
		log.getcheckbox4().click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		log.getselect().click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='input-option217']/option[2]")).click();

		driver.findElement(By.xpath("//*[@id='input-option209']")).sendKeys("priyanka");

		driver.findElement(By.xpath("//*[@id='button-upload222']"))
				.sendKeys("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		driver.findElement(By.xpath("//*[@id='button-cart']")).click();
	}

	/*
	 * Script Description : Verify if the user is able to get Estimate of shipping and taxes charges by entering all the mandatory fields and checkout
	 * account 'Application Automated : opencart 'Author : Aatish 'Date Created
	 * : 19/04/2021
	 */
	@Then("^esitimate shipping and taxes$")
	public void esitimate_shipping_and_taxes() throws Throwable {
		Login login = new Login(driver);
		Actions act = new Actions(driver);
		act.moveToElement(login.getaccount()).build().perform();
		login.getaccount().click();
		login.getlogin().click();
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		String email = sheet.getRow(1).getCell(2).getStringCellValue();
		login.getemil().sendKeys(email);
		String pass = sheet.getRow(1).getCell(4).getStringCellValue();
		login.getpass().sendKeys(pass);
		login.getloginbtn().click();
		driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='content']/div[3]/div[1]/div/div[2]/div[1]/h4/a")).click();

		driver.findElement(By.xpath("//*[@id='top-links']/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id='accordion']/div[2]/div[1]/h4/a")).click();
		Thread.sleep(3000);
		Select sel = new Select(driver.findElement(By.xpath("//*[@id='input-country']")));

		sel.selectByVisibleText("India");

		Select sel2 = new Select(driver.findElement(By.xpath("//*[@id='input-zone']")));

		sel2.selectByVisibleText("Maharashtra");
		driver.findElement(By.xpath("//*[@id='input-postcode']")).sendKeys("425405");

		driver.findElement(By.xpath("//*[@id='button-quote']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='modal-shipping']/div/div/div[2]/div/label/input")).click();
		driver.findElement(By.xpath("//*[@id='button-shipping']")).click();

		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src1, new File("C:\\Users\\vighnharta\\Desktop\\mockhackthone5\\reports\\snap1.png"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//*[@id='content']/div[3]/div[2]/a")).click();
	}

	/*
	 * Script Description :Verify if the user is able to check the product availabilty and checkout or if the product is not available the user is unable to place the order
	 * account 'Application Automated : opencart 'Author : Rohith 'Date Created
	 * : 19/04/2021
	 */
	@Then("^product availability$")
	public void product_availability() throws Throwable {
		Login login = new Login(driver);
		Actions act = new Actions(driver);
		act.moveToElement(login.getaccount()).build().perform();
		login.getaccount().click();
		login.getlogin().click();
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		String email = sheet.getRow(1).getCell(2).getStringCellValue();
		login.getemil().sendKeys(email);
		String pass = sheet.getRow(1).getCell(4).getStringCellValue();
		login.getpass().sendKeys(pass);
		login.getloginbtn().click();

		Thread.sleep(3000);
		login.getsearchiphone().sendKeys("iphone" + Keys.ENTER);
		login.getiphone().click();
		login.getqty().clear();
		login.getqty().sendKeys("2");
		login.getaddtocart().click();
		login.getshoopingcart().click();

		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src1, new File("C:\\Users\\vighnharta\\git\\teamB-H5\\hackthone-5\\reports\\snap1.png"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.close();
	}
	/*
	 * Script Description :Verify if the user is able to remove item from the cart
	 * account 'Application Automated : opencart 'Author : Rohith 'Date Created
	 * : 19/04/2021
	 */
	@Then("^remove item from cart$")
	public void remove_item_from_cart() throws Throwable {
		Login login = new Login(driver);
		Actions act = new Actions(driver);
		act.moveToElement(login.getaccount()).build().perform();
		login.getaccount().click();
		login.getlogin().click();
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		String email = sheet.getRow(1).getCell(2).getStringCellValue();
		login.getemil().sendKeys(email);
		String pass = sheet.getRow(1).getCell(4).getStringCellValue();
		login.getpass().sendKeys(pass);
		login.getloginbtn().click();

		Thread.sleep(3000);

		login.getlaptops().click();
		login.getmore().click();
		login.gethp().click();
		login.getaddtocart2().click();
		login.getshoopingcart().click();
		login.getremoveitem().click();
		Thread.sleep(3000);
		// login.getcont9().click();
		driver.close();
	}

	/*
	 * Script Description :Apply coupn
	 * account 'Application Automated : opencart 'Author : Rohith 'Date Created
	 * : 19/04/2021
	 */
	@Then("^apply coupn code$")
	public void apply_coupn_code() throws Throwable {
		Login login = new Login(driver);
		Actions act = new Actions(driver);
		act.moveToElement(login.getaccount()).build().perform();
		login.getaccount().click();
		login.getlogin().click();
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		String email = sheet.getRow(1).getCell(2).getStringCellValue();
		login.getemil().sendKeys(email);
		String pass = sheet.getRow(1).getCell(4).getStringCellValue();
		login.getpass().sendKeys(pass);
		login.getloginbtn().click();

		Thread.sleep(3000);

		login.getlaptops().click();
		login.getmore().click();
		login.gethp().click();
		login.getaddtocart2().click();
		login.getshoopingcart().click();
		Thread.sleep(3000);
		login.getcopun().click();
		login.getentercode().sendKeys("ABCDSFG");
		login.getapplycopun().click();

		driver.close();
	}
	
	@Then("^catupre coupn warning$")
	public void catupre_coupn_warning() throws Throwable {
		Login login = new Login(driver);
		Actions act = new Actions(driver);
		act.moveToElement(login.getaccount()).build().perform();
		login.getaccount().click();
		login.getlogin().click();
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		String email = sheet.getRow(1).getCell(2).getStringCellValue();
		login.getemil().sendKeys(email);
		String pass = sheet.getRow(1).getCell(4).getStringCellValue();
		login.getpass().sendKeys(pass);
		login.getloginbtn().click();

		Thread.sleep(3000);

		login.getlaptops().click();
		login.getmore().click();
		login.gethp().click();
		login.getaddtocart2().click();
		login.getshoopingcart().click();

		login.getcopun().click();
		// login.getentercode().sendKeys("ABCDSFG");
		login.getapplycopun().click();

		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src1, new File("C:\\Users\\vighnharta\\git\\teamB-H5\\hackthone-5\\reports\\snap2.png"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.close();
	}

	
	/*
	 * Script Description :Verify user is able to add item to the wishlist and the item from the wishlist is added to the shopping cart
	 * account 'Application Automated : opencart 'Author : Aatish 'Date Created
	 * : 19/04/2021
	 */


	@Then("^sorting$")
	public void sorting() throws Throwable {
		Login login = new Login(driver);
		Actions act = new Actions(driver);
		act.moveToElement(login.getaccount()).build().perform();
		login.getaccount().click();
		login.getlogin().click();
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		String email = sheet.getRow(1).getCell(2).getStringCellValue();
		login.getemil().sendKeys(email);
		String pass = sheet.getRow(1).getCell(4).getStringCellValue();
		login.getpass().sendKeys(pass);
		login.getloginbtn().click();
		act.moveToElement(login.getcomponent()).build().perform();
		login.getcomponent().click();
		login.getmonitors().click();
		login.getsort().click();
		Thread.sleep(3000);
		login.gethightolow().click();

		login.getwhishlist().click();
		login.getwhishlisticon().click();

		Thread.sleep(3000);
		login.getaddtocartbtn().click();
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src1, new File("C:\\Users\\vighnharta\\git\\teamB-H5\\hackthone-5\\reports\\snap3.png"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.close();
	}

	@Then("^update profile$")
	public void update_profile() throws Throwable {
		Login login = new Login(driver);
		Actions act = new Actions(driver);
		act.moveToElement(login.getaccount()).build().perform();
		login.getaccount().click();
		login.getlogin().click();
		File src = new File("C:\\Users\\vighnharta\\Documents\\h5.xlsx");
		FileInputStream input = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		String email = sheet.getRow(3).getCell(0).getStringCellValue();
		login.getemil().sendKeys(email);
		String pass = sheet.getRow(3).getCell(1).getStringCellValue();
		login.getpass().sendKeys(pass);
		login.getloginbtn().click();

		Thread.sleep(3000);
		login.gethistory().click();
		Thread.sleep(3000);
		login.getviewbutton().click();

		Thread.sleep(3000);
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src1, new File("C:\\Users\\vighnharta\\git\\teamB-H5\\hackthone-5\\reports\\snap4.png"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		login.getreturnbtn().click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='content']/form/fieldset[2]/div[4]/div/div[5]/label/input")).click();
		login.getsubmit().click();

		driver.navigate().back();
		driver.close();
	}
}