import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class dt_calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demoqa.com/date-picker");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"datePickerMonthYearInput\"]")).click();
		
		String ex_year="2025";
		String ex_month="July";
		String ex_day="3";
		String ex_time="05:05";
		
		while(true) {
			String current_month_year=driver.findElement(By.xpath("//*[contains(@class,\"current-mont\")]")).getText();
			String[] current_month_year_arr=current_month_year.split(" ");
			String cur_month=current_month_year_arr[0];
			String cur_year=current_month_year_arr[1];
			
			if (ex_year.equals(cur_year) && ex_month.equals(cur_month)) {
				break;
			}
			List<WebElement> day_li=driver.findElements(By.xpath("//*[@class=\"react-datepicker__month\"]//div"));
			
			for(WebElement day:day_li) {
				if (day.getText().equals(ex_day)) {
					day.click();
					break;
				}
			}
			List<WebElement> times_li=driver.findElements(By.xpath("(//ul[contains(@class,\"react-datepicker__time-list\")])"));
			
			for(WebElement time:times_li) {
				
				if(time.getText().equals(ex_time)) {
					time.click();
					break;
				}
			}

		}
		
	}

}
