package com.class01;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import com.utils.CommonMethods;
import com.utils.Constants;

public class TitleLogoAndLoginVerification extends CommonMethods{
	
	@BeforeMethod
	public void openAndNavigate() {
		setUp("chrome", Constants.HRMS_URL);
		System.out.println("Driver çalıştırıldı...");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
		System.out.println("Çıkış...");
	}
	
	@Test
	public void titleValidation() {
		String expectedTitle="Human Management System";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test Passes");
		}else {
			System.out.println("Test Failed");
		}
		System.out.println("Title alınıyor...");
	}
	
	@Test
	public void logoValidation() {
		boolean isDisplayed=driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
		if(isDisplayed) {
			System.out.println("Test Passes");
		}else {
			System.out.println("Test Failed");
		}
		System.out.println("Logo alınıyor...");
	}
	
	@Test
	public void validLogin() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.className("button")).click();
		System.out.println("Giriş yapılıyor...");
	}

}
