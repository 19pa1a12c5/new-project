import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alert_ok {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		driver.switchTo().alert().accept();
		
		
		
	}

}
