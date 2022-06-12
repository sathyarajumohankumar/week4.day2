package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDealExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
	WebElement mens = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
	Actions builder=new Actions(driver);
	builder.moveToElement(mens)
	
	.perform();
	driver.findElement(By.xpath("//span[text(),'Shirts']")).click();	}

}
