
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calenders1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		Date da1=new Date();
		String a=da1.toString();
		String[] s=a.split(" ");
		System.out.println(s);
		
		String cal_year=s[3];
		String cal_month=s[1];
		String d_month="jul";
		String d_day="03";
        String d_year="2025";
		
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		
while(true) {
			
			if(cal_month.contains(d_month) && d_year.equals(cal_year)) {
				
				break;
				
			}
		
			else {
				driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
				cal_month=driver.findElement(By.xpath("//span[contains(@class,\"datepicker-month\")]")).getText();
				cal_year=driver.findElement(By.xpath("//span[contains(@class,\"datepicker-year\")]")).getText();
				
			}
			
		}
              List<WebElement> dates=driver.findElements(By.xpath("//*[@class=\"ui-datepicker-calendar\"]//td"));

              for(WebElement day:dates) {
	          if (day.getText().equals(d_day)) {
		      day.click();
		      
		      break;
			
	}
}
	}
}
