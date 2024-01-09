import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ifElseNew {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
        driver.manage().window().maximize();
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,400)");

 Thread.sleep(2000); 
    driver.findElement(By.id("first_date_picker")).click();
    
//  GETTING TEXT OG MONTH AND YEAR
   String mm=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
   String yy=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
   
//   REQURED DATE AND YEAR
   String mon="April";
   int yer=2021;
   String dayy="25";
//   CONVERTING INTIGER TO STRING
   String yer1=Integer.toString(yer);
   
//   PRESENT YEAR
   int current_year=2023;
   
   while(true) {
	   mm=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
       yy=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
       
//       YEAR IS GREATER THEN PRESENT YEAR
	   if (yer > current_year) {
		   if(mm.equals(mon) && yy.equals(yer1)) {
			   break;
		   }
		   else {
//			   CLICKING FORWORD BUTTON
			   driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		   }
		   
	   }
	   else {
//		   GIVEN YEAR IS LESSTHEN PRESENT YEAR
		   if (yer < current_year) {
//			   COMPARE MONTH AND YEAR
			   if(mm.equals(mon) && yy.equals(yer1)) {
				   break;
			   }
			   else {
//				   CLICKING PREVIVE BUTTON
				   driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();    				   
			   }
		   }
	   }
	   
   } 
//   SELECT DATE
   java.util.List<WebElement> jj=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table//td"));
   for(WebElement kk:jj) {
	   if(kk.getText().equals(dayy)) {
		   kk.click();
		   break;
	   }
	   
   }
	}

}
