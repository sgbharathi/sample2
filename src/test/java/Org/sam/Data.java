package Org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data extends DataDriven{
	public static void main(String[] args) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace sgbharathi\\Int\\ChromeDriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement username = driver.findElement(By.id("email"));
username.sendKeys(getData(1,0));
WebElement password = driver.findElement(By.id("pass"));
password.sendKeys(getData(1,1));

}
	
}