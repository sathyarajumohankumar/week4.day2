package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();

		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));

		
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(item1)
		.click(item2)
		.click(item4)
		.keyUp(Keys.CONTROL)
		.perform();

		WebElement item6 = driver.findElement(By.xpath("//li[text()='Item 6']"));
		WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));

		

		builder.clickAndHold(item6)
		.clickAndHold(item7)
		.release()
		.perform();

		driver.close();

	}

}