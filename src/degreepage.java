import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class degreepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.ascdegreecollege.ac.in/degree-application-form/");
		
		WebElement cour = driver.findElement(By.xpath("//select[@id=\"wpforms-11388-field_3\"]"));
		Select course=new Select(cour);
		course.selectByVisibleText("B.Com");
		
		driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_0\"]")).sendKeys("Sai");
		driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_0-middle\"]")).sendKeys("Surendra");
		driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_0-last\"]")).sendKeys("Valavala");
		
		WebElement gen = driver.findElement(By.xpath("//select[@id=\"wpforms-11388-field_4\"]"));
		Select gender=new Select(gen);
		gender.selectByVisibleText("Male");

		//driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_5\"]")).sendKeys("03-07-2000");
		driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_6\"]")).sendKeys("Malikipuram,AP");
		
	}
	
	

}