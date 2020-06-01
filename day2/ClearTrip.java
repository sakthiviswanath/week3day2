package week3.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {



	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepak\\Downloads\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(options);


		driver.get("https://www.cleartrip.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElementById("RoundTrip").click();
		driver.findElementById("FromTag").sendKeys("Chennai");;
		driver.findElementById("ToTag").sendKeys("New York");
		driver.findElementById("DepartDate").click();
		driver.findElementByLinkText("16").click();
		driver.findElementById("ReturnDate").click();
		driver.findElementByLinkText("10").click();

		WebElement adult = driver.findElementById("Adults");

		Select ob = new Select(adult);

		ob.selectByVisibleText("2");


		WebElement childrens = driver.findElementById("Childrens");

		Select ob1 = new Select(childrens);

		ob1.selectByVisibleText("1");


		WebElement infants = driver.findElementById("Infants");

		Select ob2 = new Select(infants);

		ob2.selectByVisibleText("1");

		driver.findElementById("MoreOptionsLink").click();


		WebElement class1 = driver.findElementById("Class");

		Select ob3 = new Select(class1);

		ob3.selectByIndex(3);
		driver.findElementById("AirlineAutocomplete").sendKeys("Emirates");
		driver.findElementById("SearchBtn").click();
		
		
		
		
		
	}

}
