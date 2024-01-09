import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class multipledd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win64\\edgedriver.exe"); 
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://formstone.it/components/dropdown/demo/");
		WebElement ddf=driver.findElement(By.xpath("//select[@id=\"demo_basic\"]"));
		Select jsp= new Select(ddf);
		jsp.selectByIndex(1);
		Thread.sleep(2000);
		jsp.selectByValue("1");
		Thread.sleep(2000);
		jsp.selectByVisibleText("Two");
		
		
	}

}
