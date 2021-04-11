package seleniumProjectSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebbDriverBasics {
	
	public static void main (String []args) throws InterruptedException {
		 {
		    	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://a.testaddressbook.com/sign_in/");  
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				String title = driver.getTitle();
				System.out.println("title");
				
				driver.findElement(By.id("session_email")).sendKeys("surabhi@gmail.com");
				driver.findElement(By.id("session_password")).sendKeys("surabhi@123");
				driver.findElement(By.name("commit")).click();
		
				driver.get("http://a.testaddressbook.com/addresses");
				//driver.findElement(By.xpath("")).click();
			    driver.findElement(By.xpath("/html/body/div/a")).click();
			    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS); 
				
			  //*[@id="address_first_name"]
			    driver.findElement(By.id("address_first_name")).sendKeys("qwer");
				driver.findElement(By.id("address_last_name")).sendKeys("shingate");
				driver.findElement(By.id("address_street_address")).sendKeys("gulmohar coloney");
				driver.findElement(By.id("address_secondary_address")).sendKeys("satara");
				driver.findElement(By.id("address_city")).sendKeys("satara");
					
				Select select = new Select(driver.findElement(By.id("address_state")));
				select.selectByVisibleText("California");
				
				driver.findElement(By.id("address_zip_code")).sendKeys("415001");
				driver.findElement(By.id("address_age")).sendKeys("30");
				driver.findElement(By.id("address_phone")).sendKeys("0123456789");
				
				//*[@id="new_address"]/div[17]/input
				driver.findElement(By.name("commit")).click();
				
				driver.findElement(By.xpath("/html/body/div/div[2]/a[2]")).click();
				//driver.findElement(By.xpath("/html/body/nav/button/span")).click();
				driver.findElement(By.linkText("Sign out")).click();
				//driver.close();
				
		 
		 
		 
		 }
	}
}
	
	
