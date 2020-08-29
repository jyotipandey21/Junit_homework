package Exam_Junit;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Three {
	WebDriver driver;

	/*
	 * @Test public void launch() throws InterruptedException {
	 * System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	 * driver = new ChromeDriver(); driver.get("http://techfios.com/test/101");
	 * 
	 * driver.manage().deleteAllCookies(); driver.manage().window();
	 * driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 * 
	 * WebElement
	 * remove=driver.findElement(By.cssSelector("div.controls>input[value='Remove']"
	 * )); remove.click(); if(!remove.isSelected()) {
	 * System.out.println("removed the selected"); } else {
	 * System.out.println("not selected"); } }
	 */
	@Test
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(" http://techfios.com/test/101");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[name=\"data\"]")).sendKeys("sunday1");
		driver.findElement(By.cssSelector("input[value=\"Add\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"data\"]")).sendKeys("Monday1");
		driver.findElement(By.cssSelector("input[value=\"Add\"]")).click();
		driver.findElement(By.cssSelector("input[name=\"data\"]")).sendKeys("Tuesday1");
		driver.findElement(By.cssSelector("input[name=\"data\"]")).click();
		
		WebElement toggle_Locator = driver.findElement(By.cssSelector("div.controls>input[type='checkbox']"));
		WebElement Remove_locator = driver.findElement(By.cssSelector("input[value=\"Remove\"]"));
		          toggle_Locator.click();
		

	if (toggle_Locator.isSelected()) {
		System.out.println( "Checking all data =" +"All datas are Toggled");
	} else {
		System.out.println("datas are not Toggled");
	}

	List<WebElement> datas = driver.findElements(By.xpath("//ul/li"));

	int num_datas = datas.size();
	System.out.println(num_datas);
	//Xpath== input[name="todo[0]"]
	String before_path = "input[name='todo[";
	String after_path = "]']";
	for (int i = 0; i < num_datas; i++) {
		String name = driver.findElement(By.cssSelector("input[name='todo[" + i + "]']")).getText();
		System.out.println(name);

		if (name.equalsIgnoreCase(name)) {
			Remove_locator.click();
			System.out.println("name is present");
		} else {
			System.out.println("names are not available");
		}
		if (name.isEmpty()) {
			System.out.println("remove is validated");
		} else {
			System.out.println("invalid method");
		}

	}
}

}

