import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Class_Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win64\\edgedriver.exe"); 
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(options);		
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@href=\"https://magento.softwaretestingboard.com/customer/account/create/\"])[1]")).click();
		driver.findElement(By.xpath("//input[@id=\"firstname\"]")).sendKeys("Surendra");
		driver.findElement(By.xpath("//input[@id=\"lastname\"]")).sendKeys("Valavala");
		driver.findElement(By.xpath("//input[@id=\"email_address\"]")).sendKeys("surendra333@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Surendra@123");
		driver.findElement(By.xpath("//input[@id=\"password-confirmation\"]")).sendKeys("Surendra@123");
		driver.findElement(By.xpath("//button[@class=\"action submit primary\"]")).click();
		
		
		



		
		

		

		}

}
