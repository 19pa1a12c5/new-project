import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
//		Approach-1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/15/2025");//mm/dd/yyyy

		//Approach-2
		String year="2020";
		String month="April";
		String Day="22";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();//input://input[@id="datepicker"]
		
		//select month and year
		while(true)
		{
			//current month
			String Mnth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();////span[@class="ui-datepicker-month"]
			//current year
			String yr=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();////span[@class="ui-datepicker-year"]
			//checking the condition with the given data
			if(yr.equals(year) && Mnth.equals(month)) //2023.equals(2025) && may.equals(april)
			{
				
				break;
			}
			//next button
			int ca=2020;
			
			if(2023<ca) {
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();////span[@class="ui-icon ui-icon-circle-triangle-e"]
			}
			else {
				driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();////span[@class="ui-icon ui-icon-circle-triangle-e"]

			
			}
		}
		//selecting day
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));////table[@class="ui-datepicker-calendar"]//td
		for(WebElement dt:alldates) {
			if(dt.getText().equals(Day)) {
				dt.click();
				break;
			}
		}
	}

}
