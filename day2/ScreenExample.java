package week4.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	
File sour=driver.getScreenshotAs(OutputType.FILE);
File destin=new File("./ama1.png");
FileUtils.copyFile(sour,destin);

}
}