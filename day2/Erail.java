package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in");
		WebElement head=driver.findElement(By.id("txtStationFrom"));
		
	
	head.clear();
	head.sendKeys("MS");
	Thread.sleep(500);
	
	head.sendKeys(Keys.TAB);
	WebElement next = driver.findElement(By.id("txtStationTo"));
	next.clear();
	next.sendKeys("MDU");
	next.sendKeys(Keys.ENTER);
driver.findElement(By.xpath("//label[text()='Sort on Date']")).click();
Thread.sleep(3000);
Set<String> trainName=new HashSet<String>();

List<WebElement> trainList=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));


System.out.println("Train Names"+trainList.size());
for(WebElement one:trainList)
{
System.out.println("here : "+one.getText());	
//trainName.add(one.getText());
}
if(trainList.size()==trainName.size())
{
	System.out.println("no duplicate");
}
else
{
	System.out.println("duplicate");
}

}
}
	


