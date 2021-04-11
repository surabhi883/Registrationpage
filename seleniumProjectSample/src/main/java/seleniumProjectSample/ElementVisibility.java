package seleniumProjectSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibility {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://a.testaddressbook.com/sign_in/");  
		
		//isDisplayed method
		
		boolean b1 = driver.findElement(By.name("commit")).isDisplayed();
        System.out.println(b1);
        
        boolean b2 = driver.findElement(By.name("commit")).isEnabled();
        System.out.println(b2);
        
        
        driver.close();
	}

}
