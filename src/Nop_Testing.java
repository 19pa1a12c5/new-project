import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class Nop_Testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\edgedriver_win64\\edgedriver.exe"); 
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver(options);		
		driver.get("https://demo.nopcommerce.com/computers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	    //Registration
		driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("VALAVALA");
		driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("Y M SAI SURENDRA");
		
		WebElement day=driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
		Select ref=new Select(day);
		ref.selectByValue("3");
		
		WebElement month=driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
		Select ref1=new Select(month);
		ref1.selectByValue("7");
		
		WebElement year=driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
		Select ref2=new Select(year);
		ref2.selectByValue("2001");
		
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("surendrav33@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("CHARANI");
		driver.findElement(By.xpath("//input[@id=\"Newsletter\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("232344");
		driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("232344");
		
		driver.findElement(By.xpath("//button[@id=\"register-button\"]")).click();
		
		//Login
		driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys("surendrav33@gmail.com");
		driver.findElement(By.xpath("//input[@class=\"password\"]")).sendKeys("232344");
		driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")).click();
		
		//Main
		driver.findElement(By.xpath("//img[@alt=\"Picture for category Desktops\"]")).click();
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[1]")).click();
        
		WebElement add=driver.findElement(By.xpath("//select[@data-attr=\"1\"]"));
		Select ref4=new Select(add);
		ref4.selectByValue("1");
		
		WebElement add2=driver.findElement(By.xpath("//select[@data-attr=\"2\"]"));
		Select ref5=new Select(add2);
		ref5.selectByValue("3");
		
		driver.findElement(By.xpath("//input[@id=\"product_attribute_3_6\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"product_attribute_4_9\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"product_attribute_5_10\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-1\"]")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type=\"button\"])[8]")).click();
		driver.navigate().back();
        
		//Notebooks
				
		driver.findElement(By.xpath("//img[@alt=\"Picture for category Notebooks\"]")).click();
		/*driver.findElement(By.xpath("//input[@id=\"attribute-option-7\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"attribute-option-9\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"attribute-option-10\"]")).click();*/
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")).click();
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-4\"]")).click();

		driver.navigate().back();
		driver.navigate().back();
       //Software
		driver.findElement(By.xpath("//img[@alt=\"Picture for category Software\"]")).click();
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[1]")).click();
		driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]")).click();
		driver.navigate().back();


		//Electronic
		driver.navigate().to("https://demo.nopcommerce.com/electronics");
		driver.findElement(By.xpath("//img[@alt=\"Picture for category Camera & photo\"]")).click();
		driver.findElement(By.xpath("//img[@alt=\"Picture of Nikon D5500 DSLR\"]")).click();
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-14\"]")).click();
		
         Thread.sleep(2000);
         
        driver.findElement(By.xpath("(//button[@class=\"button-1 add-to-cart-button\"])[1]")).click();
     	
     	Thread.sleep(2000);
     	driver.navigate().back();
     	driver.navigate().back();
     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000007_cell-phones_450.jpeg\"]")).click();
//     /	sort by
     	 WebElement	phn1=	driver.findElement(By.xpath("//select[@name=\"products-orderby\"]"));
         
  		Select Sortby1=new Select(phn1);
  		
  		Sortby1.selectByVisibleText("Created on");
  		
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000044_nokia-lumia-1020_415.jpeg\"]")).click();
  		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-20\"]")).click();

     	Thread.sleep(2000);
  		driver.navigate().back();
     	driver.navigate().back();
     	driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[3]/div/div/a/img")).click();
     	
     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000048_portable-sound-speakers_415.jpeg\"]")).click();
  		driver.findElement(By.xpath("//button[@class=\"button-1 add-to-cart-button\"]")).click();
  		
  		//Apparel
  		
  		driver.navigate().to("https://demo.nopcommerce.com/apparel");
  		driver.findElement(By.xpath("//img[@alt=\"Picture for category Shoes\"]")).click();

  		driver.findElement(By.xpath("//img[@alt=\"Picture of adidas Consortium Campus 80s Running Shoes\"]")).click();
  		
  		WebElement	sho=	driver.findElement(By.xpath("//select[@id=\"product_attribute_9\"]"));
  		Select Sortby2=new Select(sho);
  		Sortby2.selectByValue("23");
  		
  		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-25\"]")).click();
     	driver.navigate().back();
     	driver.navigate().back();
        
     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000011_clothing_450.jpeg\"]")).click();

	        WebElement	cloth=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
	        
	 		Select Sortby12=new Select(cloth);
	 		Sortby12.selectByVisibleText("Created on");
			
	  		Thread.sleep(2000);
	  		driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000060_levis-511-jeans_415.jpg\"]")).click();
	  		driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-30\"]")).click();

	     	Thread.sleep(2000);
	  		driver.navigate().back();
	     	driver.navigate().back();
	     	//Accesiries
	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000012_apparel-accessories_450.jpg\"]")).click();
	     	
	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000064_ray-ban-aviator-sunglasses_415.jpg\"]")).click();
	  		driver.findElement(By.xpath("//button[@class=\"button-1 add-to-cart-button\"]")).click();
	  		

	     	driver.navigate().to("https://demo.nopcommerce.com/digital-downloads");
	     	driver.findElement(By.xpath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000067_science-faith_415.jpeg\"]")).click();
	     	WebElement price=driver.findElement(By.xpath("//input[@class=\"enter-price-input\"]"));
	     	price.clear();
	     	price.sendKeys("100");
	     	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-36\"]")).click();

	        //Books 
	     	driver.navigate().to("https://demo.nopcommerce.com/books");
	     	WebElement	s13=driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
	         
	  		Select Sortby=new Select(s13);
	  		
	  		Sortby.selectByVisibleText("Created on");
	  		Thread.sleep(2000);
	     	driver.findElement(By.xpath("//img[@alt=\"Picture of Pride and Prejudice\"]")).click();
	     	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-39\"]")).click();
	     	
	     	//Jewelry 
	     	driver.navigate().to("https://demo.nopcommerce.com/jewelry");
	    	 WebElement	s14=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
	        
	 		Select Sortby55=new Select(s14);
	 		
	 		Sortby55.selectByVisibleText("Created on");
	 		Thread.sleep(2000);
	     	driver.findElement(By.xpath("//img[@alt=\"Picture of Vintage Style Engagement Ring\"]")).click();
	     	Thread.sleep(2000);
	     	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-42\"]")).click();
	     	
	     	//Gift card
	     	driver.navigate().to("https://demo.nopcommerce.com/gift-cards");
	   	    WebElement	s15=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
	       
			Select Sortby6=new Select(s15);
			
			Sortby6.selectByVisibleText("Created on");
			Thread.sleep(2000);
	    	driver.findElement(By.xpath("//img[@alt=\"Picture of $50 Physical Gift Card\"]")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//input[@class=\"recipient-name\"]")).sendKeys("V");
	    	driver.findElement(By.xpath("//input[@class=\"sender-name\"]")).sendKeys("SJ");
	    	driver.findElement(By.xpath("//textarea[@id=\"giftcard_44_Message\"]")).sendKeys("Thanks Namasthey...");
	    	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-44\"]")).click();


	}

}
