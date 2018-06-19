package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initiate {

	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
	}
}
