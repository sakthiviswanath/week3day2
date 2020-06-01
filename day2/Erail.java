package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Erail {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepak\\Downloads\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();	
		
		driver.findElementByXPath("//input[@id='txtStationFrom']").clear();
		driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys("chennai", Keys.ENTER);
		
		driver.findElementByXPath("//input[@id='txtStationTo']").clear();
		driver.findElementByXPath("//input[@id='txtStationTo']").sendKeys("Bengaluru",Keys.ENTER);
		Thread.sleep(10000);
		
		List<WebElement> table = driver.findElementsByXPath("//div[@id='divTrainsList']/table[1]//tr");
		//int a=table.size();
		System.out.println(table.size());
		List<String>Names = new ArrayList<String>();
		for(int i=1;i<=table.size();i++)
		{
			String cell = driver.findElementByXPath("(//div[@id='divTrainsList']//tr["+i+"]//a)[2]").getText();
            //System.out.println(cell);
            Names.add(cell);
			}
			Collections.sort(Names);
for (String string : Names) {
	System.out.println(string);
	
}		}
		
	}



