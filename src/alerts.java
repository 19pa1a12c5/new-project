import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[3]")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
		driver.switchTo().alert().sendKeys("Alert broo");
		
	}

}