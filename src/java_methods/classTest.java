package java_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class classTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win64\\edgedriver.exe"); 
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(options);		
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//Login
		driver.findElement(By.xpath("//input[@data-test=\"username\"]")).sendKeys("surendravalavala33@gmail.com");
		driver.findElement(By.xpath("//input[@data-test=\"password\"]")).sendKeys("255244");
		
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();



	}

}
