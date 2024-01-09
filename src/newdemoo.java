import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class newdemoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]")).sendKeys("Surendra");
		driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).sendKeys("Valavala");
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("4-83,Mori,A.P,Pin.no:533250");
		driver.findElement(By.cssSelector("input[ng-model=\"EmailAdress\"]")).sendKeys("sj@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys("9132228333");
		driver.findElement(By.xpath("(//input[@name=\"radiooptions\"])[1]")).click();
		driver.findElement(By.xpath("//input[@value=\"Movies\"]")).click();
		
		WebElement sk= driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		Select skill=new Select(sk);
		skill.selectByValue("Python");
		
		WebElement cou= driver.findElement(By.xpath("//select[@id=\"countries\"]"));
		Select country=new Select(cou);
		country.selectByVisibleText("Select Country");
		
		WebElement sec= driver.findElement(By.xpath("//select[@id=\"country\"]"));
		Select selcountry=new Select(sec);
		selcountry.selectByValue("India");
		
		WebElement yr= driver.findElement(By.xpath("//select[@ng-model=\"yearbox\"]"));
		Select year=new Select(yr);
		year.selectByValue("2001");
		
		WebElement mo= driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		Select month=new Select(mo);
		month.selectByValue("July");
		
		WebElement dy= driver.findElement(By.xpath("//select[@id=\"daybox\"]"));
		Select day=new Select(dy);
		day.selectByVisibleText("3");
		
		driver.findElement(By.xpath("//input[@id=\"firstpassword\"]")).sendKeys("3487jhh@");
		driver.findElement(By.xpath("//input[@id=\"secondpassword\"]")).sendKeys("3487jhh@");
		
		driver.findElement(By.xpath("//button[@value=\"Refresh\"]")).click();
		
		
       }
	
}