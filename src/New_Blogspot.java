import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class New_Blogspot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win64\\edgedriver.exe"); 
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(options);
	    driver.get("https://testautomationpractice.blogspot.com/");
	    
	    int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //7  preferred


		System.out.println("Number of rows:"+ rows); //7

		

		

		//2) Find total number of columns

		

		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();

		

		System.out.println("Number of columns:"+ cols); //4


		String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();

		System.out.println(value);

		

		System.out.println("Book Name"+"     "+"Author"+"    "+"Subject"+"       "+"Price");

		

		

		for(int r=2;r<=rows;r++)

		{

			for(int c=1;c<=cols;c++)

			{

				String value1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();

				System.out.print(value1+"\t"); 

			}

			System.out.println();

		}
	}

}
