package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

			public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();

				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");

				ChromeDriver driver = new ChromeDriver(options);

				driver.get("http://www.leafground.com/pages/drag.html");

				driver.manage().window().maximize();
				
			
					
		WebElement d=driver.findElement(By.id("draggable"));
		WebElement i=driver.findElement(By.xpath("//div[@id='mydiv']"));
		Actions builder1=new Actions(driver);
		int x=d.getLocation().getX();
		int y=i.getLocation().getY();
		
		builder1.dragAndDrop(d, i);
		builder1.dragAndDropBy(d, 200, 200).perform();
		}
	}


