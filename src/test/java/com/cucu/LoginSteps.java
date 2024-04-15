package com.cucu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;

	@Given("User is on VMMAPS Accounts login page")
	public void user_is_on_vmmaps_accounts_login_page1() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omn.vmmaps.com/");
	}

	@When("User enter Username and Password and click on Login Button")
	public void user_enter_username_and_password_and_click_on_login_button() {
		WebElement txtEmailAddress = driver.findElement(By.id("login-email"));
		txtEmailAddress.sendKeys("Srinesh123@gmail.com");
		WebElement txtPassword = driver.findElement(By.id("login-password"));
		txtPassword.sendKeys("Qwert123");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
	}

	@Then("VMMAPS Homepage will be displayed")
	public void vmmaps_homepage_will_be_displayed() {
		System.out.println("Home Page is Displayed");

	}

	@Given("User is on VMMAPS Accounts login page")
	public void user_is_on_vmmaps_accounts_login_page11() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omn.vmmaps.com/");
	}

	@When("Click on Register here Button")
	public void click_on_register_here_button() {
		WebElement btnReg = driver.findElement(By.id("registerHere"));
		btnReg.click();

	}

	@Then("Sign Up Page will be displayed")
	public void sign_up_page_will_be_displayed() {
		System.out.println("Home Page is Displayed");
	}

	@Given("User is on VMMAPS Accounts login page")
	public void user_is_on_vmmaps_accounts_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omn.vmmaps.com/");

	}

	@When("Click on Forget Password Button")
	public void click_on_forget_password_button() {
		WebElement btnForgetpass = driver.findElement(By.id("Forgot-Password"));
		btnForgetpass.click();
	}

	@Then("Give the Email ID and Enter")
	public void give_the_email_id_and_enter() {
		WebElement txtEmailAddress = driver.findElement(By.id("login-email"));
		txtEmailAddress.sendKeys("Srinesh123@gmail.com");
		txtEmailAddress.click();

	}

}
