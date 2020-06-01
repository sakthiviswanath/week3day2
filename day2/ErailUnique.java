package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ErailUnique {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepak\\Downloads\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver(options);


		driver.get("https://erail.in/");

		driver.manage().window().maximize();

		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();	
		driver.findElementByXPath("//input[@id='txtStationFrom']").clear();
		driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys("MSB", Keys.ENTER);

		driver.findElementByXPath("//input[@id='txtStationTo']").clear();
		driver.findElementByXPath("//input[@id='txtStationTo']").sendKeys("Bengaluru",Keys.ENTER);
		Thread.sleep(10000);

		List<WebElement> ele = driver.findElementsByXPath("//div[@id='divTrainsList']/table[1]//tr");

		List<String>list = new ArrayList<String>();
		for(int i=1;i<=ele.size();i++)
		{
			String cell = driver.findElementByXPath("(//div[@id='divTrainsList']//tr["+i+"]//a)[2]").getText();
			//System.out.println(cell);
			list.add(cell);
		}

		int a=list.size();
		System.out.println(a);

		HashSet<String> set = new HashSet<String>();

		set.addAll(list);
		int b=set.size();
		System.out.println(b);

		if(a==b)
		{
			System.out.println(" unique Values");    
		}
		else
		{
			System.out.println("No unique Values");    
		}
		
	
	}

}