package week4.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
       
        for(int i=2;i<=6;i++)
        {
        	String text1=driver.findElement(By.xpath("//table//tr[" + i + "]/td[1]")).getText();
        	System.out.println(text1);
        }
        int column=driver.findElements(By.xpath("//table//th")).size();
        System.out.println("Column Size : "+column);
        int rows=driver.findElements(By.xpath("//table//tr")).size();
        System.out.println("Row Size : " +rows);
        String text=driver.findElement(By.xpath("//table//tr[3]/td[2]")).getText();
        System.out.println("The Progress value of ti Intract with Elements: "+text);
        driver.findElement(By.xpath("//table//tr[6]/td[3]")).click();
        
        
        
	}

}