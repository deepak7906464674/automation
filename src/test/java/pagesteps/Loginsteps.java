package pagesteps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import helper.Base;

public class Loginsteps extends Base {

	public void lunch_url_site() {
		setup();

	}

	public void click_accept_cookkie_and_under_age_button() {
		WebElement cookies = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
		cookies.click();
		WebElement Uage = driver
				.findElement(By.xpath("//*[@id=\"root\"]/aside[4]/form/div/div[2]/div/div[2]/div[1]/button[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", Uage);
	}

	public void navigate_to_google() {
		WebElement navigate = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		assertTrue(navigate.isDisplayed());
	}

	public void click_accept_cookkie_and_age_popup() {

		WebElement cookies = driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
		cookies.click();
		WebElement agepopup = driver
				.findElement(By.xpath("//*[@id=\"root\"]/aside[4]/form/div/div[2]/div/div[2]/div[1]/button[2]/span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", agepopup);
	}

	public void click_signin_icon() {
		WebElement signin = driver.findElement(By.xpath("(//button)[3]"));
		signin.click();
	}

	public void click_no_and_click_signup_with_email() throws Exception {
		Thread.sleep(2500);
		WebElement noclick = driver.findElement(By.xpath("(//li)[2]"));
		noclick.click();
		WebElement email = driver.findElement(By.xpath("(//button)[4]"));
		email.click();

	}

	public void fill_form_and_create_account_button() throws InterruptedException {
		Thread.sleep(2500);
		WebElement firstName = driver.findElement(By.xpath("(//input)[2]"));
		firstName.sendKeys("Deepak");
		WebElement lastname = driver.findElement(By.xpath("(//input)[3]"));
		lastname.sendKeys("kumar");
		WebElement email = driver.findElement(By.xpath("(//input)[4]"));
		email.sendKeys("dk4787269@gmail.com");
		WebElement dob = driver.findElement(By.xpath("(//input)[5]"));
		dob.sendKeys("23/05/2000");
		WebElement address = driver.findElement(By.xpath("(//input)[6]"));
		address.sendKeys("G, Arun Court, Amethyst Lane, READING, RG30 2EZ, UNITED KINGDOM");
		WebElement mob = driver.findElement(By.xpath("(//input)[12]"));
		mob.sendKeys("8273");
		WebElement password = driver.findElement(By.xpath("(//input)[14]"));
		password.sendKeys("12345");
		WebElement cpassword = driver.findElement(By.xpath("(//input)[15]"));
		cpassword.sendKeys("12345");
		WebElement tc = driver.findElement(By.xpath("(//span[@class='checkbox-switchToggle-3tC right'])[1]"));
		Thread.sleep(2500);
		tc.click();
		WebElement email1 = driver.findElement(By.xpath("(//span[@class='checkbox-switchToggle-3tC right'])[2]"));
		email1.click();
		WebElement sms = driver.findElement(By.xpath("(//span[@class='checkbox-switchToggle-3tC right'])[3]"));
		sms.click();
	}

	public void validate_message() {

	}

	public void login_with_email_and_password() {
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("ans203201@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Admin@12");
	}

	public void click_signin_button() {
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginbutton);

	}

	public void click_forget_password_and_enter_email_and_submit() throws Exception {
		Thread.sleep(2300);
		WebElement forgetpassword = driver.findElement(By.xpath("//span[text()='Forgot Password?']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", forgetpassword);
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("ans203201@gmail.com");
		WebElement enter = driver.findElement(By.xpath("//button[@type='submit']"));

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();", enter);

	}

	public void validate_message_forget_pasword() {
		WebElement validatep = driver.findElement(By.xpath("//h2[text()='Recover Password']"));
		assertTrue(validatep.isDisplayed());
	}

}
