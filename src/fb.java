import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class fb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win64\\edgedriver.exe"); 
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(options);		
		driver.get(" https://formy-project.herokuapp.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

       Thread.sleep(2000);
		WebElement auto=driver.findElement(By.xpath("(//a[text()=\"Autocomplete\"])[2]"));
		auto.click();

		driver.get("https://formy-project.herokuapp.com/autocomplete");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys("VALAVALA");
		driver.findElement(By.xpath("//input[@id=\"street_number\"]")).sendKeys("4-83");
		driver.findElement(By.xpath("//input[@id=\"route\"]")).sendKeys("near manasa school");
		driver.findElement(By.xpath("//input[@id=\"locality\"]")).sendKeys("Konaseema");
		driver.findElement(By.xpath("//input[@id=\"administrative_area_level_1\"]")).sendKeys("Andhra Pradesh");
		driver.findElement(By.xpath("//input[@id=\"postal_code\"]")).sendKeys("533250");
		driver.findElement(By.xpath("//input[@id=\"country\"]")).sendKeys("India");
		
		//BUTTONS
		driver.navigate().to("https://formy-project.herokuapp.com/buttons");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.findElement(By.xpath("//button[text()=\"Primary\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Success\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Info\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Warning\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Danger\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Left\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Middle\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Right\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"1\"]")).click();
	
		
     //DROP DOWN
		driver.navigate().to("https://formy-project.herokuapp.com/dropdown");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//button[@id=\"dropdownMenuButton\"]")).click();
		
//		DATE PICKER
		driver.navigate().to("https://formy-project.herokuapp.com/datepicker");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("03/07/2020");
		
//		CHECK BOXES
		driver.navigate().to("https://formy-project.herokuapp.com/checkbox");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id=\"checkbox-1\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"checkbox-2\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"checkbox-3\"]")).click();
		Thread.sleep(2000);

//		RADIO BUTTONS
		driver.navigate().to("https://formy-project.herokuapp.com/radiobutton");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@value=\"option3\"]")).click();
			}
		}
		

