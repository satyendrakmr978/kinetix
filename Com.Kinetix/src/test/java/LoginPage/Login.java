package LoginPage;

import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Login {

	WebDriver driver;

	@org.testng.annotations.Test
	public void launchbrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://qa.kinetixxgolf.com/");
		
		driver.manage().window().maximize();

	}
	

	@org.testng.annotations.Test
	public void title() throws InterruptedException {
		String actualtitle=driver.getTitle();
		String expectedtitle= "Page";
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("Title is : " +actualtitle);
			
		}
		else {
			System.out.println("The title is not match");
		}

	}
	
	

	@org.testng.annotations.Test
	public void logo() throws InterruptedException {

		WebElement logo=driver.findElement(By.xpath("//div[@id='root']/header/nav/div/span/a/img"));
		logo.isDisplayed();
		System.out.println("Logo is visible: ");

	}
	
	@org.testng.annotations.Test
	public void tearDown() throws InterruptedException  {
		Thread.sleep(5000);
		driver.close();
	}
//	public static void voidmain(String[]args) throws InterruptedException {
//		Login log = new Login();
//		log.launchbrowser();
//		log.title();
//		log.logo();
//		log.tearDown();
//
	}



