package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hammad");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbstudent\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?");
		driver.manage().window().maximize();
		
		WebElement username;
		username = driver.findElement(By.name("search"));
		username.sendKeys("HP LP3065");
		//WebElement password;
		//password = driver.findElement(By.id("input-password"));
		//password.sendKeys("123456789");
		
		WebElement search;
		search = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
		search.click();
		
		WebElement atc;
		atc = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]/span"));
		atc.click();
	
	}
     
}
