

		package week4.day2;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class Resizable {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				
				WebDriverManager.chromedriver().setup();
				
				ChromeDriver driver = new ChromeDriver();
				
				driver.get("https://jqueryui.com/resizable/");
				driver.manage().window().maximize();

				driver.switchTo().frame(0);
				WebElement drag = driver.findElement(By.xpath("(//h3[text()='Resizable']/following-sibling::div)[3]"));

				Actions builder = new Actions(driver);
			
				builder.clickAndHold(drag)
				.moveByOffset(30, 30)
				.release(drag)
				.perform();
				
				driver.close();
	}

}
