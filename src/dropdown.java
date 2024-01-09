import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win64\\edgedriver.exe"); 
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();

		WebElement flight=driver.findElement(By.xpath("//select[@name=\"fromPort\"]"));
		Select fl=new Select(flight);
		fl.selectByIndex(3);
		
		WebElement ticket=driver.findElement(By.xpath("//select[@name=\"toPort\"]"));
		Select tic=new Select(ticket);
		tic.selectByValue("London");
		
		driver.findElement(By.xpath("//input[@value=\"Find Flights\"]")).click();
		driver.findElement(By.xpath("(//input[@value=\"Choose This Flight\"])[2]")).click();
		
		driver.findElement(By.id("inputName")).sendKeys("Surendra");
		driver.findElement(By.id("address")).sendKeys("4-83,Mori.");
		driver.findElement(By.id("city")).sendKeys("Konaseema Amalapuram");
		driver.findElement(By.id("state")).sendKeys("AndhraPradesh");
		driver.findElement(By.id("zipCode")).sendKeys("533250");
		
		WebElement card=driver.findElement(By.xpath("//select[@name=\"cardType\"]"));
		Select Cad=new Select(card);
		Cad.selectByVisibleText("American Express");
		
		driver.findElement(By.id("creditCardNumber")).sendKeys("4829826952256789");
		driver.findElement(By.id("creditCardMonth")).sendKeys("03");
		driver.findElement(By.id("creditCardYear")).sendKeys("2025");
		driver.findElement(By.id("nameOnCard")).sendKeys("Surendra Valavala");
		driver.findElement(By.id("rememberMe")).click();
		driver.findElement(By.xpath("//input[@value=\"Purchase Flight\"]")).click();


		
				}

}
