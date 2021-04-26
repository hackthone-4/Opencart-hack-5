package hackthone.hackthone5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	public WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	By Account = By.xpath("//*[@id='top-links']/ul/li[2]/a");
	By register = By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a");
	By Fname = By.xpath("//*[@id='input-firstname']");
	By Lname = By.xpath("//*[@id='input-lastname']");
	By email = By.xpath("//*[@id='input-email']");
	By telephone = By.xpath("//*[@id='input-telephone']");
	By password = By.xpath("//*[@id='input-password']");
	By conf_pass = By.xpath("//*[@id='input-confirm']");
	By radio = By.xpath("//*[@id='content']/form/fieldset[3]/div/div/label[2]/input");
	By chk = By.xpath("//*[@id='content']/form/div/div/input[1]");
	By continuebtn = By.xpath("//*[@id='content']/form/div/div/input[2]");
	By contbtn=By.xpath("//*[@id='content']/div/div/a");
	By logout=By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[5]/a");
	By login=By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[2]/a");
	By loginbtn=By.xpath("//*[@id='content']/div/div[2]/div/form/input");
	
	By dekstops=By.xpath("//*[@id='menu']/div[2]/ul/li[1]/a");
	By mac1=By.xpath("//*[@id='menu']/div[2]/ul/li[1]/div/div/ul/li[2]/a");
	By imac=By.xpath("//*[@id='content']/div[2]/div/div/div[2]/div[1]/h4/a");
	By addtocart=By.xpath("//*[@id='button-cart']");
	By successmsg=By.xpath("//*[@id='product-product']/div[1]");
	By checkout=By.xpath("//*[@id='top-links']/ul/li[5]/a");
	By checkoutbtn=By.xpath("//*[@id='content']/div[3]/div[2]/a");
	
	By recipentsname=By.xpath("//*[@id='input-to-name']");
	By recipentsemail=By.xpath("//*[@id='input-to-email']");
	By yoursname=By.xpath("//*[@id='input-from-name']");
	By youremail=By.xpath("//*[@id='input-from-email']");
	By theme=By.xpath("//*[@id='content']/form/div[5]/div/div[3]/label/input");
	By msg=By.xpath("//*[@id='input-message']");
	By checkbox=By.xpath("//*[@id='content']/form/div[8]/div/input[1]");
	By cntbtn=By.xpath("//*[@id='content']/form/div[8]/div/input[2]");
	
	By laptopsandnotebook=By.xpath("//*[@id='menu']/div[2]/ul/li[2]/a");
	By showmore=By.xpath("//*[@id='menu']/div[2]/ul/li[2]/div/a");
	By HP=By.xpath("//*[@id='content']/div[4]/div[1]/div/div[2]/div[1]/h4/a");
	By date=By.xpath("//*[@id='input-option225']");
	By addtocart2=By.xpath("//*[@id='button-cart']");
	By basket=By.xpath("//*[@id='top-links']/ul/li[4]/a");
	By checkout2=By.xpath("//*[@id='content']/div[3]/div[2]/a");
	By radio3=By.xpath("//*[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label/input");
	By continu3=By.xpath("//*[@id='button-account']");
	By fname2=By.xpath("//*[@id='input-payment-firstname']");
	By lname2=By.xpath("//*[@id='input-payment-lastname']");
	By email2=By.xpath("//*[@id='input-payment-email']");
	By telephone2=By.xpath("//*[@id='input-payment-telephone']");
	By address=By.xpath("//*[@id='input-payment-address-1']");
	By city=By.xpath("//*[@id='input-payment-city']");
	By postalcode=By.xpath("//*[@id='input-payment-postcode']");
	By country=By.xpath("//*[@id='input-payment-country']");
	By state=By.xpath("//*[@id='input-payment-zone']");
	By continue4=By.xpath("//*[@id='button-guest']");
	By delevrymethods=By.xpath("//*[@id='collapse-shipping-method']/div/p[4]/textarea");
	By continu5=By.xpath("//*[@id='button-shipping-method']");
	By terms=By.xpath("//*[@id='collapse-payment-method']/div/div[2]/div/input[1]");
	By continu6=By.xpath("//*[@id='button-payment-method']");
	By confirmorder=By.xpath("//*[@id='button-confirm']");
	
	By radio5=By.xpath("//*[@id='collapse-checkout-option']/div/div/div[1]/div[1]/label/input");
	
	By editacct=By.xpath("//*[@id='column-right']/div/a[2]");
	By contin7=By.xpath("//*[@id='content']/form/div/div[2]/input");
	
	By logout2=By.xpath("//*[@id='column-right']/div/a[13]");
	
	By pass2=By.xpath("//*[@id='input-payment-password']");
	By pass3=By.xpath("//*[@id='input-payment-confirm']");
	
	//file upload
	By component=By.xpath("//*[@id='menu']/div[2]/ul/li[3]/a");
	By monitors=By.xpath("//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[2]/a");
	By apple=By.xpath("//*[@id='content']/div[3]/div[1]/div/div[2]/div[1]/h4/a");
	By checkbox4=By.xpath("//*[@id='input-option223']/div[1]/label/input");
	By select=By.xpath("//select[@id='input-option217']");
	By text=By.xpath("//*[@id='input-option208']");
	By area=By.xpath("//*[@id='input-option209']");
	By fileupload=By.xpath("//*[@id='button-upload222']");
	By addtocart8=By.xpath("//*[@id='button-cart']");
	
	//product avialbility
	By search=By.xpath("//*[@id='search']/input");
	By iphone=By.xpath("//*[@id='content']/div[3]/div/div/div[2]/div[1]/h4/a");
	By qty=By.xpath("//*[@id='input-quantity']");
	By addtocart9=By.xpath("//*[@id='button-cart']");
	By shoopingcart=By.xpath("//*[@id='top-links']/ul/li[4]/a");
	By remove=By.xpath("//*[@id='content']/form/div/table/tbody/tr[2]/td[4]/div/span/button[2]");
	By cont9=By.xpath("//*[@id='content']/div/div/a");
	
	//Apply coupn
	By coupn=By.xpath("//*[@id='accordion']/div[1]/div[1]/h4/a");
	By code=By.xpath("//*[@id='input-coupon']");
	By applycoupn=By.xpath("//*[@id='button-coupon']");
	
	//sorting
	By sort=By.xpath("//*[@id='input-sort']");
	By hightolow=By.xpath("//*[@id='input-sort']/option[5]");
	By whishlist=By.xpath("//*[@id='content']/div[3]/div[2]/div/div[2]/div[2]/button[2]");
	By whishlisticon=By.xpath("//*[@id='wishlist-total']");
	By addtocartbtn=By.xpath("//*[@id='content']/div[1]/table/tbody/tr/td[6]/button");
	
	//order history
	By history=By.xpath("//*[@id='column-right']/div/a[6]");
	By returnbtn=By.xpath("//*[@id='content']/div[1]/table/tbody/tr/td[6]/a[2]");
	By viewbutton=By.xpath("//*[@id='content']/div[1]/table/tbody/tr[1]/td[7]/a");
	By submit=By.xpath("//*[@id='content']/form/div/div[2]/input");
	
	public WebElement getsubmit() {
		return driver.findElement(submit);
	}
	public WebElement getreturnbtn() {
		return driver.findElement(returnbtn);
	}
	public WebElement getviewbutton() {
		return driver.findElement(viewbutton);
	}
	public WebElement gethistory() {
		return driver.findElement(history);
	}
	public WebElement getaddtocartbtn() {
		return driver.findElement(addtocartbtn);
	}
	public WebElement getwhishlisticon() {
		return driver.findElement(whishlisticon);
	}
	public WebElement getwhishlist() {
		return driver.findElement(whishlist);
	}
	public WebElement gethightolow() {
		return driver.findElement(hightolow);
	}
	public WebElement getsort() {
		return driver.findElement(sort);
	}
	public WebElement getapplycopun() {
		return driver.findElement(applycoupn);
	}
	public WebElement getentercode() {
		return driver.findElement(code);
	}
	public WebElement getcopun() {
		return driver.findElement(coupn);
	}
	
	public WebElement getremoveitem() {
		return driver.findElement(remove);
	}
	
	public WebElement getcont9() {
		return driver.findElement(cont9);
	}
	public WebElement getshoopingcart() {
		return driver.findElement(shoopingcart);
	}
	
	public WebElement getaddtocart9() {
		return driver.findElement(addtocart9);
	}
	public WebElement getqty() {
		return driver.findElement(qty);
	}
	public WebElement getsearchiphone() {
		return driver.findElement(search);
	}
	public WebElement getiphone() {
		return driver.findElement(iphone);
	}
	public WebElement getaccount() {
		return driver.findElement(Account);
	}

	public WebElement getarea() {
		return driver.findElement(area);
	}
	public WebElement getregister() {
		return driver.findElement(register);
	}

	public WebElement getfname() {
		return driver.findElement(Fname);
	}

	public WebElement getlname() {
		return driver.findElement(Lname);
	}

	public WebElement getemil() {
		return driver.findElement(email);
	}
	public WebElement getnumber() {
		return driver.findElement(telephone);
	}
	

	public WebElement getpass() {
		return driver.findElement(password);
	}

	public WebElement getconfpass() {
		return driver.findElement(conf_pass);
	}

	public WebElement getradio() {
		return driver.findElement(radio);
	}

	public WebElement getchk() {
		return driver.findElement(chk);
	}

	public WebElement getcontionue() {
		return driver.findElement(continuebtn);
	}
	public WebElement getcontbtn() {
		return driver.findElement(contbtn);
	}
	
	public WebElement getlogout() {
		return driver.findElement(logout);
	}
	public WebElement getlogin() {
		return driver.findElement(login);
	}
	public WebElement getloginbtn() {
		return driver.findElement(loginbtn);
	}
	
	public WebElement getdekstops() {
		return driver.findElement(dekstops);
	}
	
	public WebElement getmac1() {
		return driver.findElement(mac1);
	}
	
	public WebElement getimac() {
		return driver.findElement(imac);
	}
	
	public WebElement getaddtocart() {
		return driver.findElement(addtocart);
	}
	public WebElement getsuccessmsg() {
		return driver.findElement(successmsg);
	}
	public WebElement getcheckout() {
		return driver.findElement(checkout);
	}
	
	public WebElement getcheckouttn() {
		return driver.findElement(checkoutbtn);
	}
	public WebElement getrepeinentname() {
		return driver.findElement(recipentsname);
	}
	public WebElement getrecipentemail() {
		return driver.findElement(recipentsemail);
	}
	public WebElement getyourname() {
		return driver.findElement(yoursname);
	}
	public WebElement getyouremail() {
		return driver.findElement(youremail);
	}
	public WebElement getradiotheme() {
		return driver.findElement(theme);
	}
	public WebElement getmsg() {
		return driver.findElement(msg);
	}
	public WebElement getchkbox() {
		return driver.findElement(checkbox);
	}
	public WebElement getctnbtn() {
		return driver.findElement(cntbtn);
	}
	
	public WebElement getlaptops() {
		return driver.findElement(laptopsandnotebook);
	}
	
	public WebElement getmore() {
		return driver.findElement(showmore);
	}
	
	public WebElement gethp() {
		return driver.findElement(HP);
	}
	public WebElement getdate() {
		return driver.findElement(date);
	}
	public WebElement getaddtocart2() {
		return driver.findElement(addtocart2);
	}
	public WebElement getbasket() {
		return driver.findElement(basket);
	}
	public WebElement getcheckout2() {
		return driver.findElement(checkout2);
	}
	
	public WebElement getradio3() {
		return driver.findElement(radio3);
	}
	
	public WebElement getcontinue3() {
		return driver.findElement(continu3);
	}
	public WebElement getfname2() {
		return driver.findElement(fname2);
	}
	public WebElement getlname2() {
		return driver.findElement(lname2);
	}
	public WebElement getemail2() {
		return driver.findElement(email2);
	}
	
	public WebElement gettelephone2() {
		return driver.findElement(telephone2);
	}
	public WebElement getaddress() {
		return driver.findElement(address);
	}
	public WebElement getcity() {
		return driver.findElement(city);
	}
	public WebElement getpostal() {
		return driver.findElement(postalcode);
	}
	public WebElement getcountry() {
		return driver.findElement(country);
	}
	public WebElement getstate() {
		return driver.findElement(state);
	}
	public WebElement getcont4() {
		return driver.findElement(continue4);
	}
	public WebElement getdelevery() {
		return driver.findElement(delevrymethods);
	}
	
	public WebElement getcont5() {
		return driver.findElement(continu5);
	}
	public WebElement getterms() {
		return driver.findElement(terms);
	}
	public WebElement getcont6() {
		return driver.findElement(continu6);
	}
	public WebElement getconfrimorder() {
		return driver.findElement(confirmorder);
	}
	public WebElement getradio5() {
		return driver.findElement(radio5);
	}
	public WebElement geteditaccount() {
		return driver.findElement(editacct);
	}
	public WebElement getcont7() {
		return driver.findElement(contin7);
	}
	
	public WebElement getlog2() {
		return driver.findElement(logout2);
	}
	
	
	public WebElement getcomponent() {
		return driver.findElement(component);
	}
	
	public WebElement getmonitors() {
		return driver.findElement(monitors);
	}
	public WebElement getapple() {
		return driver.findElement(apple);
	}
	public WebElement getcheckbox4() {
		return driver.findElement(checkbox4);
	}
	public WebElement getselect() {
		return driver.findElement(select);
	}
	public WebElement gettext() {
		return driver.findElement(text);
	}
	public WebElement getfileupload() {
		return driver.findElement(fileupload);
	}
	public WebElement getaddtocat() {
		return driver.findElement(addtocart8);
	}
	public WebElement getpass2() {
		return driver.findElement(pass2);
	}
	public WebElement getpass3() {
		return driver.findElement(pass3);
	}
	
}
