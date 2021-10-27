import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FirstAutomation {

public static void main(String [] args) {
	
		
		try {
			//Chrome driver path
			String chromeDriver = "/Users/obaidnasary/Downloads/Softwares/Selenium/chromedriver";
			
			//Setting the Chrome driver path
			System.setProperty("webdriver.chrome.driver", chromeDriver);
			
			//Creating object
			ChromeDriver driverOb = new ChromeDriver();
			
			
			String URL = "http://automationpractice.com/index.php";
			
			//To wait for an element to be loaded for a maximum of 10 seconds
			driverOb.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Navigation to the URL
			driverOb.navigate().to(URL);

			//To maximize the page
			driverOb.manage().window().maximize();
			
			
			driverOb.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
			
			driverOb.findElement(By.id("email_create")).sendKeys("obaidnasary@khanjan.com");
			
			driverOb.findElement(By.xpath("//button[@id='SubmitCreate']/span")).click();
			
			driverOb.findElement(By.id("customer_firstname")).sendKeys("Wali");
			
			driverOb.findElement(By.id("customer_lastname")).sendKeys("Jan");
			
			driverOb.findElement(By.id("passwd")).sendKeys("Walijan1213");
			
			WebElement days = driverOb.findElement(By.id("days"));
			Select selectDay = new Select(days);
			selectDay.selectByValue("3");
			
			WebElement months = driverOb.findElement(By.id("months"));
			Select selectMonth = new Select(months);
			selectMonth.selectByValue("3");
			
			WebElement years = driverOb.findElement(By.id("years"));
			Select selectYears = new Select(years);
			selectYears.selectByValue("1998");
			
			driverOb.findElement(By.id("address1")).sendKeys("Sauletekio ");
			
			driverOb.findElement(By.id("city")).sendKeys("New York");
			
			WebElement state = driverOb.findElement(By.id("id_state"));
			Select selectState = new Select(state);
			selectState.selectByValue("32");
			
			driverOb.findElement(By.id("postcode")).sendKeys("26737");
			
			driverOb.findElement(By.id("phone_mobile")).sendKeys("87384788748");
			
			driverOb.findElement(By.id("alias")).sendKeys("NOwehere");
			
			driverOb.findElement(By.name("submitAccount")).click();
			
			String userText=driverOb.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();

			  // Validate that user has created
			  if(userText.contains("Jan")) {
			   System.out.println("User Verified,Test case Passed");
			  }
			  else {
			   System.out.println("User Verification Failed,Test case Failed");
			  }


		}catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
	}
	
}
