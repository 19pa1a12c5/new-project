import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class cal_dropd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).click();
		
		WebElement dd_year=driver.findElement(By.xpath("(//select[@class=\"datepick-month-year\"])[1]"));
		Select dp_year=new Select(dd_year);
		dp_year.selectByIndex(6);
		
		WebElement dd2_year=driver.findElement(By.xpath("(//select[@class=\"datepick-month-year\"])[2]"));
		Select dp2_year=new Select(dd2_year);
		dp2_year.selectByIndex(11); 
		
        List<WebElement> li=driver.findElements(By.xpath("//*[@class=\"datepick-month\"]//table//td"));
		
		for (WebElement day:li) {
			
			if (day.getText().equals("3")) {
				day.click();
				break;
			}
		}
	}

}
