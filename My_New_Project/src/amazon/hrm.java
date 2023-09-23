package amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://orangehrm.qedgetech.com");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys("suresh");
	driver.findElement(By.id("lastName")).sendKeys("rar");
    String empid =	driver.findElement(By.id("employeeId")).getAttribute("value");
	driver.findElement(By.id("btnSave")).click();
	driver.findElement(By.linkText("Employee List")).click();
	driver.findElement(By.id("empsearch_id")).sendKeys(empid);
	driver.findElement(By.id("searchBtn")).click();
	 WebElement tb= driver.findElement(By.id("resultTable"));
     List<WebElement> row = driver.findElements(By.tagName("tr"));
    
     for(int i=1;i<=row.size();i++) {
    	 List<WebElement> cols = row.get(i).findElements(By.tagName("td"));
    	 if(cols.get(i).getText().equals(empid)) {
    		 System.out.println("test pass");
    	 }else {
    		 System.out.println("Test Fail");
    	 }
     }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
