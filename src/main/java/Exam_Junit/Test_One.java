package Exam_Junit;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_One {
	WebDriver driver;

	@Test
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://techfios.com/test/101");

		driver.manage().deleteAllCookies();
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebElement varify =	 driver.findElement(By.cssSelector("div.controls>input[type='checkbox']"));
		varify.click();
		if (varify.isSelected()) {
			System.out.println(" toggle box selected");
		} else {
			System.out.println("toggle box not selected");
		}

	}
}
